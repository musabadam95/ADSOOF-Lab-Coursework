public class WordStoreImpv1 implements WordStore {
    protected String[]words;
    protected int count;
    public WordStoreImpv1
    (int n){       
        words=new String[n];
        count=0;
    }

    public void add(String word){
        //Check if array has reached its limit  
        if(count==words.length){
            //expanding
            expand();
        }
        //words[count]=word;
        count++;
    }

    public void expand(){
        String[]extendedWords=new String[words.length+5];
        for(int i=0;i<words.length;i++){
            extendedWords[i]=words[i];
        }
        words=extendedWords;
    }

    public int count(String word){
        int repeats=0;
        for(int i =0;i<words.length;i++){
            if(word.equals(words[i])){
                repeats++;
            }
        }
        return repeats;
    }

    public void remove(String word){
        int i=0;
        boolean stringExist=false;
        while(i<words.length){
            if(word.equals(words[i])){
                stringExist=true;
                break;
            }
            i++;
        }   

        if(stringExist==true){
            String[]newWords=new String[words.length-1];
            for(i=0;i<words.length;i++){
                if(i==newWords.length){                
                break;
                }
                if(word.equals(words[i])&&stringExist==true){
                    stringExist=false;
                }else{
                    newWords[i]=words[i];
                }
            }
            words=newWords;
        }
    }
}
