package br.com.template.license;

public class HelloWorld {

  static String createHelloWorldMessage(String name) {
    return "Hello " + name + ".";
  }

  public static void main(String args[]) {
    System.out.println("MSG: " + createHelloWorldMessage("Test"));
  }
}
