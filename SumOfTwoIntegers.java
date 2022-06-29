/***
* Given two integers a and b, return the sum of the two integers without using the operators + and -.
*/
public class SumOfTwoIntegers{
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
}
