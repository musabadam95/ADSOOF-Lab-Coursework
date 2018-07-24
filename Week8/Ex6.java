public class Ex6 implements Transformer<String>
{
    String word;
    public Ex6(String m){

        word=m;
    }

    public String transform(String str)
    {
        return word +str;
    }

}
