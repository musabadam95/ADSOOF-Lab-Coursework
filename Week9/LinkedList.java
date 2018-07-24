public class LinkedList
{
    Cell <Integer>number;

    public LinkedList(int[]list)
    {      
        //constructively adds the numbers into linkedlist form     
        number=new Cell<Integer>(list[0],null);
        for(int i=1;i<list.length;i++){
            add(list[i]);       
        }
    }

    public boolean checkExist(int target){
        Cell ptr=null;
        for(ptr=number;ptr.next!=null;ptr=ptr.next){
            if(ptr.first.equals(target)){
                return true;
            }

        } 
        return false;
    }

    public void delFirstOc(int target){
        if(number.first.equals(target)){
            number=number.next;
        }else{
            Cell ptr= number;
            for(;ptr.next!=null;ptr=ptr.next){
                if(ptr.next.first.equals(target)){
                    ptr.next=ptr.next.next;
                    break;
                }
            }
        }
    }

    public void delLastOc(int target){
        Cell<Integer> ptr= null;
        int pos=0;
        int count=0;
        //find position
        for(ptr=number;ptr!=null;ptr=ptr.next){
            if(ptr.first.equals(target)){
                pos=count;
            }
            count++;
        }
        count=0;
        //delete at position
        ptr=number;
        while(count<pos) {
            if(count==pos){
                ptr=ptr.next;
                Cell newNum=new Cell(ptr.next.first,ptr.next.next);
                ptr=newNum;
                number=newNum;
            }
            else if(count+1==pos){
                if(ptr.next.next==null){
                    ptr.next=null;
                    break;
                }else{
                    ptr.next=ptr.next.next;
                    break;
                }
            }
            count++;
            ptr=ptr.next;
        }
    }

    public void delAllOc(int target){
        Cell<Integer> ptr= null;
        for(ptr=number;ptr.next!=null;ptr=ptr.next){
            if(ptr.next.first.equals(target)){
                if(ptr.next.next==null){
                    ptr.next=null;
                    break;
                }else{
                    ptr.next=ptr.next.next;
                }
            }

        }
        //if last cell has target then run loop again to remove
        if(ptr.first.equals(target)){
            for(ptr=number;ptr.next!=null;ptr=ptr.next){
                if(ptr.next.first.equals(target)){
                    if(ptr.next.next==null){
                        ptr.next=null;
                        break;
                    }else{
                        ptr.next=ptr.next.next;
                    }
                }            
            }

        }
    }

    public int count(int target){
        int count=0;
        Cell ptr=null;
        for(ptr=number;ptr.next!=null;ptr=ptr.next){
            if(ptr.first.equals(target)){
                count++;
            }

        } 
        return count;
    }

    public int firstCount(int target){

        int count=0;
        Cell ptr=null;
        boolean flag=false;
        for(ptr=number;ptr.next!=null;ptr=ptr.next){
            if(ptr.first.equals(target)){
                flag=true;
                break;
            }
            count++;
        } 
        if(flag==true){
            return count;
        }else{

            return -1;
        }

    }

    public void storeCount(int target){
        Cell newList=null;
        Cell newListPtr=newList;
        int count=0;
        Cell ptr=null;
        boolean flag=false;
        for(ptr=number;ptr!=null;ptr=ptr.next){
            if(ptr.first.equals(target)){
                if(flag==true){
                    for( newListPtr=newList; newListPtr.next!=null;newListPtr=newListPtr.next) {}
                    newListPtr.next=new Cell(count,null);
                }else{
                    newList=new Cell(count,null);
                    flag=true;
                }
            }
            count++;
        } 

        for( ptr=newList; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }

    }

    public void merger(int[]newnum){
        Cell ptr=null;
        int i=0;
        Cell newNumber=new Cell(newnum[i],null);
        i++;
        while(i<newnum.length){
            for( ptr=newNumber; ptr.next!=null; ptr=ptr.next) {}
            ptr.next=new Cell(newnum[i],null);
            i++;
        }
        for( ptr=number; ptr.next!=null; ptr=ptr.next) {}
        ptr.next=newNumber;
        for( ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        } 

    }

    public void addToMain(){
        number=addTo(number);
        for(Cell ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }

    }

    public Cell<Integer> addTo(Cell <Integer>c){
        if(c.next==null){
            c.first=c.first+10;

        }else{
            c.first=c.first+10;
            return c=addTo(c.next);
        }
        return number;	
    }

    public void addAfterMain(){
        number=addAfter(number,1,2);
        for(Cell ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }

    }

    public Cell <Integer>addAfter(Cell <Integer>c,int find,int addN){
        if(c.next==null){
            if(c.first.equals(find)){
                c.next=new Cell<Integer> (addN,null);
            }

        }else{
            if(c.first.equals(find)){
                c.next=new Cell<Integer>(addN,c.next);

            }else{
            }            
            return c=addAfter(c.next,find,addN);
        }
        return number;
    }

    public  void ascCheck(){
        Cell <Integer>ptr=null;
        int current=0;
        int prev=0;
        boolean flag=true;
        prev=number.first;
        for( ptr=number.next; ptr!=null; ptr=ptr.next){

            if(ptr.first>=prev){
                prev=ptr.first;
            }else{
                flag=false;
                break;
            }
        }
        System.out.println(flag);
    }

    public void ascMerge(int[]newnum){
        Cell<Integer> ptr=null;
        Cell<Integer>ptrOppo=null;
        Cell<Integer> newNumber=new Cell<Integer>(newnum[0],null);
        int i=0;
        i++;
        while(i<newnum.length){
            for( ptr=newNumber; ptr.next!=null; ptr=ptr.next) {}
            ptr.next=new Cell(newnum[i],null);
            i++;
        }
        int oppoNumber=0;
        boolean flag=false;
        if(newNumber.first<number.first){
            oppoNumber=number.first;
            ptr=newNumber;
            ptrOppo=number;
            flag=true;
        }else{
            oppoNumber=newNumber.first;
            ptr=number;
            ptrOppo=newNumber;
        }
        while(ptr.next!=null){
            // for(; ptr!=null; ptr=ptr.next){
            for(; ptrOppo!=null; ptrOppo=ptrOppo.next){
                oppoNumber=ptrOppo.first;
                int next=(Integer)ptr.next.first;
                if(ptr.first<oppoNumber&&next>oppoNumber){
                    ptr.next=new Cell(ptrOppo.first,ptr.next);
                }
            }           
            if (flag==false){
                ptrOppo=newNumber;
            }else{
                ptrOppo=number;
            }
            ptr=ptr.next;
        }
        //adds final number
        if(ptr.first<oppoNumber){
            ptr.next=new Cell(oppoNumber,null);

        }
        //test
        for( ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }
    }

    public void ascMergeNoDupes(int[]newnum){
        Cell<Integer> ptr=null;
        Cell<Integer>ptrOppo=null;
        Cell<Integer> newNumber=new Cell<Integer>(newnum[0],null);
        int i=0;
        i++;
        while(i<newnum.length){
            for( ptr=newNumber; ptr.next!=null; ptr=ptr.next) {}
            ptr.next=new Cell(newnum[i],null);
            i++;
        }
        int oppoNumber=0;
        boolean flag=false;
        if(newNumber.first<number.first){
            oppoNumber=number.first;
            ptr=newNumber;
            ptrOppo=number;
            flag=true;
        }else{
            oppoNumber=newNumber.first;
            ptr=number;
            ptrOppo=newNumber;
        }
        while(ptr.next!=null){
            // for(; ptr!=null; ptr=ptr.next){
            for(; ptrOppo!=null; ptrOppo=ptrOppo.next){
                oppoNumber=ptrOppo.first;
                int next=(Integer)ptr.next.first;
                if(ptr.first==oppoNumber){

                }
                else if(ptr.first<oppoNumber&&next>oppoNumber){
                    ptr.next=new Cell(ptrOppo.first,ptr.next);
                }
            }           
            if (flag==false){
                ptrOppo=newNumber;
            }else{
                ptrOppo=number;
            }
            ptr=ptr.next;
        }
        //adds final number
        if(ptr.first<oppoNumber){
            ptr.next=new Cell(oppoNumber,null);

        }
        //test
        for( ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }
    }

    public void mergeDupsOnly(int[]newnum){
        Cell<Integer> ptr=null;
        Cell<Integer>ptrOppo=null;
        Cell<Integer> newNumber=new Cell<Integer>(newnum[0],null);
        int i=0;
        i++;
        boolean flag=false;
        while(i<newnum.length){
            for( ptr=newNumber; ptr.next!=null; ptr=ptr.next) {}
            ptr.next=new Cell(newnum[i],null);
            i++;
        }
        int oppoNumber=0;
        boolean fla=false;
        if(newNumber.first<number.first){
            oppoNumber=number.first;
            ptr=newNumber;
            ptrOppo=number;
            flag=true;
        }else{
            oppoNumber=newNumber.first;
            ptr=number;
            ptrOppo=newNumber;
        }
        Cell<Integer> returningNumber=null;
        while(ptr.next!=null){
            // for(; ptr!=null; ptr=ptr.next){
            for(; ptrOppo!=null; ptrOppo=ptrOppo.next){
                oppoNumber=ptrOppo.first;
                if(fla==true){
                    if(ptr.first==oppoNumber){
                        for( Cell point=returningNumber; point.next!=null; point=point.next) {}
                        returningNumber.next=new Cell(oppoNumber,null);
                    }
                }
                else{
                    if(ptr.first==oppoNumber){
                        returningNumber=new Cell(ptrOppo.first,null);
                        fla=true;

                    }
                    else{                   
                    }
                }
            }           
            if (flag==false){
                ptrOppo=newNumber;
            }else{
                ptrOppo=number;
            }
            ptr=ptr.next;
        }
        //adds final number
        if(ptr.first==oppoNumber){
            Cell point=returningNumber;
            for( ; point.next!=null; point=point.next) {}
            point.next=new Cell(oppoNumber,null);
        }
        //test
        for( Cell points=returningNumber; points!=null; points=points.next){
            System.out.println(points.first);
        }
    }

    public void test(){
        for(Cell ptr=number; ptr!=null; ptr=ptr.next){
            System.out.println(ptr.first);
        }

    }

    public void add(int num){
        Cell ptr=null;
        for( ptr=number; ptr.next!=null; ptr=ptr.next) {}
        ptr.next=new Cell(num,null);
    }
    private class Cell <T>
    {
        T first;
        Cell next;//holds the next linkedlist or if there isnt another linkedlist then it holds null which means the end of the linkedlist

        Cell(T f)
        {
            first=f;
            next=null;
        }

        Cell(T f,Cell n)
        {
            first=f;
            next=n;
        }
    }

}