package br.com.javadev.aspectj;

public class HelloWorld {
  private String message;

  public void setMessage(String message) {
    this.message = message;
  }

  public String printMessage() {
    return "Hello ! " + message;
  }

  public static void main(String args[]) {
    HelloWorld hw = new HelloWorld();
    hw.setMessage("Test");
    System.out.println("MSG: " + hw.printMessage());
  }
}
