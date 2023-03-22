package md.ceiti.StudentTurcuman;

public class Abonat {
    int Id;
    private String nume;
    private String prenume;
    private String patronimic;
    String oras;
    String strada;
    int numarTell;
    int pretAbonament;
    float minIntern;
    float minExtern;
    int test;


    //setere pentru fiecare atribut al clasei


    public void setId(int id) {
        Id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setPrenume(String nrenume) {
        this.prenume = nrenume;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    public void setStrada(String strada) {
        this.strada = strada;
    }

    public void setNumarTell(int numarTell) {
        this.numarTell = numarTell;
    }

    public void setPretAbonament(int pretAbonament) {
        this.pretAbonament = pretAbonament;
    }

    public void setMinIntern(float minIntern) {
        this.minIntern = minIntern;
    }

    public void setMinExtern(float minExtern) {
        this.minExtern = minExtern;
    }

    public int getId() {
        return Id;
    }

    public String getNume() {
        return nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public String getOras() {
        return oras;
    }

    public String getStrada() {
        return strada;
    }

    public int getNumarTell() {
        return numarTell;
    }

    public int getPretAbonament() {
        return pretAbonament;
    }

    public float getMinIntern() {
        return minIntern;
    }

    public float getMinExtern() {
        return minExtern;
    }

    public void getDate(){
            System.out.println("Id:" + getId());
            System.out.println("Nume: " + getNume());
            System.out.println("Prenume: " + getPrenume());
            System.out.println("Patronimic: " + getPatronimic());
            System.out.println("Orasul: " + getOras());
            System.out.println("Strada: " + getStrada());
            System.out.println("Telefon: " + getNumarTell());
            System.out.println("Pret Abonament: " + getPretAbonament());
            System.out.println("Minute interne vorbite: " + getMinIntern());
            System.out.println("Minute externe (internationale) vorbite: " + getMinExtern());
    }

}
