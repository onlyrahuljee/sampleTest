public class Anagrams {

    public static void main(String[] args) {
        String s1 = "RACES";
        String s2 = "SCARE";
        boolean isTrue= isAnagram(s1, s2);
        System.out.println(isTrue);
    }

    private static boolean isAnagram(String s1, String s2) {
        int s1Length = s1.length();
        int s2Length = s2.length();

        int count[] = new int[256];
        int i = 0;
        for (i = 0; i < s1.length() && i < s2.length(); i++)
        {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        if (s1Length != s2Length) {
            return false;
        }

        for (i = 0; i < count.length; i++) {

            if (count[i] != 0) {
                System.out.println( (char) (i) +" "+ count[i]);
                return false;
            }
        } return true;
    }
}