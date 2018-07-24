import javax.swing.*;
public class q6
{
    public static void main (String[]args){

        endresuk();
    }
    public static void endresuk(){
        int onecash=0;
        int twocash=0;
        DrinksMachine one= new DrinksMachine(10,10,10);
        DrinksMachine two=new DrinksMachine(50,10,10);
        while((JOptionPane.showInputDialog("Would you like to buy a drink")).equals("yes")){
            if(JOptionPane.showInputDialog("Please pick machine 1 or machine 2").equals("1")){
                //Select machine, if input is 1 then use machine one else use machine two 
                //insert coins
                if((JOptionPane.showInputDialog("Can 1 or 2")).equals("1")){
                    one.insert(50);
                    Can a =new Can("Cola");
                    //select drink
                    a=one.pressCoke();
                    //selected drink 1
                    onecash+=one.collectCash();
                    //add cash to total of machine 1
                    System.out.println("one");
                    System.out.println(onecash);
                }
                else{
                    one.insert(50);
                    Can b =new Can("Fanta");
                    b=one.pressFanta();
                    onecash+=one.collectCash();
                    System.out.println("one2");
                    System.out.println(onecash);
                }
            }else{ 

                if(JOptionPane.showInputDialog("Can 1 or 2").equals("1")){
                    //select drink
                    two.insert(50);
                    Can a =new Can("Cola");
                    a=two.pressCoke();
                    //selected drink 1
                    twocash+=two.collectCash();
                    System.out.println("two");
                    System.out.println(twocash);
                    //add cash to total of machine 1
                }
                else{
                    two.insert(50);
                    Can b =new Can("Fanta");
                    b=two.pressFanta();
                    twocash+=two.collectCash();
                    System.out.println("one2");
                    System.out.println(twocash);
                }
            }
        }
        if(onecash>twocash){
            System.out.println("Machine one" + "(£"+onecash+") total is greater than machine two " + "(£"+twocash+")");
        }else{
            System.out.println("Machine two" + "(£"+twocash+") total is greater than machine one " + "(£"+onecash+")");
        }
    }
}

