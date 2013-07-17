//<start id="stage_java" /> 
package com.springinaction.springidol;

public class Stage {
  private Stage() {
  }

  private static class StageSingletonHolder {
    static Stage instance = new Stage(); //<co id="co_lazyLoad"/>
  }

  public static Stage getInstance() {
    return StageSingletonHolder.instance; //<co id="co_returnInstance"/>
  }
  
  public void stageName(){
      System.out.println("The name of this stage is Stage 700");
  }
}
//<end id="stage_java" />
