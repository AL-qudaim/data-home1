import java.util.Arrays;

public class home1 {
    public static void main(String[] args) {
        int []r={1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(r));
        reverse(r);
        System.out.println(Arrays.toString(r));
    }
    public static void reverse(int a[]){
        int d=a.length-1;
        for (int i = 0; i <a.length/2 ; i++) {
            int t=a[i];
            a[i]=a[d];
            a[d]=t;
            d--;
        }
    }
}
