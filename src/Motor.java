
public class Motor {

    public static void cruiseControl(int hastighed) { //Omdrejninger mellem 1-100%
        if (hastighed >= 1 && hastighed <= 100) {
            System.out.println("Motorens omdrejning er på " + hastighed + " %.");
        }
    }
}

