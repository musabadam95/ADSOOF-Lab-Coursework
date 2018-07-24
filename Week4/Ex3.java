public class Ex3
{
    public static void main(String[]args){

        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(15);
        ls=ls.cons(4);
        ls=ls.cons(5);
        ls=ls.cons(7);
        ls=ls.cons(8);
        ls=ls.cons(9);
        ls=ls.cons(10);
        System.out.println(filter(ls,8));
        System.out.println(loopy(ls,8));
    }

    public static LispList<Integer> filter(LispList<Integer>blarg,int o){
        LispList<Integer> filtered=LispList.empty();

        if(blarg.isEmpty()){
            System.out.println("blargs");
            return filtered;}
        else{
            //assign number to a
            int a=blarg.head();
            filtered=filter(blarg.tail(),o);
            if(a>=o) {
                //return it back to filtered
                return filtered.cons(a);
            }else{

                //return filtered list back
                return filtered;
            }
        }
    }

    public static LispList<Integer>loopy(LispList<Integer>blargz,int o){
        LispList<Integer> filtered=LispList.empty();

        while (!blargz.isEmpty()){

            if(blargz.head()<o){
                blargz=blargz.tail();

            }else{

                filtered=filtered.cons(blargz.head());
                blargz=blargz.tail();

            }

        }
        System.out.println("empy");
        return filtered;
    }
}
