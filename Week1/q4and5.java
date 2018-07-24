public class q4and5
{
    public static void main(String[]args){
      Can can1= new Can("Coke Cola");
        Can can2= new Can("Fanta");
         Can can3= new Can("rohim");
         drinking(can1,can2,can3);
    }
    public static void drinking(Can can1,Can can2,Can can3){
      
        try{
           can1.drink();
            System.out.println(can1+" "+can1.isFull());
            can1.drink();
        }catch(EmptyCanException e){
            System.out.println(can2+" " +can2.isFull());
            can2.drink();
        }
        try{
            System.out.println(can2 +" "+can2.isFull());
            can2.drink();
        }catch(EmptyCanException e){
            System.out.println(can3+""+can3.isFull());
            can3.drink();
        }
    }

}
