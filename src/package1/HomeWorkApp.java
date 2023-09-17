package package1;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("---------------Task №2---------------");
        System.out.println(findSymbolOccurance("Lorem ipsum", 'm'));
        System.out.println("---------------Task №3---------------");
        System.out.println(findWordPosition("Lorem ipsum", "em"));
        System.out.println(findWordPosition("Lorem ipsum", "ra"));
        System.out.println("---------------Task №4---------------");
        System.out.println(stringReverse("Lorem ipsum"));
        System.out.println("---------------Task №5---------------");
        System.out.println(isPalindrome("Lorem ipsum"));
        System.out.println(isPalindrome("ABBA"));
        System.out.println(isPalindrome("ABTBA"));
    }

    //Task №2
    private static int findSymbolOccurance(String str, char ch) {
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                k++;
            }
        }
        return k;
    }

    //Task №3
    private static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    //Task №4
    private static String stringReverse(String str) {
        StringBuffer sb = new StringBuffer();

        for (int i = str.length(); i > 0; i--) {
            sb.append(str.charAt(i-1));
        }

        return sb.toString();
    }

    //Task №5
    private static boolean isPalindrome(String str) {
        int len = str.length();
        int halfLen = (int) len /2;
        for (int i = 0; i < halfLen; i++) {
            if (str.charAt(i) == str.charAt(len - i - 1)) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }

}
