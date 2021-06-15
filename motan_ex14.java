public class motan_ex14 extends animals_ex14{//mostenire
    //polimorfism
    @Override
    public void sunet() {
        System.out.println("Motanul face miau");
    }

    public static void main(String[] args) {
        motan_ex14 motan=new motan_ex14();
        motan.setNume("Feghea");
        motan.specia="motan";
        motan.stapan="Panchiusa";

        System.out.println(motan.getNume()+" specia "+motan.specia+" are stapanul:"+motan.stapan);
        motan.sunet();
    }

}
