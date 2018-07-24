import java.util.*;
public class CanBuyer
{
    // instance variables - replace the example below with your own
    protected int commision;
    protected int comamount;
    ArrayList<DrinksMachine>Machines;

    public CanBuyer(int com,ArrayList<DrinksMachine>Macs)
    {
        commision=com;
        Machines=Macs;
    }

    public CanAndCash buyCoke(int money){
        int i=0;
        DrinksMachine currentmachine ;
        DrinksMachine cheapmachine =Machines.get(i);
        i++;
        while(i<Machines.size()){
            currentmachine =Machines.get(i);
            if(!currentmachine.cokesEmpty()){
                if(currentmachine.price>cheapmachine.price){
                    cheapmachine=currentmachine;
                }else{                   
                }
                i++;
            }else{
                i++;
            }          
        }
        cheapmachine.insert(money);
        Can myCan=cheapmachine.pressCoke();
        comamount=comamount+commision;
        int change=cheapmachine.pressChange()-comamount;
        CanAndCash a=new CanAndCash(myCan,change);
        return a;
    }

    public CanAndCash buyFanta(int money){
        int i=0;
        DrinksMachine currentmachine ;
        DrinksMachine cheapmachine =Machines.get(i);
        i++;
        while(i<Machines.size()){
            currentmachine =Machines.get(i);
            if(!currentmachine.fantasEmpty()){
                if(currentmachine.price>cheapmachine.price){
                    cheapmachine=currentmachine;
                }else{                   
                }
                i++;
            }else{
                i++;
            }          
        }
        cheapmachine.insert(100);
        Can myCan=cheapmachine.pressFanta();
        comamount=comamount+commision;
        int change=cheapmachine.pressChange()-comamount;
        CanAndCash a=new CanAndCash(myCan,change);
        return a;
    }
}
