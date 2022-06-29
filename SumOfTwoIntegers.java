/***
* Given two integers a and b, return the sum of the two integers without using the operators + and -.
*/
public class SumOfTwoIntegers{
    
    /***
    * To Refresh bitwise operations :  https://en.wikipedia.org/wiki/Bitwise_operation
    *The sum of two numbers can be obtained by performing the XOR (^) operation on these numbers 
    * and adding a carry bit that is obtained by performing the AND (&) operation.
    */
    
    public int getSum(int a, int b){
      while(b != 0){
        //bitwise AND and leftshift bits by 1
        int temp = (a & b) << 1;
        //bitwise XOR
        a = a ^ b; 
        b = temp;
      }
      return a;
    }
    
    public static void main(String[] args){
        System.out.println(new SumOfTwoIntegers().getSum(1,2));
    }
}
