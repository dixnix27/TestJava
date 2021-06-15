public class ex13_part2 extends ex13 {


    public static void main(String[] args) {
        ex13 exemplu=new ex13();
        System.out.println(exemplu.prenume);
        // avem acces la prenume din cauza ca e protected

        exemplu.setNume("Feghea"); //setter pt variabila privata
        System.out.println(exemplu.getNume());//getter pt variabila privata
    }

}
