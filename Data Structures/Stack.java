package DataStructures;

public class Stack<T> {
    private Node<T> First;
    public Stack(){
        this.First=null;
    }
    public boolean IsEmpty(){
        return (this.First==null);
    }
    public void Push(T x){
        this.First = new Node<T>(x,this.First);
    }
    public T Pop(){
        T x = this.First.GetInfo();
        this.First = this.First.GetNext();
        return x;
    }
    public T Top(){
       return this.First.GetInfo();
    }
    public String ToString(){
        String str="[";
        Node<T> temp = this.First;
        while(temp!=null){
            str+=" "+temp.GetInfo().toString()+" ,";
            temp=temp.GetNext();
        }
        str+="#";
        str=str.replace(",#","]");
        return str;
        
    }
    public int Length(){
        Node<T> temp = this.First;
        int counter=0;
        while(temp!=null){
            counter++;
            temp =temp.GetNext();
        }
        return counter;
    }
   
    
}
