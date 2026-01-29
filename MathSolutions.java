import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    // Self Dividing Numbers
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
        for (int i =left; i<=right; i++) {
            if (isSelfDividing(i)) {
                result.add(i);
            }
        }
        return result;
    }

    private boolean isSelfDividing(int num) {
    int original = num;
    while (num > 0) {
        int digit = num % 10;
        if (digit == 0 || original % digit != 0) {
            return false;
        }
        num /= 10;
    }
        return true;
    }

    // Calculate Delayed Arrival Time
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    //Missing Number
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++) {
            if (nums[i]!=i)
              return i;
    }   
    return nums.length;
    }

    //Maximum 69 Number
    public int maximum69Number (int num) {
        String numStr = String.valueOf(num);
        numStr = numStr.replaceFirst("6", "9");
        return Integer.parseInt(numStr);
    }

    //Fizz Buzz
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    
}