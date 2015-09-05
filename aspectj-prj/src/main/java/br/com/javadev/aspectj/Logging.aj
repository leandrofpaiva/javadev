package br.com.javadev.aspectj;

public aspect Logging {
  // Todas as Actions
  pointcut logOnExecuteSet(): execution (public String print*());

  before(): logOnExecuteSet() {
    System.out.println("Entering: " + thisJoinPoint);
  }

  after() returning: logOnExecuteSet() {
    System.out.println("After Returning: " + thisJoinPoint);
  }
}
