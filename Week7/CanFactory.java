import java.util.*;
import java.math.*;
public class CanFactory
{
    private double proportion;
    protected boolean switchs;
    public CanFactory(double prop)
    {
        proportion=prop;
        switchs=false;
    }

    public void switcher(){
        switchs=!switchs;
    } 

    public Can makeCan(String cont){
        PromotionCan pCan;
        Can can;
        if(switchs==true){
            double random=0;
            random= Math.random() /proportion;

            if(random>1){
                pCan=new PromotionCan(cont,"you won");
            }else{
            pCan=new PromotionCan(cont);
            }
            return pCan;
        }else {
            return can=new Can(cont);
        }
    }
}
