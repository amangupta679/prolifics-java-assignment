

public class Countwords {
    public static void main(String[] args) {
        String sentence = "He is this is";
        countWords(sentence);
    }

    public static void countWords (String sen) {
        var count  = 0;
        for (int i = 0; i < sen.length(); i++) {
            if ((sen.charAt(i)+"").equals(" "))
                count++;
        }
        System.out.println(count+1);
        // added 1 bcz at the end after is there is no space so it will not count last word
    }
}
