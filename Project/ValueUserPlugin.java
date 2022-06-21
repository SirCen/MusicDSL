import uk.ac.rhul.cs.csle.art.util.ARTException;
import uk.ac.rhul.cs.csle.art.value.*; 


public class ValueUserPlugin implements ValueUserPluginInterface {
  MusicPlayer mp = new MusicPlayer();

  @Override
  public String name() {
      return "Chris' Value User Plugin";
  }

  @Override
  public Value user(Value... args) throws ARTException {
    switch(args[0].value().toString()) {
      case "1": 
        mp.repeatNote(args[1].value().toString(), Integer.parseInt(args[2].value().toString()));
        break;
      case "2":
        String note = args[1].value().toString().substring( 1, args[1].value().toString().length() - 1 );
        mp.play(note);
        break;
      case "3":
        String[] notes = args[1].value().toString().split(" ");
        mp.play(notes);
        break;
      case "4":
        String bpmInput = args[1].value().toString();
        mp.setBpm(Integer.parseInt(bpmInput));
        break;
      case "5":
        int instrumentNumber = Integer.parseInt(args[1].value().toString());
        int channel = Integer.parseInt(args[2].value().toString());
        mp.setInstrument(instrumentNumber, channel);
        break;
      case "6":
        String instrumentName = args[1].value().toString();
        int channel1 = Integer.parseInt(args[2].value().toString());
        mp.setInstrument(instrumentName, channel1);
        break;
      case "7":
        String restCount = args[1].value().toString();
        mp.rest(Integer.parseInt(restCount));
        break;
      case "8":
        int defaultOctave = Integer.parseInt(args[1].value().toString());
        mp.setDefaultOctave(defaultOctave);
        break;
      case "9":
        mp.mix(args[1].value().toString(), args[2].value().toString());
        break;
      case "10":
      //need to work on
        mp.backTrack(args[1].value().toString(), Integer.parseInt(args[2].value().toString()));
      case "11":
        mp.setVolume(Integer.parseInt(args[1].value().toString()));
        break;
      case "12":
        Scale s = Scale.valueOf(args[2].value().toString());
        mp.playScale(args[1].value().toString(), s);
        break;
      case "13":
        Scale sArpeggio = Scale.valueOf(args[2].value().toString());
        mp.playArpeggio(args[1].value().toString(), sArpeggio);
        break;
      case "14":
        System.out.println(args[1].value().toString());
        break;
      case "15":
        String instrumentName1 = args[1].value().toString();
        mp.setInstrument(instrumentName1);
        break;
      case "16":
        int instrumentNumber1 = Integer.parseInt(args[1].value().toString());
        mp.setInstrument(instrumentNumber1);
        break;
      case "17":
        double beatRatio = Double.parseDouble(args[1].value().toString());
        mp.setBeatRatio(beatRatio);
        break;
    }
    return new __string("Terminated", args[0].iTerms());
  }
}
