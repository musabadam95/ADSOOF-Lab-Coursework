public class Ex1
{
    public static void main(String[]args){
        int[]alpha=new int[args.length];
        for(int i =0;i<args.length;i++){
            alpha[i]=Integer.parseInt(args[i]);

        }
        System.out.println(sum(alpha));
    }

    public  static int sum(int[]alpha){
        int msum=0;
        int sum=0;
        int count=0;
        while(count!=alpha.length){
            //add the element to sum
            sum=sum+alpha[count];
            //if sum is greater than msum then replace msum
            //msum holds the peak integer of sum
            if(msum<sum){
                msum=sum;
                //else if sum is negative, cancel the ongoing sum 
              }else if(sum<0){

                sum=0;
            }
            //increment
            count++;
        }
        return msum;
    }
}
