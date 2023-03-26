package Recursion_Problems_Kunal_Playlist;

public class _06_printingUsingRecursion_Reverse_Straight_BothAtTimes {
    public static void main(String[] args) {
        print(5);  //5 4 3 2 1
        System.out.println("-----------------------------------------");
        printReverse(5); // 1 2 3 4 5
        System.out.println("-----------------------------------------");
        printStraightReverse(5);
    }

    static void printReverse(int number){

        // base condition
        if(number==0){
            return;
        }
        printReverse(number -1);
        System.out.println(number);


    }

    static void print(int number){

        // base condition
        if(number==0){
            return;
        }
        System.out.println(number);
        printReverse(number -1);

    }

    static void printStraightReverse(int number){

        // base condition
        if(number==0){
            return;
        }

        System.out.println(number);

       printStraightReverse(number-1);

        System.out.println(number);

    }



}
/*
Just by changing position of  sout 1st then recursive which print (5,4,3,2,1)  to 1 recursive fuction then sout
the print will happen from (1,2,3,4,5...). this is happening because
first all call will get completed then printing will perform..
 */
