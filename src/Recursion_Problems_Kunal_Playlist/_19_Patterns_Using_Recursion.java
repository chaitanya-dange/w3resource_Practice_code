package Recursion_Problems_Kunal_Playlist;

public class _19_Patterns_Using_Recursion {
    public static void main(String[] args) {
        //patter19(4,0);
       // patterRev19(4,0);
        square(4,0);

//
    }

    static void patter19(int row, int column){
        if(row==0){
            return ;
        }
        if(column<row){
            System.out.print("*");
            patter19(row,column+1);
        }else{
            System.out.println();
            patter19(row-1,0);
        }
    }

    static void patterRev19(int row, int column){
        if(row==0){
            return ;
        }
        if(column<row){

            patterRev19(row,column+1);
            System.out.print("*");
        }else{

            patterRev19(row-1,0);
            System.out.println();
        }
    }

    static void square(int row, int column){
        if(row==0){
            return ;
        }
        if(column<row){

            square(row,column+1);
            System.out.print("*");
        }else{

            square(row-1,0);
            System.out.println();
        }
    }
}
