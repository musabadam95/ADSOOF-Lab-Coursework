import java.util.ArrayList;
import javax.swing.*;
public class RobotCompany extends CanBuyer
{
    public RobotCompany(int com,ArrayList<DrinksMachine>Macs){
        super(com,Macs);
        this.commision=com;

    }

    public static void main(String[]args){
        //Arraylist to store instances of CanBuyer
        ArrayList<CanBuyer>robots=new ArrayList<CanBuyer>();
        int totalcon=0;
        //Drinksmachines setup
        ArrayList<DrinksMachine>Machines=new ArrayList<DrinksMachine>();
        DrinksMachine mac1=new DrinksMachine(10,10,10);
        Machines.add(mac1);
        mac1=new DrinksMachine(5,10,10);
        Machines.add(mac1);

        ///////////
        CanAndCash a;
        CanBuyer robot1=new CanBuyer(2,Machines);
        a=robot1.buyCoke(40);
        System.out.println(a.can.toString());
        a=robot1.buyFanta(40);
        System.out.println(a.can.toString());

        //////////////////////////////////
        //ExCanBuyer
        /////////////////////////////////
        ArrayList<DrinksMachine>ExMachines=new ArrayList<DrinksMachine>();
        DrinksMachine Exmac1=new DrinksMachine(10,10,10);
        ExMachines.add(Exmac1);
        ExtDrinksMachine1 Exmac2=new ExtDrinksMachine1(5,10,10,10);
        ExMachines.add(Exmac2);
        ExCanBuyer Exrobot=new ExCanBuyer(2,ExMachines);
        a=Exrobot.buySprite(40);
        System.out.println(a.can.toString());
        robots.add(robot1);
        robots.add(Exrobot);

        totalcon=totalcommision(robots); 
        System.out.println("total is "+totalcon);
    }

    public static ArrayList<CanBuyer> addRobot(ArrayList<CanBuyer>robots){
        ArrayList<DrinksMachine>ExMachines=new ArrayList<DrinksMachine>();
        DrinksMachine Exmac2=new DrinksMachine(5,10,10);
        ExMachines.add(Exmac2);
        robots.add(new ExCanBuyer(2,ExMachines));
        return robots;
    }

    public static int totalcommision( ArrayList<CanBuyer>robots){
        int totalcommision=0;
        int i=0;
        CanBuyer Exrobot;
        while(i<robots.size()){
            Exrobot=robots.get(i);
            totalcommision=totalcommision+Exrobot.comamount;

            i++;
        }
        return totalcommision;
    }
}
