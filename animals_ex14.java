public class animals_ex14 {
    private String nume;
    protected String stapan;
    public String specia;

    // getteri + setteri - incapsulare
    public String getNume() {
        return nume;
    }

    public String getStapan() {
        return stapan;
    }

    public void setStapan(String stapan) {
        this.stapan = stapan;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void sunet(){
        System.out.println("Animalul face un sunet");
    }
}
