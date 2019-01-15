//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

public class Instrumentalist implements Performer {
  public Instrumentalist() {}
  public void perform() throws PerformanceException {
    System.out.print("Playing " + song + " : ");
    getInstrument().play(); // Используется внедряемый метод
  }
  // getInstrument()
  private String song;
  public void setSong(String song) {
    this.song = song;
  }

  private Instrument instrument;

  public Instrument getInstrument() {
    return instrument;
  }

//  public void setInstrument(Instrument instrument) {
//    this.instrument = instrument;
//  }


  public Instrumentalist(Instrument instrument) {
    this.song = song;
    this.instrument = instrument;
  }
}
//<end id="instrumentalist_java" />
