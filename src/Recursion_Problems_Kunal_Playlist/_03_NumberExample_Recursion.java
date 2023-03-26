package Recursion_Problems_Kunal_Playlist;

public class _03_NumberExample_Recursion {

    public static void main(String[] args) {
        print(0);
    }
    static void print(int n){

        //BASE CONDITION (simple if condition that will stop further recursive call)  if not provided the memory exceeds(StackOver Flow error)

        if(n==5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n+1);
    }
}

// ONly  one recursion called as tail recursion...
// converting recursion into formula is called as Recurssive relations...
