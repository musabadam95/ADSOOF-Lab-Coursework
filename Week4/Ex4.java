public class Ex4
{
    public static void main (String[]args){
        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(2);
        ls=ls.cons(4);
        ls=ls.cons(5);
        ls=ls.cons(7);
        ls=ls.cons(8);
        ls=ls.cons(9);

        
        int count =5;
        System.out.println(check(ls,count));

    }

    public static LispList<Integer> check( LispList<Integer> blargz,int count){

        LispList<Integer> filtered=LispList.empty();
        if(blargz.isEmpty()){

            return filtered;
        }else{
            int a =blargz.head();
            filtered=check(blargz.tail(),count);
            if(a==count){
                return filtered= blargz.tail();
            }else{
                return filtered;
            }

        }
    }
}
