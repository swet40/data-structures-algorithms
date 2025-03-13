public class binString {

    public static void printBinToStrings(int n, int lastPlace, String str){
        // if(lastPlace == 0){
        //     printBinToStrings(n-1, 0, str.append("0"));
        //     printBinToStrings(n-1, 1, str.append("1"));
        // } else{
        //     printBinToStrings(n-1, 0, str.append("0"));
        // }
        if(n == 0){
            System.out.println(str);
            return;
        }
        printBinToStrings(n-1, 0, str+"0");
        if(lastPlace == 0){
            printBinToStrings(n-1, 1, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinToStrings(3, 0, "");
    }
}
