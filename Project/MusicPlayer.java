import java.util.HashMap;

import javax.sound.midi.*;

public class MusicPlayer {
  private Synthesizer synthesizer;
  private Sequencer sequencer;
  private MidiChannel[] channels;
  private MidiChannel midiChannel;
  private int defaultOctave = 5;
  private int defaultVelocity = 50;
  private int bpm;
  private double bps;
  private double beatPeriod;
  private double beatRatio = 0.9;
  private int beatSoundDelay = (int) (1000.0 * beatRatio / bps);
  private int beatSilenceDelay = (int) (1000.0 * (1.0 - beatRatio) / bps);
  private int instrument;
  private int volume;
  public HashMap<String, Integer> instrumentNames = new HashMap<String, Integer>();
  private static final String[] instrumentNamesArr = {
    /*   0: */"Acoustic Grand Piano",/*   1: */ "Bright Acoustic Piano",/*   2: */"Electric Grand Piano",
		/*   3: */     "Honky-tonk Piano",/*   4: */"Electric Piano 1",/*   5: */"Electric Piano 2",
		/*   6: */     "Harpsichord",/*   7: */"Clavi",/*   8: */"Celesta",/*   9: */"Glockenspiel",
		/*  10: */     "Music Box",/*  11: */"Vibraphone",/*  12: */"Marimba",/*  13: */ "Xylophone",
		/*  14: */     "Tubular Bells",/*  15: */"Dulcimer",/*  16: */"Drawbar Organ",/*  17: */"Percussive Organ",
		/*  18: */     "Rock Organ",/*  19: */"Church Organ",/*  20: */"Reed Organ",/*  21: */"Accordion",
		/*  22: */     "Harmonica",/*  23: */"Tango Accordion",/*  24: */"Acoustic Guitar (nylon)",/*  25: */"Acoustic Guitar (steel)",
		/*  26: */     "Electric Guitar (jazz)",/*  27: */"Electric Guitar (clean)",/*  28: */"Electric Guitar (muted)",
		/*  29: */     "Overdriven Guitar",/*  30: */"Distortion Guitar",/*  31: */"Guitar harmonics",/*  32: */"Acoustic Bass",
		/*  33: */     "Electric Bass (finger)",/*  34: */"Electric Bass (pick)",/*  35: */"Fretless Bass",/*  36: */"Slap Bass 1",
		/*  37: */     "Slap Bass 2",/*  38: */"Synth Bass 1",/*  39: */"Synth Bass 2 10",/*  40: */"Violin",
		/*  41: */     "Viola",/*  42: */"Cello",/*  43: */"Contrabass",/*  44: */"Tremolo Strings",/*  45: */"Pizzicato Strings",
		/*  46: */     "Orchestral Harp",/*  47: */"Timpani",/*  48: */"String Ensemble 1",/*  49: */"String Ensemble 2",
		/*  50: */     "SynthStrings 1",/*  51: */"SynthStrings 2",/*  52: */"Choir Aahs",/*  53: */"Voice Oohs",
		/*  54: */     "Synth Voice",/*  55: */"Orchestra Hit",/*  56: */"Trumpet",/*  57: */"Trombone",
		/*  58: */     "Tuba",/*  59: */"Muted Trumpet",/*  60: */"French Horn",/*  61: */"Brass Section",/*  62: */"SynthBrass 1",
		/*  63: */     "SynthBrass 2",/*  64: */"Soprano Sax",/*  65: */"Alto Sax",/*  66: */"Tenor Sax",
		/*  67: */     "Baritone Sax",/*  68: */"Oboe",/*  69: */"English Horn",/*  70: */"Bassoon",/*  71: */"Clarinet",
		/*  72: */     "Piccolo",/*  73: */"Flute",/*  74: */"Recorder",/*  75: */"Pan Flute",/*  76: */"Blown Bottle",
		/*  77: */     "Shakuhachi",/*  78: */"Whistle",/*  79: */"Ocarina",/*  80: */"Lead 1 (square)",/*  81: */ "Lead 2 (sawtooth)",
		/*  82: */     "Lead 3 (calliope)",/*  83: */"Lead 4 (chiff)",/*  84: */"Lead 5 (charang)",/*  85: */"Lead 6 (voice)",
		/*  86: */     "Lead 7 (fifths)",/*  87: */"Lead 8 (bass + lead)",/*  88: */"Pad 1 (new age)",/*  89: */"Pad 2 (warm)",
		/*  90: */     "Pad 3 (polysynth)",/*  91: */"Pad 4 (choir)",/*  92: */"Pad 5 (bowed)",/*  93: */"Pad 6 (metallic)",
		/*  94: */     "Pad 7 (halo)",/*  95: */"Pad 8 (sweep)",/*  96: */"FX 1 (rain)",/*  97: */"FX 2 (soundtrack)",
		/*  98: */     "FX 3 (crystal)",/*  99: */"FX 4 (atmosphere)",/* 100: */"FX 5 (brightness)",/* 101: */"FX 6 (goblins)",
		/* 102: */     "FX 7 (echoes)",/* 103: */"FX 8 (sci-fi)",/* 104: */"Sitar",/* 105: */"Banjo",
		/* 106: */     "Shamisen",/* 107: */"Koto",/* 108: */"Kalimba",/* 109: */"Bag pipe",/* 110: */"Fiddle",
		/* 111: */     "Shanai",/* 112: */"Tinkle Bell",/* 113: */"Agogo",/* 114: */"Steel Drums",/* 115: */"Woodblock",
		/* 116: */     "Taiko Drum",/* 117: */"Melodic Tom",/* 118: */"Synth Drum",/* 119: */"Reverse Cymbal",
		/* 120: */     "Guitar Fret Noise",/* 121: */"Breath Noise",/* 122: */"Seashore",/* 123: */"Bird Tweet",
		/* 124: */     "Telephone Ring",/* 125: */"Helicopter",/* 126: */"Applause",/* 127: */"Gunshot"
  };
  
