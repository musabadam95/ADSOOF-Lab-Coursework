public class Ex1
{
    public static void main(String[]args){
        String a="antidisestablishment";
        String b="blis";
        boolean flag=checker(a,b);
        System.out.println(flag);
    }

    public static boolean checker(String a, String b){
        //assaign the length of both strinbgs to seperate int values ready for the loop 
        int lengtha=a.length();
        int lengthb=b.length();
        //initalise counters for the loop 
        int test=0;
        int testb=0;
        int count=0;
        if(a.length()<b.length()){
            System.out.println("A substring cannot be bigger than the original string");
            return false;
        }
        boolean flag=false;
        //if the test counter equals to lengtha then the loop has reached the last character and therefore must stop
        while(test!=lengtha){
            //assign the characters to char variables
            char one=a.charAt(test);
            char two=b.charAt(testb);
            //if both char are the same then increment the count and the second string letter
            if(one==two){

                count++;
                testb++;
            }else{
                //else reset the count back to 0 and testb back to zero to starta all over again 
                count=0;
                testb=0;
            }
            //if the count reaches the exactc number of the second string length then the second string is a sub string of the first string
            if(count==b.length()){
                flag=true;
                break;
            }
            test++;
        }
        return flag;
    }
}
