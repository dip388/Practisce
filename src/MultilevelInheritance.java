
class Animal1 {
    void breathe() { System.out.println("Breathing"); }
}

class Mammal extends Animal1 {
    void hasFur() { System.out.println("Has fur"); }
}

class Cat extends Mammal {
    void bark() { System.out.println("Mau-Mau"); }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
            Cat d = new Cat();
            d.hasFur();
            d.bark();
        }
    }

