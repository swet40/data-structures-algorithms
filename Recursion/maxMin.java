public class maxMin {

    static class minMax{
        int min;
        int max;

        public minMax(int  min, int max){
            this.min = min;
            this.max = max;
        }
    }

    public static minMax findboth(int[] a, int n){
        if(n==1){
            return new minMax(a[0], a[0]);
        }
        
        minMax result = findboth(a, n-1);

        result.min = Math.min(a[n-1], result.min);
        result.max = Math.max(a[n-1], result.max);

        return result;
    }

    public static void main(String[] args) {
        int a[] ={0,1,5,2,4,20,-10};
        int n = a.length;

        minMax result = findboth(a, n);

        System.out.println("maximum no:"+ result.max);
        System.out.println("minimum no:"+ result.min);
    }
}
