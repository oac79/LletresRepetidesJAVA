import java.util.ArrayList;
import java.util.List;

public class Fase4 {

    static char[] name = {'O', 'l', 'i', 'v', 'e', 'r'};
    static char[] surname = {'A', 'b', 'a', 'd'};
    static List<Character> fullName;

    public static void main(String[] args) {
        //FASE 4
        System.out.println("---------------------------FASE4-------------------------------");
        fullName = new ArrayList<>();
        for (char n : name) {
            fullName.add(n);
        }
        fullName.add('\u0000');
        for (char sn : surname) {
            fullName.add(sn);
        }
        System.out.print(fullName);
    }

}
