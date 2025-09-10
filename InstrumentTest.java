public class InstrumentTest {
    public static void main(String[] args) {
        Instrument piano = new Instrument("Piano", 250.50);
        Instrument Violin = new Instrument("Violin", 520.000);

        piano.display();
        System.out.println();
        Violin.display();
    }
}

