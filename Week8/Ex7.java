import java.util.ArrayList;
public class Ex7
{
    public static void main(String[]args){
        ArrayList<Integer>numbers=new ArrayList<Integer>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        checker<Integer>chack=new GreaterNum();
        destr(chack,numbers);
        System.out.println(numbers);

        ArrayList<String>letter=new ArrayList<String>();
        letter.add("blarg");
        letter.add("blarglkjdsfal");
        letter.add("blargasadf");
        letter.add("blarga");
        checker<String>c=new GreaterStr(5);
        destr(c,letter);
         System.out.println(letter);
    }

    public static<T> void destr (checker<T>c,ArrayList<T>a){
        int i=a.size()-1;
        while(i>0){
            if(!c.checks(a.get(i))){
                a.remove(i);

            }
            i--;
        }

    }
}
