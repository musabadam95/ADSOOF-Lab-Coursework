public class q6
{

    public static void main(String[]args){
        int []arr={17,11,20,34,5,10,8,19,55,11,13};
        int [] arr3=check(arr);
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }
    }

    public static int [] check(int[]arr1){
        int target =12;
        int [] arr2;
        int count =0;
        for(int i=0;i<arr1.length;i++){

            if(arr1[i]>=12){
                count++;
            }
        }
        arr2=new int[count];

        int i=0;

        for(int a=0;a<arr1.length;a++){
            if(arr1[a]>=12){
                arr2[i]=arr1[a];
                i++;
            }
        }
        return arr2;
    }
}
