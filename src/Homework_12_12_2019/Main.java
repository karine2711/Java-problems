package Homework_12_12_2019;

public class Main {
    public static void main(String[] args) {

//      1. Հայտարարել զանգված և տպել այն։
        System.out.println("1. Հայտարարել զանգված և տպել այն։");
        String[] names = {"Karine", "Marine", "Serine", "Narine", "Poxos", "Petros", "Martiros"};
        for (String name : names)
            System.out.println(name);
//      2. Հայտարարել int -երի զանգված եւ լցնել 0-րով։
        separateSections("2. Հայտարարել int -երի զանգված և լցնել 0-րով։");
        int[] numbers2 = new int[10];
        for (int number : numbers2)
            System.out.print(number + " ");
//      3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։
        separateSections("3. Հայտարարել int -երի զանգված եւ լցնել 1- 1000 թվերով։");
        int[] numbers3 = new int[1000];
        for (int i = 1; i <= 1000; i++)
            numbers3[i - 1] = i;
        for (int number : numbers3)
            System.out.print(number + " ");
//      4. Հայտարարել byte-երի զանգված եւ լցնել [-30;30] միջակայքի զույգ թվերով։

        int counter = 0;
        byte[] bytearray = new byte[30];
        for (int i = -30; i <= 30; i += 2)
            if (i != 0)
                bytearray[counter++] = (byte) i;
        for (byte number : bytearray)
            System.out.print(number + " ");
//      5.Հայտարարել short-երի զանգված եւ լցնել [1;300] միջակայքի կենտ թվերով։
        separateSections("5.Հայտարարել short-երի զանգված եւ լցնել [1;300] միջակայքի կենտ թվերով։");
        short[] shortarray=new short[150];
        counter=0;
        for (int i = 1; i <= 300; i += 2)
              shortarray[counter++] = (short) i;
        for (short number : shortarray)
            System.out.print(number + " ");
//      6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։
      separateSections(" 6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։");
    int[] numbers6={4,25,31,65,7,100,23};
        for (int number : numbers6)
            if(number%5==0)
            System.out.print(number + " ");
//      7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։
       separateSections("7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։");
        double[] numbers7={4.5,-25,31.2,65.4,-7,100.01,23.3};
        for (double number : numbers7)
            if(number>24.56)
                System.out.print(number + " ");

//      8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։
      separateSections(" 8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։");
        float[] numbers8={4.5F,-25F,31.2F,65.4F,-7F,-100.01F,23.3F, -45.5F, 12F, 34.1F, 85.6F};
        for (float number : numbers8)
            if(number>35.56 || number<-34.655)
                System.out.print(number + " ");

    }


    public static void separateSections(String title){
        System.out.println("\n--------------------------------------------------------------");
        System.out.println(title);
    }
}
