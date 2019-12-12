package Homework_12_12_2019;

public class FunctionManager {
//    1. parameter stanal 2 int veradarcnel dranc gumary
    public int sumOfIntegers(int x, int y){
        return x+y;
    }
//   2. parameter stanal 2 double veradarcnel dranc artadryaly
    public double productOfDoubles(double x, double y){return x*y;}
    //3. parameter stanal 2 float tpel "Yes" ete arajiny mec e 2rdic ev "No" hakarak depkum
    public String firstIsGreaterThanSecond(float a, float b){
        return a>b?"Yes":"No";
            }
//4. parameter stanal 3 hat long u tpel dranicic amenamecy
    public long maxOfThreeLongs(long a,long b, long c){
      return  maxOfTwoLongs(a,maxOfTwoLongs(b,c));
    }
    public long maxOfTwoLongs(long a, long b){
        return a>b?a:b;
    }
 //   5. parameter stanal Human tipi obect u tpel "Yes" ete txa e ev "No" hakarak depkum
    public void isMale(Human human){
        if(human.getGender()=='m')
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    //6. parametet stanal 3 hat Human object u veradarcnel amenameci azganuny
    public String oldestHuman(Human a, Human b, Human c){
        Human oldest=a;
   if(a.getYearOfBirth()>b.getYearOfBirth())
       oldest=b;
   if(oldest.getYearOfBirth()>c.getYearOfBirth())
       oldest=c;
   return oldest.getLastName();
    }
    //7. parameter stanal 2 hat Human object u tpel dranc anunnery irar koxk
    public void printNamesOfHumans(Human a, Human b){
        System.out.println(a.getFirstName()+"   "+b.getFirstName());
    }
    //8. parameter stanal mi hat boolean popoxakan ev mi hat Human, tpel human i anuny ete boolean popoxakany true e, isk ete false e tpel azganuny
    public  void printNameOrSurname(boolean t, Human human){
        System.out.println(t?human.getFirstName():human.getLastName());}
        //9. parameter stanal int eri zangvac, veradarcnel zangvaci maximal elementy
        public int maxInIntArray(int[] ints){
        int max=ints[0];
            for(int i=1; i<ints.length; i++)
                if(ints[i]>max)
                    max=ints[i];
                return max;
        }
        //10. parameter stanal float eri zangvac veradarcnel zangvaci minimal elementi INDEX-y
        public int indexOfMinInFloatArray(float[] floats){
            int min=0;
            for(int i=1; i<floats.length; i++)
                if(floats[i]<floats[min])
                    min=i;
            return min;
        }

}
