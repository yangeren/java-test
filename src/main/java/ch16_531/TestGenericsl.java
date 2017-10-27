package ch16_531;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by hanz on 17-10-24.
 */
public class TestGenericsl {

  public static void main(String[] args) {
    new TestGenericsl().go();
  }

  public void go() {
    Animal[] animals = {new Dog(), new Cat(), new Dog()};
    ArrayList<Cat> cats = new ArrayList<Cat>();
    cats.add(new Cat());
//    Dog[] dogs = {new Dog(), new Dog(), new Dog()};
//    takeAnimals(animals);
    takeAnimals(cats);
    ArrayList<Dog> dogs = new ArrayList<Dog>();
    dogs.add(new Dog());
    dogs.add(new Dog());
    takeAnimals(dogs);
  }

  public void takeAnimals(ArrayList<? extends Animal> animals) {
    for (Animal a: animals) {
      a.eat();

    }
  }
}


abstract class Animal{

  void eat() {
    System.out.println("animal eating");
  }

}

class Dog extends Animal {
  void bark(){}
}

class Cat extends Animal {
  void meow() {}
}