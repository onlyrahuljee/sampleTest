public class ProperSyntax {

    public static void main(String[] args) {

        String s1 = "Java";
        String s2 = "WORLD";
        String s = (new StringBuffer(16)).append(s1).append(s2). toString();
        System.out.println("Complete String :"+s);


    }
}
