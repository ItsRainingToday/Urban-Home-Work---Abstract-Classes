package BirdEagleHawk;

public class Eagle extends Bird{
    String sound;
    String sped;
    public Eagle(String tone, int flySpeed) {
        super(tone, flySpeed);
    }

    @Override
    public String fly() {
        if (flySpeed >= 100 ){
            sped = "Она обладает невероятной скоростью и маневренностью в воздухе";
        } else {
            sped = "Она устала и не может лететь быстро";
        }
        return sped;
    }

    @Override
    public String birdinfo() {
        return "Это птица - Орел";
    }

    @Override
    public String makeSound() {
        if (tone == "громко"){
            sound = "Орел производит звонкий и громкий звук, который можно услышать на достаточно большом расстоянии";
        }
        if (tone == "тихо"){
            sound = "ХррХрр";
        }
        return sound;


    }
}
