public class ex15_throw {

        static void verificare_varsta(int age) {
            if (age < 18) {
                throw new ArithmeticException("Eroare de intrare! Tre sa aveti +18");
            }
            else {
                System.out.println("Intrare cu succes");
            }
        }

        public static void main(String[] args) {
            verificare_varsta(15);

        }

}
