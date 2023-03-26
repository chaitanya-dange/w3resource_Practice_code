package String;

public class _39_FirstNonRepetativeElementOfString {
    public static void main(String[] args) {
        String str="gibblegabbler";
        //Method 01
        char[] charArray= str.toCharArray();

        int count=1;
       int index=-1;
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    count=count+1;
                  //  break;


                }
            }
            if(count==1){
                index=i;
                System.out.println(i);
                break;
            }
            count=1;

        }




    }
}
