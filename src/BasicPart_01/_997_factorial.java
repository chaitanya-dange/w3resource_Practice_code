package BasicPart_01;

public class _997_factorial {
    public static void main(String[] args) {
        int sum=calFactorial(5);
        System.out.println(sum);


    }

    static int calFactorial(int number){
        if(number>=1) {
            System.out.println(number);
            return (number * calFactorial(number - 1));
        }
        return 1;
    }
}


