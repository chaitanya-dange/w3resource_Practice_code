package DesignPattern;

public class Pattern08 {

    public static void main(String[] args) {
        int count=2;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){

                System.out.print(count+" ");
                count=count+2;
            }
            System.out.println();
        }
    }
}
