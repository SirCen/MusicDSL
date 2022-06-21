package uk.ac.rhul.cs.csle.art;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import uk.ac.rhul.cs.csle.art.term.ITerms;

class ARTModule {
  /**
   *
   */
  final ITerms iTerms;
  final int nameIndex;
  final int eos = 0;
  int epsilon;
  int defaultStartStringRewriteRule = 0; // This is initialised by the first string rewrite rule encountered
  int slotCount;

  final Set<Integer> terminals = new HashSet<>();
  final Set<Integer> nonterminals = new HashSet<>();
  final Set<Integer> paraterminals = new HashSet<>();
  final Map<Integer, List<Integer>> stringRewriteRules = new LinkedHashMap<>(); // Use LinkedHashMap to maintain ordering
  final Map<Integer, Map<Integer, List<Integer>>> termRewriteRules = new LinkedHashMap<>();
  final Map<Integer, List<Integer>> attributeEquations = new LinkedHashMap<>();
  final Map<Integer, Integer> ragRewriteRules = new LinkedHashMap<>();
  final Map<Integer, List<Integer>> directives = new LinkedHashMap<>();
  final List<Integer> tryList = new LinkedList<>();

  ARTModule(ITerms iterms, int name) {
    this.iTerms = iterms;
    this.nameIndex = name;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("!module " + iTerms.getString(nameIndex) + "\n");
    sb.append("** terminals\n");
    toStringSetOfTermIndex(sb, terminals);
    sb.append("** nonterminals\n");
    toStringSetOfTermIndex(sb, nonterminals);
    sb.append("** string rewrite rules\n");
    toStringMapOfIntegerAndListOfInteger(sb, stringRewriteRules);
    sb.append("** term rewrite rules\n");
    for (Integer r : termRewriteRules.keySet()) {
      sb.append("** relation " + iTerms.toString(r) + "\n");
      toStringMapOfIntegerAndListOfInteger(sb, termRewriteRules.get(r));
    }
    sb.append("** RAG rewrite rules\n");
    toStringMapTermIndexToTermIndex(sb, ragRewriteRules);
    sb.append("** attribute equations\n");
    toStringMapOfIntegerAndListOfInteger(sb, attributeEquations);
    sb.append("** directives\n");
    toStringMapOfIntegerAndListOfInteger(sb, directives);
    sb.append("** try list\n");
    for (Integer l : tryList)
      sb.append(iTerms.toString(l) + "\n");

    return sb.toString();
  }

  private void toStringSetOfTermIndex(StringBuilder sb, Set<Integer> termSet) {
    for (Integer i : termSet)
      sb.append(iTerms.toString(i) + "\n");
  }

  private void toStringMapOfIntegerAndListOfInteger(StringBuilder sb, Map<Integer, List<Integer>> map) {
    for (Integer i : map.keySet())
      for (Integer p : map.get(i))
        sb.append(iTerms.getString(i) + ": " + iTerms.toString(p) + "\n");
  }

  private void toStringMapTermIndexToTermIndex(StringBuilder sb, Map<Integer, Integer> map) {
    for (Integer i : map.keySet()) {
      sb.append(iTerms.getString(i) + ": ");
      sb.append(" " + iTerms.toString(map.get(i)) + "\n");
    }
  }
}