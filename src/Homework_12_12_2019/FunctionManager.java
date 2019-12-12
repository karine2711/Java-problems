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
}
