
public class q3
{
    public static void main(String[]args){
        int []num={1,4,5,7,10,12};
        int []mun={1,4,5,7,10,12};
        destruct(num,12,5);

        for(int i =0;i<num.length;i++){
            System.out.println(num[i]);
        }
        int []news=construct(mun,12,5);
        
        for(int i =0;i<news.length;i++){
            System.out.println(news[i]);
        }
    }

    public static void destruct(int[]alpha,int number1,int number2){
        for(int i =0;i<alpha.length;i++){
            if(alpha[i]<number1){
                alpha[i]=alpha[i]*number2;
            }
        }

    }

    public static int[] construct(int[]bravo,int numbe1,int number2){
        int[]news=new int[bravo.length];
        for(int i=0;i<news.length;i++){
            if(bravo[i]<numbe1){
                news[i]=bravo[i]*number2;
            }else{
                news[i]=bravo[i];
            }
        }
        return news;
    }
}
