# MusicDSL
A Music DSL made in Year 3 of University using Java Midi as a backbone.

For Documentation on the project please read [Docs.pdf](https://github.com/SirCen/MusicDSL/blob/main/Docs.pdf)


# Quick Start Guide:
  
  * To compile the java files, use the command:
  
     javac -cp ../art.jar *.java
     
  * To parse the eSOS rules use the command:
  
     esos eSOSRules.art
     
  * To parse the Attribute Grammar:
  
     parse AttributeGrammar

# Examples and Tests
   This test will show a majority of the functionality of the language, including all of the DSL functionality.
   ```
    a := 1 + 1;
    b := a + 1;
    print(a);
    print(b);
    print("hello");
    print("hello","hi");
    print(13);
    bpm 180;
    octave 5;
    beatRatio 0.9;
    instrument(114,1);
    melody t {"C . C B C . C B C . D D . F F . E C D . B G E C D . G C F . E E . D D . C B"}
    play t;
    instrument 10;
    volume 20;
    repeatNote("A B", 3);
    melody c {"A A A A A A A A"}
    melody d {"A B C D E F G F"}
    mix(c, d);
    volume 80;
    instrument ("Acoustic Grand Piano",0);
    play t;
    instrument "Banjo";
    play t;
    scale ("C","MAJOR");
    arpeggio ("C", "MAJOR");
   ```
# Expected Output after test:
```
    [Ljavax.sound.midi.MidiDevice$Info;@4bf558aaAttached to ValueUserPlugin : Chris' Value User
    Plugin
    [Ljavax.sound.midi.MidiDevice$Info;@78aab498** Accept
    2
    3
    hello
    hello
    hi
    13
    Variables at end of program: {a=2, b=3}
```
