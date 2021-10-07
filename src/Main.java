import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Bil kaj = new Bil();
        kaj.setBiltype("Tesla");
        kaj.setModel("X");
        kaj.setAntalDøre(2);
        kaj.setStelnummer(568345);
        kaj.setGPSKoordinater("33.455, 77.566");
        kaj.setSoftwareVersion("1.0.4");
        kaj.setHastighed(0);

        Motor motor = new Motor();
        Bremse bremse = new Bremse();

        System.out.println(kaj);
        kaj.start();
        motor.cruiseControl(86);
        bremse.brems(6);
        int omdrejnings =  - bremse;
        System.out.println("Motorens omdrejning er nu på " + omdrejnings);







        Hjul hjulClass = new Hjul();
        }
    }
