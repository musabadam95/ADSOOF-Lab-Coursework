public class Ex6
{
    public static void main(String[]args){
        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(2);
        ls=ls.cons(5);
        ls=ls.cons(2);
        ls=ls.cons(3);
        ls=ls.cons(2);
        ls=ls.cons(1);
        System.out.println(check(ls,2,0));

    }

    public static LispList<Integer>check(LispList<Integer> blarg,int a,int index){
        LispList<Integer> alpha=LispList.empty();
        if(blarg.isEmpty()){

            return alpha;
        }else{
            index++;
            int b=blarg.head();

            alpha=check(blarg.tail(),a,index);
            if(b==a){

                return alpha.cons(index-1);
            }else{

                return alpha;
            }
        }}
}