  MusicPlayer() {
    try {
      System.out.print(MidiSystem.getMidiDeviceInfo());
      synthesizer = MidiSystem.getSynthesizer();
      sequencer = MidiSystem.getSequencer();
      sequencer.open();
      synthesizer.open();
      channels = synthesizer.getChannels();
      midiChannel = channels[0];
      midiChannel.programChange(0);
    } catch (Exception e) {
      System.err.println("miniMusicPlayer exception: " + e.getMessage());
      System.exit(1);
    }
    setBeatRatio(0.9);
    setBpm(100);
    setDefaultVelocity(50);
    setInstrumentNames();
    instrument = instrumentNames.get("Acoustic Grand Piano");
    rest(2);
    setSequencer();
    setVolume(80);
  }
  //play two tracks at same time.
  public void setSequencer() {
    Sequence sequence = null;
    try {
      sequence = new Sequence(Sequence.PPQ, 4);
      sequencer.setSequence(sequence);
    } catch (Exception e) { e.printStackTrace();}
    sequencer.start();
    sequencer.setTempoInBPM(bpm);
  }

  public int getDefaultOctave() {
    return defaultOctave;
  }

  public void setDefaultOctave(int defaultOctave) {
    this.defaultOctave = defaultOctave;
  }

  public int getDefaultVelocity() {
    return defaultVelocity;
  }

  public void setDefaultVelocity(int defaultVelocity) {
    this.defaultVelocity = defaultVelocity;
  }

  public int getBpm() {
    return bpm;
  }

  public void setBpm(int bpm) {
    this.bpm = bpm;
    bps = bpm / 60.0;
    beatPeriod = 1000.0 / bps;
    beatSoundDelay = (int) (beatRatio * beatPeriod);
    beatSilenceDelay = (int) ((1.0 - beatRatio) * beatPeriod);
  }

  public void setBeatRatio(double beatRatio) {
    this.beatRatio = beatRatio;
    beatSoundDelay = (int) (beatRatio * beatPeriod);
    beatSilenceDelay = (int) ((1.0 - beatRatio) * beatPeriod);
  }

  public void setVolume(int volume) {
    if (volume < 0 || volume > 127)
			throw new IllegalArgumentException("Midi volume level must be in the range 0 to 127");
    this.volume = volume;
  }

  public int getVolume() {
    return volume;
  }

