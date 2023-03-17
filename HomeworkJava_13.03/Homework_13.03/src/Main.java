public class Main {
    public static void main(String[] args) {

        String stringBasic = "I study Basic Java!";

        char charVar = stringBasic.charAt(18);
        System.out.println(charVar);

        boolean searchJava = stringBasic.contains("Java");
        System.out.println(searchJava);

        String replaceLetters = stringBasic.replace('a', 'o');
        System.out.println(replaceLetters);

        String stringUpper = stringBasic.toUpperCase();
        System.out.println(stringUpper);

        String stringLower = stringBasic.toLowerCase();
        System.out.println(stringLower);

        String cutJava = stringBasic.substring(14);
        System.out.println(cutJava);
    }
}
