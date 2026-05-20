package Polymorphism;

public class First{

    public static class Animal{
        void Sound(){
            System.out.println("hi this is parent class");
        }
    }

    public static class Dog extends Animal{
        void Sound(){
            System.out.println("hi this is child class");
        }
    }


public static void main(String[] args) {
    Dog d =new Dog();
    d.Sound();
}
}