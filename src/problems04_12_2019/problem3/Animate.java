package problems04_12_2019.problem3;

public class Animate {
    public String[] a = {"|", "/", "|", "\\",};

    public void clock() {
        System.out.println("Problem 3");
        for (;;) {
            for (String element : a) {
                System.out.print("\r");
                System.out.print(String.valueOf(element));
            }
        }


    }
}
