
public class PromotionCan extends Can
{

    private String PrizeMessage;

    public PromotionCan(String cont)
    {
        super(cont);

    }

    public PromotionCan(String cont,String PMessage)
    {
        super(cont);
        PrizeMessage=PMessage;
    }

    public boolean isWinner()throws EmptyCanException{
        if(this.isFull()==false){
            if(PrizeMessage!=null){
                return true;
            }else{
                return false;
            }
        }else{
            throw new EmptyCanException();
        }
    }
}
