public class q7
{

    public static void main(String[]args){
        DrinksMachine fanta=new DrinksMachine(20,10,10);
        DrinksMachine cola=new DrinksMachine(50,10,10);
        canCheck(fanta,cola,50);

    }

    public static void canCheck(DrinksMachine a,DrinksMachine b,int p){
        if(a.getPrice()<b.getPrice()){
            a.setPrice(a.getPrice()+p);
    
        }else{
            b.setPrice(p);
    
            System.out.println("Fanta Machine has "+a.getPrice()+" and Cola Machine has "+b.getPrice());
        }
        System.out.println("Fanta Machine has "+a.getPrice()+" and Cola Machine has "+b.getPrice());
            }
}
