public class Ex2P2
{
    public static void main (String[]args){
        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(2);
        ls=ls.cons(4);
        ls=ls.cons(5);
        ls=ls.cons(7);
        ls=ls.cons(8);
        ls=ls.cons(9);

        System.out.println(ls);
        int count =0;
        System.out.println(check(ls,count));
        System.out.println(checkz(ls));
    }

    public static boolean check(LispList<Integer>blarg,int count){
        boolean flag=false;
        if(blarg.isEmpty()){

            return flag;
         
        }else if(blarg.head()!=8){

            return check(blarg.tail(),count);
        }else{
            flag=true;
            return flag;
        }

    }

    public static boolean checkz(LispList<Integer>blargs){
        int count=0;
        boolean flag=false;
        while(!blargs.isEmpty()){
            if(blargs.head()!=8){
                flag=true;

            }else{
                flag=false;
            }
            blargs=blargs.tail();

        }
        return flag;

    }
}
// head() gets the first value of the lisplist
// tail() returns a new lisplist by removing the the head of the original list 