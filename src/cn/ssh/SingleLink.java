package cn.ssh;


import java.util.LinkedHashSet;
import java.util.LinkedList;

public class SingleLink<T> {

    private LinkedList<T> first;
    public SingleLink(){

    }
    public boolean isEmpty(){
        return first ==null;
    }
    public void insertFirst(T data) {
        LinkedHashSet<T> newlink = new LinkedHashSet<T>(data);
        Link<T> newLink = new Link<T>(data);
        newlink.next=first;
        first=newlink;
    }
}
