package br.com.javadev.log;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class MyApp {

  static Logger logger = Logger.getLogger(MyApp.class);

  public static void main(String[] args) {
    BasicConfigurator.configure();

    logger.info("Entering application.");
    Bar bar = new Bar();
    bar.doIt();
    logger.info("Exiting application.");
  }
}
