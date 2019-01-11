//<start id="onemanband_java" /> 
package com.springinaction.springidol;

import java.util.Map;

public class OneManBand implements Performer {
  public OneManBand() {
  }

  public void perform() throws PerformanceException {
    for (String key : instruments.keySet()) {
      System.out.print(key + " : ");
      Instrument instrument = instruments.get(key);
      instrument.play();
    }
  }

  private Map<String, Instrument> instruments;

  public void setInstruments(Map<String, Instrument> instruments) {
    this.instruments = instruments; //<co id="co_injectInstrumentCollection"/>
  }
}
//<end id="onemanband_java" />
