import java.util.*;
public class Ex7
{
    public static void main(String[]args){
        ArrayList<Integer>ar1=new ArrayList<Integer>(); 
        ar1.add(1);
        ar1.add(2);
        ar1.add(3);
        ar1.add(1);

        ArrayList<Integer>ar2=new ArrayList<Integer>(); 
        ar2.add(4);
        ar2.add(1);
        ar2.add(5);
        ar2.add(1);

        ArrayList<Integer>ar3=new ArrayList<Integer>(); 
        ar3.add(1);
        ar3.add(1);
        ar3.add(1);
        ar3.add(1);

        ArrayList<ArrayList<Integer>>alpha=new ArrayList<ArrayList<Integer>>();
        alpha.add(ar1);
        alpha.add(ar2);
        alpha.add(ar3);
        ArrayList<ArrayList<Integer>>sierra=check(alpha,2);
        if(sierra.get(0)==alpha.get(1)){
        System.out.println("blarg");
        }
        System.out.println(sierra);

    }

    public static ArrayList<ArrayList<Integer>> check(ArrayList<ArrayList<Integer>>alpha,int t){
        int count =0;
        ArrayList<Integer>bravo;
        ArrayList<ArrayList<Integer>>charlie=new ArrayList<ArrayList<Integer>>();
        boolean test=false;
        while(count<alpha.size()){

            for(int i=0;i<alpha.get(count).size();i++){
                if(alpha.get(count).get(i)==t){
                    test=true;
                    break;
                }

            }
            if(test==false){
                bravo=alpha.get(count);
                charlie.add(bravo);
            }
            test=false;
            count++;

        }
  
        return charlie;
    }
}
