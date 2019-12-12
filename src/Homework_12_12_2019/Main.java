package Homework_12_12_2019;

public class Main {
    public static void main(String[] args) {

//      1. Հայտարարել զանգված և տպել այն։
        System.out.println("1. Հայտարարել զանգված և տպել այն։");
        String[] names = {"Karine", "Marine", "Serine", "Narine", "Poxos", "Petros", "Martiros"};
        for (String name : names)
            System.out.println(name);
//      2. Հայտարարել int -երի զանգված եւ լցնել 0-րով։
        System.out.println("--------------------------------------------------------------");
        System.out.println("2. Հայտարարել int -երի զանգված և լցնել 0-րով։");
        int[] numbers2 = new int[10];
        for (int number : numbers2)
            System.out.print(number + " ");
//      3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println("3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։");
        int[] numbers3 = new int[1000];
        for (int i = 1; i <= 1000; i++)
            numbers3[i - 1] = i;
        for (int number : numbers3)
            System.out.print(number + " ");
//      4. Հայտարարել byte-երի զանգված եւ լցնել [-30;30] միջակայքի զույգ թվերով։
        System.out.println();
        System.out.println("--------------------------------------------------------------");
        System.out.println(" 4. Հայտարարել byte-երի զանգված եւ լցնել [-30;30] միջակայքի զույգ թվերով։");
        int j = 0;
        byte[] bytearray = new byte[30];
        for (int i = -30; i <= 30; i += 2)
            if (i != 0)
                bytearray[j++] = (byte) i;
        for (byte number : bytearray)
            System.out.print(number + " ");


    }
}
