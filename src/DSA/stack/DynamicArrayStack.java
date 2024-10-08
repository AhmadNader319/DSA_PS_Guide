package DSA.stack;

import java.io.Serializable;
import java.util.ArrayList;

public class DynamicArrayStack<T>{

    private final ArrayList<T> arrayList;
    public DynamicArrayStack(){
        arrayList = new ArrayList<>();
    }
    public void push(T element){
        arrayList.add(element);
    }
    public T pop(){
        if(arrayList.isEmpty()) return null;
        return arrayList.remove(arrayList.size()-1);
    }
    public T peek(){
        if(arrayList.isEmpty()) return null;
        return arrayList.get(arrayList.size()-1);
    }
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }
    public int size(){
        return arrayList.size();
    }
}
