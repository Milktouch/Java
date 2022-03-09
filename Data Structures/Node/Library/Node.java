/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
package Node;

public class Node<T> {
    private T Info;
    private Node<T> Next;
    private Node<T> Previous;
    public Node (T info){
        this.Info=info;
        this.Next=null;
        this.Previous=null;
    }
    public Node (T info,Node<T> next){
        this.Info=info;
        this.Next=next;
        this.Previous=null;
        next.SetPrevious(this);
    }
    public Node (Node<T> Previous,T info){
        this.Info=info;
        this.Next=null;
        this.Previous=Previous;
        Previous.SetNext(this);
    }
    public Node (){
        this.Info=null;
        this.Next=null;
        this.Previous=null;
    }
    public T GetInfo(){
        return this.Info;
    }
    public void SetInfo(T info){
        this.Info = info;
    }
    public Node GetNext(){
        return this.Next;
    }
    public void SetNext(Node<T> next){
        this.Next = next;
    }
    public Node GetPrevious(){
        return this.Previous;
    }
    public void SetPrevious(Node<T> Previous){
        this.Previous = Previous;
    }
    public void Remove(){
        this.GetNext().SetPrevious(this.Previous);
        this.GetPrevious().SetNext(this.Next);
        
        
    }
}
