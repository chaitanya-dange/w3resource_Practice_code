package BasicPart_01;

public class _38CountLetterSpaceNumberOtherOfString {
    public static void main(String[] args) {
        String str="  Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        char[] count=str.toCharArray();
        int letterCount=0;
        int spaceCount=0;
        int numberCount=0;
        int otherCount=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLetter(count[i])){
                letterCount=letterCount+1;
            } else if (Character.isDigit(count[i])) {
                numberCount=numberCount+1;
            }else if(Character.isSpaceChar(count[i])) {
                spaceCount=spaceCount+1;
            }else {
                otherCount=otherCount+1;
            }
        }

        System.out.println(letterCount+" ,"+numberCount+","+otherCount+","+spaceCount);
    }
}
