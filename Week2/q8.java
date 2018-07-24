public class q8
{
    public static void main(String[]args){
        int []arr={17,11,20,34,5,10,8,19,55,11,13};
        int[]arr1={17,20,13,19,55,8};
        boolean flag=check(arr,arr1);
        System.out.println(flag);
    }

    public static boolean check(int []arr,int []arr1){
        boolean flag=false;
        int count=0;
        for(int i=0;i<arr.length;i++){
           
            for (int a=0;a<arr1.length;a++){

                if(arr[i]==arr1[a]){
                 count++;
                }else{
                   
                }
            }
          
        }
        if(count==arr1.length){
        flag=true;
        }
        return flag;
    }
}
