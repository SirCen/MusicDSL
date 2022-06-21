
/******************************************************************************
 * ARTTest.java
 *
 * This is a test harness for ART generated Java parsers
 *
 * (c) Adrian Johnstone 2013-17
 *****************************************************************************/
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.util.text.ARTText;
import uk.ac.rhul.cs.csle.art.util.text.ARTTextHandlerConsole;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDT;
import uk.ac.rhul.cs.csle.art.v3.alg.gll.support.ARTGLLRDTVertex;

public class ARTTestCore {
  static ARTText text = new ARTText(new ARTTextHandlerConsole());

  static String getStringArgument(String arg, String argumentName) {
    return arg.substring(argumentName.length() + 2, arg.length() - 1);
  }

  public void core(String[] args) throws ARTException, FileNotFoundException {
    String inputFilename = null;
    ARTGeneratedParser parser = new ARTGeneratedParser(new ARTGeneratedLexer());

    boolean phaseAG = false, showAll = false;

    if (args.length == 0) ARTText.printFatal("Usage - java ARTTest argument1 argument2...\n");

    for (String arg : args)
      if (arg.charAt(0) == '+') {
        if (arg.startsWith("+statistics"))
          parser.ARTSTATISTICS = true;
        else if (arg.startsWith("+lexDead"))
          parser.artLexDead = true;
        else if (arg.startsWith("+lexLongestWithin"))
          parser.artLexLongestWithin = true;
        else if (arg.startsWith("+lexLongestAcross"))
          parser.artLexLongestAcross = true;
        else if (arg.startsWith("+lexPriority"))
          parser.artLexPriority = true;
        else if (arg.startsWith("+trace"))
          parser.ARTTRACE = true;
        else if (arg.startsWith("+showAll"))
          showAll = true;
        else if (arg.startsWith("+phaseAG"))
          phaseAG = true;
        else if (arg.startsWith("+inputFile:"))
          inputFilename = getStringArgument(arg, "inputFile:");
        else if (arg.startsWith("+inputFileIfExists:")) {
          if (Files.isRegularFile(Paths.get(getStringArgument(arg, "inputFileIfExists:"))) && inputFilename == null)
            inputFilename = getStringArgument(arg, "inputFileIfExists:");
        } else if (arg.startsWith("+gll") || arg.startsWith("+gllGeneratorPool") || arg.startsWith("+gllClusteredGeneratorPool") || arg.startsWith("+mgll")
            || arg.startsWith("+mgllGeneratorPool") || arg.startsWith("+cnpGeneratorPool") || arg.startsWith("+FIFODescriptors")
            || arg.startsWith("+predictivePops"))
          ; // absorb unused options quietly
        else
          ARTText.printFatal("Unknown command line argument " + arg + "\n");

      } else
        inputFilename = arg;

    if (inputFilename == null) ARTText.printFatal("No input file specified");

    try {
      parser.artParse(ARTText.readFile(inputFilename));
    } catch (ARTException e) {
      text.println(e.getMessage());
    }

    if (parser.artInadmissable) {
      text.println("** Grammar inadmissable");
      parser.artLog(inputFilename, false);
      return;
    }

    if (parser.ARTSTATISTICS) {
      parser.artcomputeStatistics();
      text.println("Generated parser statistics\n");
      parser.artLog(inputFilename, true);
      parser.artLog(inputFilename, false);
    }
    if (parser.artIsInLanguage)
      text.println("** Accept");
    else {
      text.println("** Reject");
      return;
    }

    // parser.artDisambiguateRightmost();
    parser.artDerivationSelectFirst();

    if (phaseAG) {
      ARTGLLRDT tree = parser.artEvaluator();

      if (showAll) {
        // if (parser.tweSet != null) parser.tweSet.printTWESet();
        // parser.artRenderSPPF("dtCore.dot", parser.artRenderKindDerivation);
        // parser.artRenderSPPF("dtFull.dot", parser.artRenderKindDerivationFull);
        // parser.artRenderSPPF("gss.dot", parser.artRenderKindGSS);
        // parser.artRenderSPPF("sppfCore.dot", parser.artRenderKindSPPFFull, tweSet);
        // parser.artRenderSPPF("sgppfFull.dot", parser.artRenderKindSPPFFull);
        // parser.artDisambiguateWithinSPPF(true, false, false, true);
        // text.print("\n");
        if (tree != null) {
          tree.printDot("rdt.dot");
          PrintWriter pw = new PrintWriter("term.txt");
          pw.println(treeToTermString(tree));
          pw.close();
        }

        visitTree(tree);
      }

      // Use new term library to create an ITerm from a derivation
      // ITerms iTerms = new ITermsLowLevelAPI(10, 5);
      // System.out.println("** New: " + iTerms.toString(parser.artDerivationAsTerm(iTerms)));
    }
  }

  static void visitTree(ARTGLLRDT tree) {
    visitTree(tree, tree.getRoot(), 0);
  }

  static void visitTree(ARTGLLRDT tree, ARTGLLRDTVertex vertex, int level) {
    if (vertex == null) return;
    // Preorder printout
    for (int i = 0; i < level; i++)
      text.print("  ");
    text.printf("%d: %s%n", vertex.getKey(), vertex.getPayload().toString(tree));
    visitTree(tree, vertex.getChild(), level + 1);
    visitTree(tree, vertex.getSibling(), level);
  }

  static String treeToTermString(ARTGLLRDT tree) {
    StringBuilder sb = new StringBuilder();
    treeToTermStringRec(sb, tree, tree.getRoot());
    return sb.toString();
  }

  static void treeToTermStringRec(StringBuilder sb, ARTGLLRDT tree, ARTGLLRDTVertex vertex) {
    if (vertex == null) return;
    // Preorder printout
    sb.append(vertex.getPayload().toStringNoAttributes(tree));
    if (vertex.getChild() != null) {
      sb.append("(");
      treeToTermStringRec(sb, tree, vertex.getChild());
      sb.append(")");
    }
    if (vertex.getSibling() != null) {
      sb.append(", ");
      treeToTermStringRec(sb, tree, vertex.getSibling());
    }
  }
}
