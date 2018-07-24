
class UseDrinksMachines1
{
    public static void main(String[] args)
    {
        int myChange;
        int counter=0;
        DrinksMachine machine = new DrinksMachine(50,10,10);
        System.out.println("I insert 200p into the drinks machine");
        machine.insert(120);
        System.out.println("I press the button labelled \"Coke\"");
        Can myCana=new Can("Fanta");
        myCana= machine.pressCoke();
        Can myCan;
        counter++;
        while((myCan = machine.pressCoke())!=null){
            counter++;

        }
        int bal=machine.collectCash();
        System.out.println("I press the button labelled \"change\"");
        myChange = machine.pressChange();
        if(counter==1){
            System.out.println("I have "+myCana+" and "+myChange+"p");
        }else{
            System.out.println("I have "+counter+" cans and "+myChange+"p"+bal);
        }
    }
}
