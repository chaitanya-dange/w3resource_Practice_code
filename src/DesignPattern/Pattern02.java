package DesignPattern;

public class Pattern02 {
    public static void main(String[] args) {
        int count=1;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print(count);

            }
            count=count+1;
            System.out.println();
        }
    }
}
