import java.util.Scanner;

public class ques27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        int digit=0,word=0,vowel=0,letter=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(Character.isDigit(ch)){
                digit++;
            }
            if(Character.isLetter(ch)){
                letter++;
                char lower = Character.toLowerCase(ch);
                if(lower=='a' || lower=='i' || lower=='e' || lower=='u' || lower=='o'){
                    vowel++;
                }
            }
        }
        String[] wordarray = s.trim().split(" ");
        if(s.trim().length() > 0){
            word = wordarray.length;
        }
        else{
            word=0;
        }
        System.out.println("Word : "+word);
        System.out.println("Vowel : "+vowel);
        System.out.println("Letter : "+letter);
        System.out.println("Digit : "+digit);
    }
}
