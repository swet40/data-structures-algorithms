public class shortestPath {

    public static float ShortestPath(String path){
        int x=0, y=0;

        for(int i =0; i<path.length();i++){
            char dir = path.charAt(i);

            if(dir == 'S'){
                y--;
            }
            else if(dir == 'N'){
                y++;
            }
            else if(dir == 'E'){
                x++;
            } else{
                x--;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+ Y2);
    }

    public static String substring(String str, Integer si, Integer ei){
        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        // String path = "WNEENESENNN";
        // System.out.print(ShortestPath(path));
        // String str = "HelloWorld";
        // System.out.println(str.substring(0,5));
        //System.out.print(substring(str, 5, 10));

        String fruits[] = {"apple","banana","orange"};

        String largest = fruits[0];
        for(int i = 0; i<fruits.length; i++){
            if(largest.compareTo(fruits[i])<0){
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
