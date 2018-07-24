public class Ex2P1
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
        checkz(ls);
    }

    public static int check(LispList<Integer>blarg,int count){
        if(blarg.isEmpty()){
            System.out.println(count);
            return count;
        }else{
            count++;
            return check(blarg.tail(),count);
        }
     
    }

    public static int checkz(LispList<Integer>blargs){
        int count=0;
        while(!blargs.isEmpty()){
            count++;
            blargs=blargs.tail();
        }
        return count;
    }
}
// head() gets the first value of the lisplist
// tail() returns a new lisplist by removing the the head of the original list 