package BirdEagleHawk;

public class Main {
    public static void main(String[] args) {
    Eagle eagle = new Eagle("громко",120);
    Hawk hawk = new Hawk("тихо",50);

    System.out.println(eagle.birdinfo());
    System.out.println(eagle.fly());
    System.out.println(eagle.makeSound());
    System.out.println("****");

    System.out.println(hawk.birdinfo());
    System.out.println(hawk.fly());
    System.out.println(hawk.makeSound());
    System.out.println("****");
    }
}
