package org.velezreyes.quiz.question6;

public class VendingMachineImpl {

  public static VendingMachine getInstance() {
    VendingMachine instance_vm = new SodaVendingMachine();
    
    return instance_vm;
  }
}
