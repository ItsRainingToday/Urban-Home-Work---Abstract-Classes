package InstrumentGuitarPiano;
public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar(true,12,false );
        guitar.play();
        System.out.println(guitar.play());
        System.out.println("***");
        guitar.tune();
        System.out.println(guitar.tune());
        System.out.println("***");

        Piano piano = new Piano(true,3,true );
        piano.play();
        System.out.println(piano.play());
        System.out.println("***");
        piano.tune();
        System.out.println(piano.tune());
        System.out.println("***");
    }
}
