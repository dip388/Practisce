class Animal
{
    public void Eat()
    {
        System.out.println("Animal is eating");
    }

}
class Dog extends Animal
{
    void bark()
    {
        System.out.println("Dog is Barking....");
    }

}
public class singleInheritance {

    static void main(String[] args) {
        Dog d=new Dog();
        d.Eat();
        d.bark();
    }
}
