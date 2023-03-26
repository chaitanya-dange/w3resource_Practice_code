package Recursion_Problems_Kunal_Playlist;

public class _08_Exercise_SumOf_n_Numbers {
    public static void main(String[] args) {
        System.out.println(sum(100));
    }

    static int sum(int n){
        //base condition
        if(n==0){
            return 0;
        }

        return n+sum(n-1);
    }
}
