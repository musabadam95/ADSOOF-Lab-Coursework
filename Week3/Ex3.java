import java.util.*;
public class Ex3
{
    public static void main(String[]args){
        String []prep={"tomato","cheese","chips","fruit","pie","butter","tea","buns"};
        ArrayList<String>alpha=new ArrayList<String>();
        for(int i=0;i<prep.length;i++){
            alpha.add(prep[i]);

        }
        check(alpha);
        for(int i=0;i<alpha.size();i++){
            System.out.print(" "+alpha.get(i));
        }
    }

    public static void check(ArrayList<String> alpha){
        for(int i=0;i<alpha.size();i++){
            String a=alpha.get(i);
            if(a.length()<4){
                alpha.remove(i);
            }
        }
    }
}
