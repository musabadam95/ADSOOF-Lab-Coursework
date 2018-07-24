import java.util.*;
public class Ex11
{
    public static void main(String[]args){
        String []prep={"tomato","cheese","chips","fruit","pie","butter","tea","buns"};
        ArrayList<String>alpha=new ArrayList<String>();
        for(int i=0;i<prep.length;i++){
            alpha.add(prep[i]);

        }
        ArrayList<String>charlie=check(alpha,"chips","buns");
        if(charlie.get(0)==alpha.get(1)){
            System.out.println("blarg");
        }
        System.out.println(charlie);
    }
    public static <T>ArrayList<T> check(ArrayList<T>alpha,T first,T last){
        ArrayList<T>bravo=new ArrayList();
        int start=0;
        int finish=0;
        for(int i=0;i<alpha.size();i++){
            if(alpha.get(i).equals(first)){
                start=i;

            }else if (alpha.get(i).equals(last)){
                finish=i;
            }
        }
        //if it finds the second string first then error
        if(finish<start){
            System.out.println("Error the final word was found first");
            return null;
        }
        for(int i=finish;i>=start;i--){
            bravo.add(alpha.get(i));

        }
        return bravo; 
    }
}
