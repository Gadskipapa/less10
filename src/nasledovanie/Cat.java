package nasledovanie;

import nasledovanie.Animal;

public class Cat extends Animal {

   // private boolean isVegetarian; за счет наследования эти строки можно убрать
   // private String food;
    private String poroda;

    public Cat() {
        super(isVegan, food);
        this.poroda = poroda;
    }

    public String getPoroda() {
        return poroda;
    }

    private String colour;
    public void gav() {
        this.colour = "black";
        this.food = "bone";
        this.isVegetarian();
    }

    public void move() {
        System.out.println("move like a cat");
    }

}