  public void setInstrumentNames() {
    int counter = 0;
    for (String i : instrumentNamesArr) {
      instrumentNames.put(i, counter);
      counter += 1;
    }
  }
  public int getNumberOfInstrument(String instrumentName) {
    if (instrumentNames.get(instrumentName)==null) {
      System.out.println("Instrument not found, using default Instrument");
      return 0;
    } else {
      return instrumentNames.get(instrumentName);
    }
  }
  public void setInstrument(int instrumentNumber, int channel) {
    if (instrumentNumber < 0 || instrumentNumber > 127) {
			throw new IllegalArgumentException("Midi instrument numbers must be in the range 0 to 127");
    }
    if (channel < 0 || channel > 16) {
      throw new IllegalArgumentException("Midi channel numbers must be in the range 0 to 16");
    }
    channels[channel].programChange(instrumentNumber);
		this.instrument = instrumentNumber;
  }

  public void setInstrument(String instrumentName, int channel) {
    if (channel < 0 || channel > 16) {
      throw new IllegalArgumentException("Midi channel numbers must be in the range 0 to 16");
    }
    int instrumentNumber = getNumberOfInstrument(instrumentName);
    channels[channel].programChange(instrumentNumber);
		instrument = instrumentNumber;
  }

  public void setInstrument(String instrumentName) {
    int instrumentNumber = getNumberOfInstrument(instrumentName);
    for (int i =0; i < 16; i++) {
      channels[i].programChange(instrumentNumber);
    }
		instrument = instrumentNumber;
  }

  public void setInstrument(int instrumentNumber) {
    if (instrumentNumber < 0 || instrumentNumber > 127) {
			throw new IllegalArgumentException("Midi instrument numbers must be in the range 0 to 127");
    }
    for (int i =0; i < 16; i++) {
      channels[i].programChange(instrumentNumber);
    }
		instrument = instrumentNumber;
  }

  public int getInstrument() {
    return instrument;
  }
 


  int noteNameToMidiKey(String n, int octave) {
 // @formatter:off
 int key = octave * 12 + 
        ( n.equals("C") ? 0
        : n.equals("C#") ? 1
        : n.equals("Db") ? 1
        : n.equals("D") ? 2
        : n.equals("D#") ? 3
        : n.equals("Eb") ? 3
        : n.equals("E") ? 4
        : n.equals("F") ? 5
        : n.equals("F#") ? 6
        : n.equals("Gb") ? 6
        : n.equals("G") ? 7
        : n.equals("G#") ? 8
        : n.equals("Ab") ? 8
        : n.equals("A") ? 9            
        : n.equals("A#") ? 10 
        : n.equals("Bb") ? 10 
        : n.equals("B") ? 11 
        : -1);
 // @formatter:on   

    if (key < 0 || key > 127) {
      System.err.println("miniMusicPlayer exception: attempt to access out of range MIDI key " + n + octave);
      System.exit(1);
    }
    return key;
  }

  // Silence
  public void rest(int beats) {
    try {
      Thread.sleep((long) (beats * beatPeriod));
    } catch (InterruptedException e) {
      /* ignore interruptedException */ }
  }

  // Single notes
  void play(int k) {
    try {
      channels[0].noteOn(k, defaultVelocity);
      Thread.sleep(beatSoundDelay);
      channels[0].noteOn(k, 0);
      Thread.sleep(beatSilenceDelay);
    } catch (InterruptedException e) {
      /* ignore interruptedException */ }
  }

  public void repeatNote(String k, int time) {
    try {
      int note = noteNameToMidiKey(k, defaultOctave);
      int i = 0;
      while (i < time) {
        channels[0].noteOn(note, defaultVelocity);
        Thread.sleep((beatSoundDelay));
        //channels[i].noteOn(note, 0);
        i += 1;
      }
    } catch (InterruptedException e) {
      /*Ignore Exception */
    }
  }

