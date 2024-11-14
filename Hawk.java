package BirdEagleHawk;

public class Hawk extends Bird {
    String sound;
    String sped;
    public Hawk(String tone, int flySpeed) {
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
    public String makeSound() {
        if (tone == "громко"){
            sound = "Им присущи клекот и характерный пронзительный крик, доносящийся из под небес";
        }
        if (tone == "тихо"){
            sound = "Они довольно молчаливы, но не немы.";
        }
        return sound;
    }

    @Override
    public String birdinfo() {
        return "Это птица - Ястреб";
    }
}

