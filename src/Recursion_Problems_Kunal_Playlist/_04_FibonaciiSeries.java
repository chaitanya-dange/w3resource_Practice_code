package Recursion_Problems_Kunal_Playlist;

public class _04_FibonaciiSeries {
    public static void main(String[] args) {
        int ans=fibo(4);
        System.out.println(ans);

    }

    static int fibo(int n){
        //base condition
        if(n<2){
            return n;
        }
        return  fibo(n-1)+fibo(n-2);
    }
}

/*

In previous questions of recursion one recuresive call from function

In this fibo , we are calling two recursive call from one fuction .

this is not tail recursion call...

here after some recursion call , the things will start to repeat,this can be solve by
dynamic programming, don't compute it again and again
 */
