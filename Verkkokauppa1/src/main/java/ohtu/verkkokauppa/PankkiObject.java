package ohtu.verkkokauppa;

public interface PankkiObject {
    public boolean tilisiirto(String nimi, int viitenumero, String tililta, String tilille, int summa);
}
