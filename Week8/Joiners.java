import java.util.*;
class Joiners{
    public static void main(String[]args){

        ArrayList<Integer>total2=new ArrayList<Integer>();
        total2.add(10);
        total2.add(20);
        total2.add(30);
        ArrayList<Integer>total1=new ArrayList<Integer>();
        total1.add(20);
        total1.add(40);
        total1.add(50);
        Joiner<Integer>j=new JoinByAdding();
        System.out.println(zipArrayLists(j,total1,total2));
        
        
       System.out.println(Joiners.fold(j,total2));
       
       
       Joiner<String>s=new Joinz();
       ArrayList<String>mixed=new ArrayList<String>();
       
       
       mixed.add("blarg");
       mixed.add("blarg");
       mixed.add("blarg");
       mixed.add("blarg");
        System.out.println(Joiners.fold(s,mixed));
       
    }

    public static <T> LispList<T> zipLists(Joiner<T> joiner,LispList<T> ls1,LispList<T> ls2)
    {
        if(ls1.isEmpty()||ls2.isEmpty())
            return LispList.empty();
        else
        {
            T h = joiner.join(ls1.head(),ls2.head());
            LispList<T> t = zipLists(joiner,ls1.tail(),ls2.tail());
            return t.cons(h);
        }
    }

    public static <T> ArrayList<T> zipArrayLists(Joiner<T> joiner,ArrayList<T>ar1,ArrayList<T>ar2){
        if(ar1.size()==0||ar2.size()==0){
            return null;
        }else{
            ArrayList<T>total=new ArrayList<T>();
            for(int i=0;i<ar1.size()&&i<ar2.size();i++){
                T h =joiner.join(ar1.get(i),ar2.get(i));
                total.add(h);            
            }
            return total;       
        }
    }

    public static<T>T fold(Joiner<T> j,ArrayList<T>ar1){

       T sum=ar1.get(0);
         
            for(int i=1;i<ar1.size();i++){
                sum=j.join(sum,ar1.get(i)); 
            } 

            return sum;   
        }


    }

