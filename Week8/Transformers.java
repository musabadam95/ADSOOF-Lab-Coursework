import java.util.ArrayList;

class Transformers
{
    public static void main(String[]args){
          LispList<Integer> ls=LispList.empty();
        ls= ls.cons(2);
        ls=ls.cons(4);
        ls=ls.cons(5);
        ls=ls.cons(7);
        ls=ls.cons(8);
        ls=ls.cons(9);
        Transformer<Integer> adder = new TenTimes();
        System.out.println(transformList(adder,ls)); 
        ArrayList<String>letters=new ArrayList<String>();
        letters.add("blarg");
        letters.add("blarg2");
        letters.add("blarg3");
        Transformer<String> words = new Ex6("hello");
        System.out.println(applyConst(words,letters));

        LispList<String>lettersLisp=LispList.empty();
        lettersLisp= lettersLisp.cons("blarg");
        lettersLisp=  lettersLisp.cons("blarg2");
        lettersLisp= lettersLisp.cons("blarg3");
        System.out.println(transformList(words,lettersLisp));
    }

    public static <T> ArrayList<T> applyConst(Transformer<T> tran,ArrayList<T> a)
    {
        ArrayList<T> b = new ArrayList<T>();
        for(int i=0; i<a.size(); i++)
            b.add(tran.transform(a.get(i))); 
        return b;
    }

    public static <T> void applyDest(Transformer<T> tran,ArrayList<T> a){
        for(int i=0; i<a.size(); i++)
            a.set(i,tran.transform(a.get(i))); 
    }

    public static <T>LispList<T> transformList(Transformer<T>tran,LispList<T>lp1){
        LispList<T> total=LispList.empty();
        while(!lp1.isEmpty()){
            total=total.cons(tran.transform(lp1.head()));
            lp1=lp1.tail();
        }    
        return total;
    }

}
