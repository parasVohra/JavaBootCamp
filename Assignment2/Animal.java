package Assignment2;

public class Animal {
    
    String name;
    int numberOfLegs;
    String animalSound;
    String animalFood;
    String habitat;
    String animalType;

     public static void main(String[] args) {
        Animal Lion = new Animal("Lion", 4, "Roar", "meat", "jungle");
        Animal Deer = new Animal("Deer", 4, "Gaur", "grass", "jungle", "mammal");
        Animal Pigeon = new Animal("Pigeon", 2, "Gutter Gu", "insects", "jungle", "reptile");

        Lion.eat();
        Lion.makeSound(2);

        Deer.eat();
        Deer.makeSound(3);

        Pigeon.eat();
        Pigeon.makeSound(1);

    }


    public Animal(String name, int numberOfLegs, String animalSound, String animalFood, String habitat,
            String animalType) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.animalSound = animalSound;
        this.animalFood = animalFood;
        this.habitat = habitat;
        this.animalType = animalType;
    }

    public Animal(String name, int numberOfLegs, String animalSound, String animalFood, String habitat) {
        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.animalSound = animalSound;
        this.animalFood = animalFood;
        this.habitat = habitat;
    }
    

    public void makeSound(int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(this.animalSound);
        }
    }

    public void eat() {
        System.out.println("animal has eaten "+this.animalFood);
    }

}
