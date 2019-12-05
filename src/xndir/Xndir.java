package xndir;

public class Xndir {
    public void printsectionA(int n) {
        System.out.println("This is section A");
        for (int i = 0; i <= n / 2; i++) {
            System.out.println();
            for (int j = 0; j < n/2-i+1; j++)

                System.out.print("*");
        }
    }
    public void printsectionB() {
        System.out.println("This is section B");
        int n=15;
        int k1;
        int k2;
        for (int i = 0; i <=n/2; i++) {
            System.out.println();
            k1=n/2-i;
            k2=n/2+i;
            for (int j = 0; j <n; j++)
                if(j>=k1 && j<=k2)
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }
    public void printsectionC(int n) {
        System.out.println("This is section C");
        for (int i = 0; i <= n / 2; i++) {
            System.out.println();
            for (int j = 0; j <=n/2; j++)
if(j>=i)
                System.out.print("*");
else
    System.out.print(" ");
        }
    }
    public void printsectionD(int n) {
        System.out.println("This is section D");
        for (int i = 0; i < n / 2; i++) {
            System.out.println();
            for (int j = 0; j < i; j++)

                System.out.print("*");
        }
    }
    public void printsectionE() {
        System.out.println("This is section E");
        int n=15;
        int k1;
        int k2;
        for (int i = 0; i <=n; i++) {
            System.out.println();
            k1=i;
            k2=n-i;
            for (int j = 0; j <n; j++)
                if(j>=k1 && j<k2)
                    System.out.print("*");
                else
                    System.out.print(" ");
        }
    }
    public void printsectionF(int n) {
        System.out.println("This is section F");
        for (int i = 0; i < n/2; i++) {
            System.out.println();
            for (int j = 0; j < n/2; j++)
if(j>=n/2-i)
                System.out.print("*");
else
    System.out.print(" ");
        }
    }

}