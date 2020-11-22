//从键盘上输入一个字符串和一个字符，从该字符串中删除给定的字符。
public class Homework2_2 {
    public static String deleteCharString0 (String sourceString, char chElemData) {
        String deleteString = "";
        for (int i = 0; i < sourceString.length(); i++) {
            if (sourceString.charAt(i) != chElemData) {
                deleteString += sourceString.charAt(i);
            }
        }
        return deleteString;
    }

    public static void main (String[] args) {
        System.out.println(deleteCharString0("what", 'a'));
    }
}
