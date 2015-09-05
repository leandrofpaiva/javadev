package br.com.javadev.proguard;

/**
 * Hello world!
 */
public class HelloWorld {


  public static void main(String args[]) {
    Message hw = new Message();
    hw.setName("Leandro");
    System.out.println("RET: " + hw.printHello());
  }
}
