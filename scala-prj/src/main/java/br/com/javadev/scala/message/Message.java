package br.com.javadev.scala.message;

/**
 * Classe Message.
 */
public class Message 
{
  private String message;
  
  public void setMessage(String message) {
    this.message = message;
  }
  
  public void print() {
    System.out.println("Msg: " + message);
  }
}
