public class GreaterStr implements checker<String>
{
    int length;
    public GreaterStr(int lth){

        length=lth;
    }

    public boolean checks(String str){
       boolean mag=str.length()<length;
        return mag;
    }
}
