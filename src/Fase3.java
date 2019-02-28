import java.util.*;

public class Fase3 {

    static List<Character> characterList;
    static StringBuilder sb;
    static String surname;
    static HashMap<Character,Integer> letters;

    public static void main(String [] args){

        characterList = Arrays.asList('I','T','U','R','R','I','A','G','A');
        sb = new StringBuilder();

        for (Character c: characterList) {
            sb.append(c);
        }
        //Convert in String
        surname = sb.toString();

        letters = new HashMap<>();
        letters=addOccurrences(surname);
        Iterator it = letters.keySet().iterator();
        while(it.hasNext()){
            char key;
            key = (char) it.next();
            System.out.println("Key " + key + " Value " + letters.get(key));
        }
    }

    private static HashMap<Character,Integer> addOccurrences(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (int i = 0; i< str.length(); i++){
            Character currentChar = str.charAt(i);
            if(hashMap.containsKey(currentChar)){
                hashMap.put(currentChar, hashMap.get(currentChar)+1);
                //Increment current  value for this key in hashMap by 1
            }else {
                hashMap.put(currentChar, 1);
            }
        }
        return hashMap;
    }
}
