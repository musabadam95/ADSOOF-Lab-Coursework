public class Ex2P3
{
    public static void main (String[]args){
        LispList<Integer> ls=LispList.empty();
        ls= ls.cons(2);
        ls=ls.cons(4);
        ls=ls.cons(8);
        ls=ls.cons(7);
        ls=ls.cons(8);
        ls=ls.cons(9);

        System.out.println(ls);
        int count =0;
        System.out.println(check(ls,count));
        System.out.println(checkz(ls));
    }

    public static int check(LispList<Integer>blarg,int count){
        boolean flag=false;
        if(blarg.isEmpty()){
           return count;
        }else if(blarg.head()!=8){
            System.out.println("ney");
            return check(blarg.tail(),count);
        }else{
            count++;
        return check(blarg.tail(),count);
        }
    }

    public static int checkz(LispList<Integer>blargs){
        int count=0;
        boolean flag=false;
        while(!blargs.isEmpty()){
            if(blargs.head()!=8){
            flag=true;
            
            }else{
                count++;
            
            }
            blargs=blargs.tail();
            
        }
        return count;

    }
}
// head() gets the first value of the lisplist
// tail() returns a new lisplist by removing the the head of the original list 