public class q4
{
    public static void main (String[]args){

        int[]arr={2,9,30,47,5,10,20,36,21,11,13};
        int point=find(arr);
        System.out.println(arr[point]+ " "+point);
    }

    public static int find(int[]arr1){
        int target=37;
        int distance=Math.abs(arr1[0]-target);
        int bravo=0;
        for(int i=1;i<arr1.length;i++){
            //checks what is the smallest difference
            int alpha=Math.abs(arr1[i]-target);
            if (alpha<distance){
                bravo=i;
                distance=alpha;
            }
            
        }
        return bravo;
    }
}