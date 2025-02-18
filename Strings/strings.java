import java.util.*;

public class strings {

    public static void printLetters(String str){
        for(int i =0; i<str.length(); i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str1 = "abcd";
        // String str2 = new String("xyz");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();
        // System.out.println(name.length());

        //concatenation
        String first = "Sweta";
        String last = "Pal";
        String Fullname = first + " " + last;
        // System.out.println(Fullname.charAt(0));

        printLetters(Fullname);
    }
}