  void mix(String k, String l) {
    try{
      if (k.length() == l.length()) {
        k = k.replaceAll("\\s+","");
        l = l.replaceAll("\\s+","");
        for (int i = 0; i < k.length(); i++) {
          String note = String.valueOf(k.charAt(i));
          String note2 = String.valueOf(l.charAt(i));
          channels[0].noteOn(noteNameToMidiKey(note, defaultOctave), defaultVelocity);
          channels[1].noteOn(noteNameToMidiKey(note2, defaultOctave), defaultVelocity);
          Thread.sleep(beatSoundDelay);
          channels[0].noteOn(noteNameToMidiKey(note, defaultOctave), 0);
          channels[1].noteOn(noteNameToMidiKey(note2, defaultOctave), 0);
          Thread.sleep(beatSilenceDelay);
        }
        
      } 
      else {
        System.err.println("Java System Error, melodies of different sizes: " + k.length() + "," + l.length());
      }
    } catch (InterruptedException e) {
    /* ignore interruptedException */ }
  }
  //needs to be worked on
  void backTrack(String k, int l) {
    k = k.replaceAll("\s+","");
    String[] noteArr = k.split(" ");
    try{
      for (int j = 0; j < noteArr.length; j++) {
        channels[l].noteOn(noteNameToMidiKey(noteArr[j], defaultOctave), defaultVelocity);
        Thread.sleep(beatSoundDelay);
        channels[l].noteOn(noteNameToMidiKey(noteArr[j], defaultOctave), 0);
        Thread.sleep(beatSilenceDelay);
      }
    } catch (InterruptedException e) {
      /* ignore interruptedException */ 
    }
  }

  void play(String n) {
    play(noteNameToMidiKey(n, defaultOctave));
  }

  void play(String n, int octave) {
    play(noteNameToMidiKey(n, octave));
  }
  void play(String[] k) {
    try {
      for (int i = 0; i < k.length; i++){
        switch (k[i]){
          case ".": 
            rest(1);
            break;
          case "..": 
            rest(2);
            break;
          case "...": 
            rest(3);
            break;
          case "....": 
            rest(4);
            break;
          default: 
            play(noteNameToMidiKey(String.valueOf(k[i]), defaultOctave));
            break;
        }
      }
    } catch (Exception e) {
      /* ignore interruptedException */
    }
  }
  // Arrays of notes
  void play(int[] k) {
    try {
      for (int i = 0; i < k.length; i++)
        channels[1].noteOn(k[i], defaultVelocity);
      Thread.sleep(beatSoundDelay);
      for (int i = 0; i < k.length; i++)
        channels[1].noteOn(k[i], 0);
      Thread.sleep(beatSilenceDelay);
    } catch (InterruptedException e) {
      /* ignore interruptedException */ }
  }

  private void playSequentially(int[] k) {
    try {
      for (int i = 0; i < k.length; i++) {
        channels[i].noteOn(k[i], defaultVelocity);
        Thread.sleep(beatSoundDelay);
        channels[i].noteOn(k[i], 0);
        Thread.sleep(beatSilenceDelay);
      }
    } catch (InterruptedException e) {
      /* ignore interruptedException */ }
  }

  // Scales
  void playScale(String n, Scale s) {
    playScale(noteNameToMidiKey(n, defaultOctave), s);
  }

  void playScale(String n, int octave, Scale s) {
    playScale(noteNameToMidiKey(n, octave), s);
  }

  void playScale(int k, Scale s) {
    int[] keys;
    switch (s) {
    case CHROMATIC:
      keys = new int[] { k, k + 1, k + 2, k + 3, k + 4, k + 5, k + 6, k + 7, k + 8, k + 9, k + 10, k + 11, k + 12 };
      break;

    case MAJOR: // TTSTTTS
      keys = new int[] { k, k + 2, k + 4, k + 5, k + 7, k + 9, k + 11, k + 12 };
      break;

    case MINOR_NATURAL: // TSTTSTT
      keys = new int[] { k, k + 2, k + 3, k + 5, k + 7, k + 8, k + 10, k + 12 };
      break;
    case MINOR_HARMONIC: // TSTTS3S
      keys = new int[] { k, k + 2, k + 3, k + 5, k + 7, k + 8, k + 11, k + 12 };
      break;
    case MINOR_MELODIC_ASCENDING: // TSTTS3S - harmonic with with sixth sharpened
      keys = new int[] { k, k + 2, k + 3, k + 5, k + 7, k + 9, k + 11, k + 12 };
      break;
    case MINOR_MELODIC_DESCENDING: // TSTTS3S - harmonic with seventh flattened making it the same as the natural minor
      keys = new int[] { k + 12, k + 10, k + 8, k + 7, k + 5, k + 3, k + 2, k };
      break;

    default:
      keys = new int[] { k };
      break;
    }
    playSequentially(keys);
  }

