import java.util.*;
public class ExCanBuyer extends CanBuyer
{

    public ExCanBuyer(int com,ArrayList<DrinksMachine>Macs)
    {
        super(com,Macs);
        this.commision=com;
    }

    public CanAndCash buySprite(int money){
        int i=0;
        DrinksMachine currentmachine=Machines.get(i) ;
        ExtDrinksMachine1 Excurrentmachine ;
        while(i<Machines.size()){
            currentmachine =Machines.get(i);
            if(currentmachine instanceof ExtDrinksMachine1){
                System.out.println(true);
                break;
            }
            i++ ;
        }

        if(i>Machines.size()){
            System.out.println("no more cans left");
            System.exit(0);
        }
        ExtDrinksMachine1 cheapmachine=(ExtDrinksMachine1)currentmachine ;
        i++;
        while(i<Machines.size()){
            if(Machines.get(i) instanceof ExtDrinksMachine1==false){
                i++;
            }else{
                Excurrentmachine =(ExtDrinksMachine1)Machines.get(i);
                if(!Excurrentmachine.spritesEmpty()){
                    if(Excurrentmachine.price>cheapmachine.price){
                        cheapmachine=Excurrentmachine;
                    }else{                   
                    }
                    i++;
                }else{
                    i++;
                }   
            }
        }
        cheapmachine.insert(100);
        Can myCan=cheapmachine.pressSprite();
        this.comamount=this.comamount+this.commision;
        int change=cheapmachine.pressChange()-comamount;
        CanAndCash customer=new CanAndCash(myCan,change);
        return customer;
    }
}
