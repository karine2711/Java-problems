package Homework_12_12_2019;

public class Main {
    public static void main(String[] args) {

        //1. Հայտարարել զանգված և տպել այն։
        System.out.println("1. Հայտարարել զանգված և տպել այն։");
        String[] names={"Karine", "Marine", "Serine", "Narine", "Poxos", "Petros", "Martiros"};
        for(String name:names)
            System.out.println(name);
//2. Հայտարարել int -երի զանգված եւ լցնել 0-րով։
        System.out.println("--------------------------------------------------------------");
        System.out.println("2. Հայտարարել int -երի զանգված և լցնել 0-րով։");
        int[] numbers=new int[10];
        for(int number:numbers)
            System.out.print(number+ " ");
    }
}
