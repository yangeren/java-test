package ch16_531;

/**
 * Created by hanz on 17-10-24.
 */

interface Pet {
  void speak();
}


//class Dog implements Pet {
//  @Override
//  public void speak() {
//    System.out.println("woof!");
//  }
//}
//
//class Cat implements Pet {
//  @Override
//  public void speak() {
//    System.out.println("meow!");
//  }
//}

public class PetSpeak {
  static void command(Pet p) {
    p.speak();
  }

//  public static void main(String[] args) {
//    Pet[] pets = { new Cat(), new Dog()};
//    for (int i = 0; i< pets.length; i++) {
//      command(pets[i]);
//    }
//  }

}
