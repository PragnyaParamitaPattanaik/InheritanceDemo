public class Animal {
}
class Mammal extends Animal{

}
class Reptiles extends Mammal{

}
class Dog extends Mammal{
    public static void main(String[] args) {
        Animal a=new Animal();
        Mammal m=new Mammal();
        Dog d=new Dog();
        System.out.println(m instanceof Animal);
        System.out.println(d instanceof Animal);
        System.out.println(d instanceof Mammal);


    }
}
