package org.velezreyes.quiz.question6;

public class SodaDrink implements Drink {
    
    private String name;
    private boolean answer;
    
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name; 
    }

    @Override
    public boolean isFizzy() {
        return this.answer;
    }
    
}
