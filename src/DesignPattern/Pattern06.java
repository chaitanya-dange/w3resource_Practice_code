package DesignPattern;

public class Pattern06 {
    public static void main(String[] args) {

        int count=0;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                count=count+1;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
}
