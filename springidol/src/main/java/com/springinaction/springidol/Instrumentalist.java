//<start id="instrumentalist_java" /> 
package com.springinaction.springidol;

public abstract class Instrumentalist implements Performer {
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
  public abstract Instrument getInstrument(); // Внедряемый метод
}
//<end id="instrumentalist_java" />
