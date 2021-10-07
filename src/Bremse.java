public class Bremse {

    public static void brems(int bremseProcent) {
        if (bremseProcent >= 1 && bremseProcent <= 100) {
            System.out.println("Bilen bremser med " + bremseProcent + "%.");
        }
    }
}
