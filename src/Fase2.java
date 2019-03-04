import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fase2 {

    public static void main(String[] args) {
        //FASE 2
        System.out.println("---------------------------FASE2-------------------------------");
        List<Character> charList = Arrays.asList('O','l','i','v','e','r','7','9','{');
        printVowelOrConsonant(charList);

    }
    private static boolean isVowel ( char character){
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        }
            return false;
    }

    private static void printVowelOrConsonant(List<Character> characterList) {
        int num;
        for (char c : characterList) {
            c = Character.toLowerCase(c);
            num=checkIfVowelOrConsonant(c);
            if(num==0){
                System.out.println(c + " ---- People names do not contain numbers");
            }else if(num==1){
                System.out.println(c + " ---- Vowel");
            }else if (num==2){
                System.out.println(c + " ---- Consonant");
            }else if(num==3){
                System.out.println(c + " ---- The Character is not a digit or a letter");
            }
        }
    }

    private static int checkIfVowelOrConsonant(char c) {
        if (Character.isDigit(c)) {
                return 0;
        }
        else if (isVowel(c)) {
                return 1;
        }
        else if(Character.isLetter(c)) {
                return 2;
        }else{
                return 3;
        }
    }
}
