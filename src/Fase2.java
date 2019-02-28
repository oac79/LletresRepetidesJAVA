import java.util.ArrayList;
import java.util.List;

public class Fase2 {

    public static void main(String[] args) {
        //FASE 2
        System.out.println("---------------------------FASE2-------------------------------");
        List<Character> charList = new ArrayList<>();
        charList.add('O');
        charList.add('l');
        charList.add('i');
        charList.add('v');
        charList.add('e');
        charList.add('r');
        charList.add('7');
        charList.add('9');

        vocalOrConsonant(charList);

    }
    private static boolean isVocal ( char character){
        if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
            return true;
        }
            return false;
    }


    private static void vocalOrConsonant(List<Character> characterList) {
        for (char c : characterList) {
            c = Character.toLowerCase(c);
            verification(c);
        }
    }

    private static void verification(char c) {
        if (!Character.isDigit(c)) {
            if (isVocal(c)) {
                System.out.println(c + " ---- Vocal");
            } else {
                System.out.println(c + " ---- Consonant");
            }
        } else {
            System.out.println(c + " ---- Els noms de persones no contenen números");
        }
    }
}
//toUpperCase()