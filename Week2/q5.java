public class q5
{
    public static void main(String[]args){
        int []arr={7,11,13,8,5,8,10,27,30,11,5};
        between(arr);
    }

    public static void between(int[]arr1){
        int alpha=8;
        int bravo=27;
        int count=0;
        int count1=0;
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]==alpha){

                count=i;
                break;
            }
        }
        for(int a=0;a<arr1.length;a++){
            if(arr1[a]==bravo){
                count1=a;
            }
        }

        int[]arr2=new int[count1-count+1];
        for(int p=0;p<arr2.length;p++){
            for(int l=count;l<=count1;l++){

                arr2[p]=arr1[l];
                p++;
            }
        }

        for(int z=0;z<arr2.length;z++){
            System.out.println(arr2[z]);
        }

    }
}
