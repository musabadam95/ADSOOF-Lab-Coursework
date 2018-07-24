public class q8
{

    public static void main(String[]args){
        DrinksMachine cokes=new DrinksMachine(20,10,10);
        int cans=canCheck(cokes);
        int counter=0;
        System.out.println(cans);
        while((cokes.cokesEmpty())==false){
            cokes.insert(20);
            cokes.pressCoke();
            counter++;
        }
        System.out.println(counter);
    }

    public static int canCheck(DrinksMachine cokes){

        int counter =0;
        System.out.println(cokes.cokesEmpty());
        cokes.cokesEmpty();
        while((cokes.cokesEmpty())==false){
            cokes.insert(20);
            cokes.pressCoke();
            counter++;
        }
        Can coke;
        for(int a =0;a<counter;a++){
            coke=new Can("Coke");
            cokes.loadCoke(coke);
        }
        return counter;
    }
}
