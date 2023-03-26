package DesignPattern;

public class Pattern12 {
    public static void main(String[] args) {

        int count=0;
        for(int i=1;i<=5;i++){
            for( int j=1;j<=3;j++){
                System.out.print(i+count+" ");
                count=count+5;
            }
            count=0;
            System.out.println();
        }
    }
}
