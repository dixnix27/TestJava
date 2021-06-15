public class ex8 {
    public static void main(String[] args) {
        String str = "  ProgramareJava   ";
        //1st way
        String noSpaceStr = str.replaceAll("\\s", "");
        System.out.println(noSpaceStr);

    }
}
