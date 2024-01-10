/**
 * test1
 */

// class -> main 기본 
public class test1 {

    static class A{
        int n;
        int g;
    }
    public static void main(String[] args) {
        test1.A[] a = new A[2];

        for (int i = 0; i < 2; i++) {
            a[i] = new A();
        }

        for(int i=0; i<2; i++){
            a[i].n = i;
            a[i].g = i+1;
        }
        System.out.println(a[0].n + a[1].g);
    }
}