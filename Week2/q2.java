import javax.swing.*;
public class q2
{

    public static void main(String[]args){
        int[]number={1,2,4,6,8};
        int a=Integer.parseInt(JOptionPane.showInputDialog("Enter number"));
        checkar(number,a);
    }

    public static void checkar(int[]number,int a){
        int count=0;
        for(int i=0;i<number.length;i++){
            if(number[i]<a){
                count++;
            }
        }
        System.out.println(count);
    }
}
