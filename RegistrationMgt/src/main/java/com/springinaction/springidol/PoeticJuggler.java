//<start id="poeticjuggler_java" /> 
package com.springinaction.springidol;

public class PoeticJuggler extends Juggler {
  private Poem poem;
  private int num;

  public PoeticJuggler(Poem poem) { //<co id="co_injectPoem"/>
    super();
    this.poem = poem;
  }

  public PoeticJuggler(int beanBags, Poem poem) { // <co id="co_injectPoemBeanBags"/>
    super(beanBags);
    this.poem = poem;
  }

  @Override
  public void perform() throws PerformanceException {
    super.perform();
    System.out.println("While reciting...");
    poem.recite();
    System.out.println("The number is "+num);
  }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
  
}
//<end id="poeticjuggler_java" />