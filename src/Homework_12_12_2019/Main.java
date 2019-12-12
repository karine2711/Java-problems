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
        short[] shortarray = new short[150];
        counter = 0;
        for (int i = 1; i <= 300; i += 2)
            shortarray[counter++] = (short) i;
        for (short number : shortarray)
            System.out.print(number + " ");
//      6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։
        separateSections(" 6. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք բաժանվում են 5-ի։");
        int[] numbers6 = {4, 25, 31, 65, 7, 100, 23};
        for (int number : numbers6)
            if (number % 5 == 0)
                System.out.print(number + " ");
//      7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։
        separateSections("7. Հայտարարել double-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 24.56-ից։");
        double[] numbers7 = {4.5, -25, 31.2, 65.4, -7, 100.01, 23.3};
        for (double number : numbers7)
            if (number > 24.56)
                System.out.print(number + " ");

//      8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։
        separateSections(" 8. Հայտարարել float-երի զանգված եւ լցնել այն։ Տպել այն էլեմենտները որոնք մեծ են 35.56-ից կամ փոքր են -34.655-ից։");
        float[] numbers8 = {4.5F, -25F, 31.2F, 65.4F, -7F, -100.01F, 23.3F, -45.5F, 12F, 34.1F, 85.6F};
        for (float number : numbers8)
            if (number > 35.56 || number < -34.655)
                System.out.print(number + " ");
//      9. Հայտարարել double-երի զանգված եւ լցնել այն։Դասավորել աճման/նվազման կարգով
        separateSections("9. Հայտարարել double-երի զանգված եւ լցնել այն։Դասավորել աճման կարգով");
        double[] numbers9 = {4.52, 6.7, -5.3, 2.8, -6, -2.1, 0.5};
        //Աճման
        System.out.println("\n----Աճման կարգով-----");
        for (int i = numbers9.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (numbers9[j + 1] < numbers9[j]) {
                    double a = numbers9[j];
                    numbers9[j] = numbers9[j + 1];
                    numbers9[j + 1] = a;
                }
        for (double number : numbers9)
            System.out.print(number + " ");
        //Նվազման
        System.out.println("\n----Նվազման կարգով-----");
        for (int i = numbers9.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++)
                if (numbers9[j + 1] > numbers9[j]) {
                    double a = numbers9[j];
                    numbers9[j] = numbers9[j + 1];
                    numbers9[j + 1] = a;
                }
        for (double number : numbers9)
            System.out.print(number + " ");

//      10. Հայտարարել String փոփոխական եւ տպել նրանում եղած 'a' տառերի քանակը։
        separateSections("10. Հայտարարել String փոփոխական եւ տպել նրանում եղած 'a' տառերի քանակը։");
        String text = "Wherever life plants you, bloom with grace";
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a')
                count++;
        }
        System.out.println("There are " + count + " 'a' characters in line '" + text + "'");

//      11. Հայտարարել String փոփոխական եւ տպել Yes եթե նրանում կա 'b' տառ եւ 'no' հակառակ դեպքում:
        separateSections("11. Հայտարարել String փոփոխական եւ տպել Yes եթե նրանում կա 'b' տառ եւ 'no' հակառակ դեպքում:");
        text="“Happiness is letting go of what you think your life is supposed to look like and celebrating it for everything that it is”";
        if( text.contains("b"))
            System.out.println(true);
        else
            System.out.println(false);

//        12. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել 2-ի աստիճան հանդիսացող էլեմենտների քանակը։
separateSections("12. Հայտարարել int -երի զանգված եւ լցնել այն։ Տպել 2-ի աստիճան հանդիսացող էլեմենտների քանակը։");
        int[] arr1={3,24,1,16,20,53,32,64,128};
        int q=0;
        for(int element:arr1){
            int a=2;
            while(a<element)
                a*=2;
            if(a==element)
                q++;
        }
        System.out.println(q);

//Section 2
        System.out.println("_________________________________________________");
        separateSections("Section 2");
        FunctionManager object=new FunctionManager();
        separateSections("1. parameter stanal 2 int veradarcnel dranc gumary");
        System.out.println(object.sumOfIntegers(2,3));
        separateSections("2. parameter stanal 2 double veradarcnel dranc artadryaly");
        System.out.println(object.productOfDoubles(2.5,2));
        separateSections("3. parameter stanal 2 float tpel \"Yes\" ete arajiny mec e 2rdic ev \"No\" hakarak depkum");
        System.out.println(object.firstIsGreaterThanSecond(0.5F,2F));
        //4. parameter stanal 3 hat long u tpel dranicic amenamecy
        separateSections("4. parameter stanal 3 hat long u tpel dranicic amenamecy");
        System.out.println(object.maxOfThreeLongs(45L,2L,-8L));
        //5. parameter stanal Human tipi obect u tpel "Yes" ete txa e ev "No" hakarak depkum
        separateSections("5. parameter stanal Human tipi obect u tpel \"Yes\" ete txa e ev \"No\" hakarak depkum");
       Human Mery=new Human("Mery", "Mkrtchyan" ,'f',1998);
        object.isMale(Mery);
        //6. parametet stanal 3 hat Human object u veradarcnel amenameci azganuny
        separateSections("6. parametet stanal 3 hat Human object u veradarcnel amenameci azganuny");
        Human Vahram=new Human("Vahram", "Papazyan", 'm', 1975);
        Human Lolita=new Human("Lolita", "Topchyan", 'f', 2001);
        System.out.println(object.oldestHuman(Mery,Vahram,Lolita));

    }
    public static void separateSections(String title){
        System.out.println("\n--------------------------------------------------------------");
        System.out.println(title);
    }
}
