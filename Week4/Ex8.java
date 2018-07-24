public class Ex8
{
    public static void main(String[]args){
        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(10);
        ls=ls.cons(5);
        ls=ls.cons(2);
        ls=ls.cons(5);
        ls=ls.cons(2);
        ls=ls.cons(1);
        LispList<Integer> ms=LispList.empty();
        ms= ms.cons(2);
        ms=ms.cons(5);
        ms=ms.cons(2);

        System.out.println(check(ls,ms));
    }

    public static boolean check(LispList<Integer> alpha,LispList <Integer>bravo){
      
        if(alpha.isEmpty()){

            return false;
        }else if(bravo.isEmpty()){
            return true;
        }else{
           // System.out.println(alpha.head()+" "+bravo.head());
           boolean flag= helps(alpha,bravo.head());
           //System.out.println(flag);
            if(flag){
                return check(alpha.tail(),bravo.tail());
            }
            else{
                return check(alpha.tail(),bravo);
            }
        }
    }

    public static boolean helps(LispList<Integer>alpha,int bravo){

        if(alpha.head()==bravo){
            return true;
        }else{
            return false;
        }
    }
}