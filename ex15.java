import java.util.Scanner;

public class ex15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueInput=true;
        do{
            try{
                System.out.println("Introduceti un numar intreg");
                int number=sc.nextInt();
                System.out.println("Nr introdus este"+number);
                continueInput=false;
            }
            catch (Exception ex){
                System.out.println("Incercati din nou! tip incorect");
                sc.nextLine();
            }
        }while (continueInput);
    }
}


