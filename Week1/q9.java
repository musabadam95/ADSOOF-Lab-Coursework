import javax.swing.*;
public class q9
{
    public static void main (String[]args){

        endresuk();
    }

    public static void endresuk(){
        int onecash=0;
        int twocash=0;
        DrinksMachine one= new DrinksMachine(10,2,10);
        DrinksMachine two=new DrinksMachine(50,10,10);
        while((JOptionPane.showInputDialog("Would you like to buy a drink")).equals("yes")){

            if(JOptionPane.showInputDialog("Please pick machine 1 or machine 2").equals("1")){

                int bal=Integer.parseInt(JOptionPane.showInputDialog("That will be "+one.getPrice()));
                if(bal<one.getPrice()){
                    System.out.println("Not enough to buy can");
                    endresuk();
                }
                one.insert(bal);
                if((JOptionPane.showInputDialog("Can 1 or 2")).equals("1")){
                    Can a =new Can("Cola");
                    if(one.cokesEmpty()==true){
                        System.out.println("Outof stock");
                    }

                    //select drink
                    a=one.pressCoke();
                    //selected drink 1
                    onecash+=one.collectCash();
                    //add cash to total of machine 1
                    System.out.println("one");
                    System.out.println(onecash);

                }
                else{

                    Can b =new Can("Fanta");
                    if(one.fantasEmpty()==true){
                        System.out.println("Outof stock");
                    }
                    b=one.pressFanta();
                    onecash+=one.collectCash();
                    System.out.println("one2");
                    System.out.println(onecash);
                }
                //second machine
            }else{ 
                int bal=Integer.parseInt(JOptionPane.showInputDialog("That will be "+two.getPrice()));
                if(bal<two.getPrice()){
                    System.out.println("Not enough to buy can");
                    endresuk();
                }
                two.insert(bal);
                if(JOptionPane.showInputDialog("Can 1 or 2").equals("1")){
                    if(one.cokesEmpty()==true){
                        System.out.println("Outof stock");
                    }
                    //select drink
                    Can a =new Can("Cola");
                    a=two.pressCoke();
                    //selected drink 1
                    twocash+=two.collectCash();
                    System.out.println("two");
                    System.out.println(twocash);
                    //add cash to total of machine 1
                }
                else{
                    if(two.fantasEmpty()==true){
                        System.out.println("Outof stock");
                    }
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

