import java.util.*;
public class Ex4
{
    public static void main(String[]args){
        String []prep={"tomato","cheese","chips","fruit","pie","butter","tea","buns"};
        ArrayList<String>alpha=new ArrayList<String>();
        for(int i=0;i<prep.length;i++){
            alpha.add(prep[i]);

        }
        ArrayList<String>bravo=check(alpha);
        for(int i=0;i<bravo.size();i++){
            System.out.print(" "+bravo.get(i));
        }
    }

    public static ArrayList<String>check(ArrayList<String> alpha){
        ArrayList<String>bravo=new ArrayList<String>();
        for(int i=0;i<alpha.size();i++){
            String a=alpha.get(i);
            if(a.length()>4){
                bravo.add(alpha.get(i));
            }
        }
        return bravo;
    }
}