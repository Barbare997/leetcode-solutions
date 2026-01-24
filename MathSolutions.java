public class MathSolutions {
    //Number of Steps to Reduce a Number to Zero
public int numberOfSteps(int num) {
        int result =0;
        while (num!=0) {
            if (num%2==0)
                num/=2;
            else
                num--;
            result++;
        }
        return result;
}

   //Fibonacci Number
public int fib(int n) {
    if (n==0) return 0;
    if (n==1) return 1;
    return fib(n-1) + fib(n-2);
}

}
