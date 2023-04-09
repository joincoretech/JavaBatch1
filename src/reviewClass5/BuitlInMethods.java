package reviewClass5;

public class BuitlInMethods {
    public static void main(String[] args) {

        String words = "Batch1 likes to have a long brake";
        // the way to count word
        String[] wordsCount = words.split(" ");
        System.out.println(wordsCount.length);


        String sentences = "this is batch1 . they are doing great . diffidently they will get jobs ";
        String[] sentence = sentences.split(" . ");
        System.out.println(sentence.length);
        for (String n : sentence) {
            System.out.println(n);
        }

        String str = "words";
        str.length();
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            newStr += str.charAt(i);
        }
        System.out.println(newStr);

        char[] reversStr = str.toCharArray();
        for (int i = reversStr.length - 1; i >= 0; i--) {
            System.out.print(reversStr[i]);
        }
      // ctrl+alt+l
    }
}
