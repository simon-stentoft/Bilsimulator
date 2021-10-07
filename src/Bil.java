public class Bil {
    private String biltype;
    private String model;
    private int stelnummer;
    private int antalDøre;
    private String GPSKoordinater;
    private double hastighed;
    private String softwareVersion;

    public static void start() {
        System.out.println("Motoren er startet.");
    }
    public static void sluk() {
        System.out.println("Moteren er slukket.");
    }

    public String toString() {
        return "Biltype: " + getBiltype() + " \nModel: " + getModel() + "\nStelnummer: " + getStelnummer() + "\nAntal døre: " + getAntalDøre() + "\nGPS koordinater: " + getGPSKoordinater() + "\nSoftware version: " + getSoftwareVersion() + "\nHastighed: " + getHastighed() + " km/t.";
    }








    public String getBiltype() {
        return biltype;
    }

    public void setBiltype(String biltype) {
        this.biltype = biltype;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStelnummer() {
        return stelnummer;
    }

    public void setStelnummer(int stelnummer) {
        this.stelnummer = stelnummer;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }

    public String getGPSKoordinater() {
        return GPSKoordinater;
    }

    public void setGPSKoordinater(String GPSKoordinater) {
        this.GPSKoordinater = GPSKoordinater;
    }

    public double getHastighed() {
        return hastighed;
    }

    public void setHastighed(double hastighed) {
        this.hastighed = hastighed;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
