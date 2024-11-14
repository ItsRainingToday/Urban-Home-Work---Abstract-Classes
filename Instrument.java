package InstrumentGuitarPiano;

public abstract class Instrument {
    boolean musician;       // наличие музыканта
    int volume;             // громкость
    boolean  track;         // наличие композиции;

    public Instrument(boolean musician, int volume, boolean track){  //конструктор класса
        this.musician = musician;
        this.volume = volume;
        this.track = track;
    }

    public abstract String play();

    public abstract String tune();
}
