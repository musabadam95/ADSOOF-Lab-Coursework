public class WordStoreImp implements WordStore {
    //creates an aray of type Cell which will hold the linkedlists
    Cell[]map;
    public WordStoreImp(int n){      
        //initialise the array and store ONE linkedlist in each array cell
        //linkedlist.first stores the string word
        //linkedlist.next stores the next linkedlist object as type Cell
        map=new Cell[n];

    }

    public void add(String word){
        //generate a Hash Index by passing the String word into the method IndexGen()
        int index=IndexGen(word);
        //Retirieve the Linkedlist from the array cell specified by the index 
       // Cell list=map[index];
       Cell list=map[1];
        //if the linkedlist.first inside the specified array has nothing(null) then add the String word into that linkedlist
        if (list==null){
            list=new Cell(word);
        }else{
            //else add the new linkedlist to the front of the linkedlist chain
            list=new Cell(word,list);      
        }
        //apply the newly constructed linkedlist back into the specified array Ce
        
        
        
        //check if Cell object being modiefied is pointing to the same object in the array
        System.out.println(list==map[index]);
       map[1]=list;    
    }

    public void test(){
        Cell list;
        int i =0;
        while(i<map.length){
            list=map[i];
            for(Cell ptr=list; ptr!=null; ptr=ptr.next){
                System.out.println(ptr.first);
            }
            i++;
        }
        //  System.out.println(collisions);
    }

    public int count(String word){
        int count=0;           
        Cell list=map[IndexGen(word)];
        for(; list!=null; list=list.next){
            if(word.equals(list.first)){
                count++;
            }
        }    
        return count;
    }

    public void remove(String word){       
        //Cell list=map[IndexGen(word)];
        Cell list=map[1];
        if(null==list){
        }else{
            Cell temp=null;
            temp=list;
            if(list.first.equals(word)){
                list=list.next;
            }else{
                for(;list.next!=null; list=list.next){     
                    if(list.next.first.equals(word)){
                        list.next=list.next.next;
                        break;
                    }
                }
            }
            //map[IndexGen(word)]=list;
            map[1]=list;
        }
    }

    public int IndexGen(String word){
        //creates a hash based on the number of vowels in the String word
        int count=0;
        char letter;
        for (int i=0;i<word.length();i++){
            count=count+(int)word.charAt(i);
        }
        count=count%map.length;
        return count;
    }

    private class Cell 
    {
        String first;
        Cell next;//holds the next linkedlist or if there isnt another linkedlist then it holds null which means the end of the linkedlist

        Cell(String f)
        {
            first=f;
            next=null;
        }

        Cell(String f,Cell n)
        {
            first=f;
            next=n;
        }
    }
}