package BirdEagleHawk;

public abstract class Bird {
    String tone;       // наличие музыканта
    int flySpeed;             // скорость
             // наличие композиции;

    public Bird(String tone, int flySpeed){  //конструктор класса
        this.tone = tone;
        this.flySpeed = flySpeed;
    }

    public abstract String fly();

    public abstract String makeSound();

    public abstract String birdinfo();
}
