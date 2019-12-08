package Problem1;

public class Empty {
    public void printSectionA(int n) {
        System.out.println("This is empty A");
        for (int i = 0; i < n; i++) {
            System.out.println();
            if (i == 0)
                for (int j = 0; j <= n; j++)
                    System.out.print("* ");
            else
                for (int j = 0; j <= n; j++)
                    if (j == n - i || j == 0)
                        System.out.print("*  ");
                    else
                        System.out.print("  ");
        }
    }

    public void printSectionB() {
        System.out.println();
        System.out.println("This is Section B");
        int n = 15;
        int k1;
        int k2;
        for (int i = 0; i <= n / 2; i++) {
            System.out.println();
            k1 = n / 2 - i;
            k2 = n / 2 + i;
            for (int j = 0; j < n; j++)
                if (i == n / 2) {
                    System.out.print("*");
                } else {
                    if (j == k1 || j == k2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
        }
    }

    public void printSectionC(int n) {
        System.out.println();
        System.out.println("This is Section C");
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = 0; j <= n; j++)
                if (i == 0) {
                    System.out.print("*");
                } else {
                    if (j == i || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
        }
    }

    public void printSectionD(int n) {
        System.out.println();
        System.out.println("This is Section D");
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++)
                if (i == n)
                    System.out.print("*");
                else {
                    if (j == 0 || j == i)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
        }
    }

    public void printSectionE() {
        System.out.println();
        System.out.println("This is Section E");
        int n = 15;
        int k1;
        int k2;
        for (int i = 0; i <= n / 2; i++) {
            System.out.println();
            k1 = i;
            k2 = n - i - 1;
            for (int j = 0; j < n; j++)
                if (i == 0)
                    System.out.print("*");
                else {
                    if (j == k1 || j == k2)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
        }
    }

    public void printSectionF(int n) {
        System.out.println();
        System.out.println("This is Section F");
        for (int i = 0; i <= n; i++) {
            System.out.println();
            for (int j = 0; j <= n; j++)
                if (i == n)
                    System.out.print("*");
                else {
                    if (j == n - i || j == n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
        }

    }
}
