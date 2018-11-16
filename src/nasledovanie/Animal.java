package nasledovanie;

public abstract class Animal {

    public final void printInfo() {
        System.out.println("я наследник энимал");
    }

    public abstract void move();

    private boolean isVegetarian;
    protected String food;
    public Animal() {};
    public Animal(boolean isVegan, String food) {
        this.isVegetarian = isVegan;
        this.food = food;
        }

        public boolean isVegetarian() {
        return isVegetarian;
        }

        public String getFood() {
        return food;
        }

}
