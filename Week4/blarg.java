import java.util.*;
public class blarg
{
    // instance variables - replace the example below with your own
    public static void main(String[]args){
 ArrayList<Integer> arr2 = new ArrayList<Integer>(); 
 int i =0;
 arr2.add(i++);
 arr2.add(i++);
 arr2.add(i++);
 arr2.add(i++);arr2.add(i++);
 arr2.add(i++);
        System.out.println(methodB(arr2,0));
    }

    public static <T> ArrayList<T> methodB(ArrayList<T> arr1, int p)  {
        System.out.println(arr1);
        if(p>=arr1.size()) return new ArrayList<T>(); 
        ArrayList<T> arr2 = methodB(arr1,p+1);
        arr2.add(arr1.get(p));
        return arr2;  } 

}

