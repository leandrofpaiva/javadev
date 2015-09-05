package br.com.javadev.proguard;

/**
 * Hello world!
 */
public class Message {

  private String name;

  public void setName(String name) {
    this.name = name;
  }

  public String printHello() {
    System.out.println("TESTE");
    return "Hello ! " + name;
  }
  
}