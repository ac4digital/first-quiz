package org.velezreyes.quiz.question6;


public class SodaVendingMachine implements VendingMachine, Drink {

    private int quarters = 0;
    private String sodaName;
    private boolean isFizzy;
    
    @Override
    public void insertQuarter() {
        quarters++;
    };
    
    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        /*if (name.equals("ScottCola")) {
            if (quarters < 3) {
                throw new NotEnoughMoneyException();
            } else {
                this.sodaName = "ScottCola";
                this.isFizzy = true;
                quarters = 0; 
                return this;
            }
        }
        if (name.equals("KarenTea")) {
            if (quarters < 4) {
                throw new NotEnoughMoneyException();
            } else {
                this.sodaName = "KarenTea";
                this.isFizzy = false;
                quarters = 0; 
                return this;
            }
        }**/
        
        switch(name) {
            case "ScottCola":
                if (quarters < 3) {
                    throw new NotEnoughMoneyException();
                } else {
                    this.sodaName = "ScottCola";
                    this.isFizzy = true;
                    quarters = 0; 
                    return this;
                }
            case "KarenTea":
                if (quarters < 4) {
                    throw new NotEnoughMoneyException();
                } else {
                    this.sodaName = "KarenTea";
                    this.isFizzy = false;
                    quarters = 0; 
                    return this;
            }
            default:
                throw new UnknownDrinkException();
        }
    };
    
    public void setName(String sodaName){
        this.sodaName = sodaName;
    };
    
    @Override
    public String getName(){
        return this.sodaName;
    };
    @Override
    public boolean isFizzy(){
        return this.isFizzy;
    };
    
}