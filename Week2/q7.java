public class q7
{
    public static void main(String[]args){
        int []arr={3,8,1,16,19,27,30};

        boolean blarg=check(arr);
        System.out.println(blarg);
    }

    public static boolean check(int[]arr1){
        boolean flag=false;
        
            for(int i=0;i<arr1.length;i++){
                
        if(arr1[i]<=arr1[i+1]){
                flag=true;
                }else {
                flag=false;
                break;
                }
        }

        return flag;
    }
}