  void playArpeggio(String n, Scale s) {
    playArpeggio(noteNameToMidiKey(n, defaultOctave), s);
  }

  void playArpeggio(int k, Scale s) {
    int[] keys;
    switch (s) {

    case MAJOR: // TTSTTTS
      keys = new int[] { k, k + 2, k + 4, k + 7 };
      break;
    case MINOR_NATURAL: // TSTTSTT
      keys = new int[] { k,  k + 3,  k + 7,  k + 10, k + 12 };
      break;
    case MAJOR_DESCEND: 
      keys = new int[] {k+7, k+4, k+2, k};
      break;
    default:
      keys = new int[] { k };
      break;
    }
    playSequentially(keys);
  }

  // Programmed chords
  void playChord(String n, Chord type) {
    playChord(noteNameToMidiKey(n, defaultOctave), type);
  }

  void playChord(String n, int octave, Chord type) {
    playChord(noteNameToMidiKey(n, octave), type);
  }

  private void playChord(int k, Chord type) {
    int[] keys;
    switch (type) {
    case MAJOR:
      keys = new int[] { k, k + 4, k + 7 };
      break;
    case MAJOR7:
      keys = new int[] { k, k + 4, k + 7, k + 11 };
      break;
    case MINOR:
      keys = new int[] { k, k + 3, k + 7 };
      break;
    case MINOR7:
      keys = new int[] { k, k + 4, k + 7 };
      break;
    default:
      keys = new int[] { k };
      break;
    }
    play(keys);
  }

  public void tune() {
    int base = 47;
    play(base + 14);
    play(base + 12);
    play(base + 11);
    play(base + 7);
    play(base + 5);
    play(base + 7);
    play(base + 2);
    rest(2);
  }

  public void tuneChordMajor() {
    int base = noteNameToMidiKey("C", 5);
    playChord(base + 14, Chord.MAJOR);
    playChord(base + 12, Chord.MAJOR);
    playChord(base + 11, Chord.MAJOR);
    playChord(base + 7, Chord.MAJOR);
    playChord(base + 5, Chord.MAJOR);
    playChord(base + 7, Chord.MAJOR);
    playChord(base + 2, Chord.MAJOR);
  }

  public void tuneChordMinor() {
    int base = noteNameToMidiKey("C", 5);
    playChord(base + 14, Chord.MINOR);
    playChord(base + 12, Chord.MINOR);
    playChord(base + 11, Chord.MINOR);
    playChord(base + 7, Chord.MINOR);
    playChord(base + 5, Chord.MINOR);
    playChord(base + 7, Chord.MINOR);
    playChord(base + 2, Chord.MINOR);
  }

  void close() {
    rest(3);
    synthesizer.close();
  }

  public static void main(String[] args) {
    System.err.println("miniMusicPlayer test routine");
    MusicPlayer mp = new MusicPlayer();
    String[] k = {"A", "."};
    String[] l = {"F#", "G", "A#"};
    //mp.mix(k, l);
    // mp.playScale("C", Scale.CHROMATIC);
    // mp.rest(2);
    // String note = "C";
    // int octave = 6;
    // mp.play(note, octave);
    // mp.rest(2);
    // mp.playScale("C", Scale.MAJOR);
    // mp.rest(2);
    // mp.playScale("C", Scale.MINOR_NATURAL);
    // mp.rest(2);
    // mp.playScale("C", Scale.MINOR_HARMONIC);
    // mp.rest(2);
    // mp.playScale("C", Scale.MINOR_MELODIC_ASCENDING);
    // mp.playScale("C", Scale.MINOR_MELODIC_DESCENDING);
    // mp.rest(2);
    // mp.playChord("C", Chord.MAJOR);
    // mp.rest(2);
    // mp.playChord("C", Chord.MINOR);
    // mp.rest(2);
    // mp.tune();
    // mp.rest(2);
    // mp.tuneChordMajor();
    // mp.rest(2);
    // mp.tuneChordMinor();
    // mp.rest(2);
    // mp.close();
  }
}
