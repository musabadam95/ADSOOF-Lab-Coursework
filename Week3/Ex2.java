
public class Ex2
{
    public static void main(String[]args){
        String a="redivider";
        boolean flag=check(a);
        System.out.println(flag);
    }

    public static boolean check(String a){
        int test= a.length();
        boolean flag=false;
        String finals="";
        String [] news=new String[a.length()];
        int o=0;
        //check if the string length is odd number since odd numbers have a integer median
        if(test % 2 != 0){
            for(int i=a.length()-1;i>=0;i--){
                news[o]=String.valueOf(a.charAt(i));
                o++;
            }
            for(int i=0;i<=news.length-1;i++){
                finals+=news[i];
            }
            if(finals.equals(a)){
                flag=true;
            }else{
                flag=false;
            }

        }else{

            return false;
        }
        return flag;
    }

}
