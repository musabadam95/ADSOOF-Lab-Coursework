import java.util.*;
public class Ex6
{
    public static void main(String[]args){
        DrinksMachine machine=new DrinksMachine(30,10,10);
        DrinksMachine machine2=new DrinksMachine(5,0,10);
        DrinksMachine machine3=new DrinksMachine(10,10,10);
        ArrayList<DrinksMachine>alpha=new ArrayList<DrinksMachine>();
        alpha.add(machine);
        alpha.add(machine3);
        alpha.add(machine2);
        Can a;
        a=check(alpha);
        System.out.println(a);
    }

    public static Can check(ArrayList<DrinksMachine>alpha){
        Can b;
        int m=0;
        for(int i =1;i<alpha.size();i++){
            if(alpha.get(m).getPrice()>alpha.get(i).getPrice()){
                m=i;  
            }
        }  
        try{
            alpha.get(m).insert(50);
            if(alpha.get(m).cokesEmpty()){
                throw new EmptyMachineException();
            }else{
                b=alpha.get(m).pressCoke();
                System.out.println(alpha.get(m).getPrice());              
                return b;
            }
        }
        catch(EmptyMachineException e){
            System.out.println("Removing");
            alpha.remove(m);
            return check(alpha);
        }
    }
}
