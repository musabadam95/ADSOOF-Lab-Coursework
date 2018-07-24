import java.util.*;
import java.io.*;
public class ex9
{
    public static void main(String[]args){
        ArrayList<ArrayList<String>> alpha=check("Twinkle.txt");

        System.out.println(alpha);
    }

    public static ArrayList<ArrayList<String>> check(String fName){
        try{
            ArrayList<ArrayList<String>> alpha = new ArrayList<ArrayList<String>>();
            BufferedReader a = new BufferedReader(new FileReader(fName));
            String line ="";
            int i=0;
            ArrayList<String>bravo;
            while((line = a.readLine())!=null){
                String[] lines=line.split(" ");
                bravo=new ArrayList<String>();
                for(int p=0;p<lines.length;p++){
                    bravo.add(lines[p]);
                }

                alpha.add(bravo);
                i++;
            }
            return alpha;
        }

        catch(IOException e){
            System.out.println("IO error");
            return null;
        }
    }

}

