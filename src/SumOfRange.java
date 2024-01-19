import java.util.Scanner;

public class SumOfRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long input1=scanner.nextLong();
        long input2=scanner.nextLong();

        long number1=Math.min(input1,input2);
        long number2=Math.max(input1,input2);
        summationAllNumber(number1,number2);
        summationOfEvenNumbers(number1,number2);
        summationOfOddNumbers(number1,number2);
    }

    private static void summationOfOddNumbers(long number1, long number2) {
        long sum1,sum2,total;
        long nFirst,nLast;
        if (number1%2==0&&number2%2==0)
        {
            nFirst=number1/2;
            sum1=nFirst*nFirst;
            nLast=number2/2;
            sum2=nLast*nLast;
            total=sum2-sum1;
            System.out.println(total);
        }else
        {
            nFirst=(number1)/2;
            sum1=nFirst*nFirst;
            nLast=(number2+1)/2;
            sum2=nLast*nLast;
            total=sum2-sum1;
            System.out.println(total);
        }
    }

    private static void summationOfEvenNumbers(long number1, long number2) { // 1 7
        long sum1,sum2,total;
        long nFirst,nLast;
        if (number1%2==0&&number2%2==0)
        {
            nFirst=number1/2;
            sum1=(nFirst*(nFirst+1)) -number1;
            nLast=number2/2;
            sum2=nLast*(nLast+1);
            total=sum2-sum1;
            System.out.println(total);
        }else
        {
            nFirst=(number1-1)/2;
            sum1=(nFirst*(nFirst+1));
            nLast=number2/2;
            sum2=nLast*(nLast+1);
            total=sum2-sum1;
            System.out.println(total);
        }
    }

    private static void summationAllNumber(long number1, long number2) {
        long sum;
        long n=number2-number1+1;
        sum=n*(number1+number2)/2;
        System.out.println(sum);
    }
}
