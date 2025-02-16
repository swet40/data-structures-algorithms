public class floyds_triangle {
    public static void floyds(int n){
        int counter = 1;
        for(int i=1; i<=n; i++){
            
            //number of times it per row
            for(int j=1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void butterfly(int n){

        //1st half
        for(int i=1; i<=n; i++){

            //stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space- 2(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=n; i>=1; i--){
            //stars- i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //space- 2(n-i)
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            //stars-i
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus(int n){

        for(int i=1; i<=n; i++){
             //spaces
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }

            //hollow rectangle- stars
            for(int j=1; j<=n; j++ ){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        // butterfly(6);
        // rhombus(5);
        hollow_rhombus(5);
    }
}
