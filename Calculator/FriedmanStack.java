import java.util.ArrayList;

public class FriedmanStack <T>
{
    private ArrayList<T> data;
    
 
    public FriedmanStack()
    {
        data = new ArrayList<>();
    }
 
    public T peek()
    {
        if (data.size()==0)
            return null;
        return data.get(data.size()-1);
    }
 
    public boolean empty()
    {
        return (data.size()==0);
    }
 
    public T pop()
    {
        if (data.size()==0)
            return null;
        return data.remove(data.size()-1);
    }
 
    public void push(T item)
    {
        data.add(item);
    }
 
    public int search(T item)
    {
        for(int i = data.size()-1; i>=0; i--)
        {
            if (data.get(i) == item)
            {
                return data.size()-i;
            }
        }
        return -1;
    }
    
    public String toString()
    {
        String out = "";
        
        for(int i = data.size()-1; i>=0; i--)
        {
            out += data.get(i) + "\n";
        }
        
        return out;
    }
}


