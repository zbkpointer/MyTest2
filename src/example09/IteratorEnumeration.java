package example09;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;

public class IteratorEnumeration implements Enumeration {
    Iterator iterator;



    public IteratorEnumeration(Iterator iterator){
        this.iterator = iterator;
    }


    @Override
    public boolean hasMoreElements() {
        return this.iterator.hasNext();
    }

    @Override
    public Object nextElement() {
        return this.iterator.next();
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i <10 ; i++) {
            arrayList.add(i);
        }

        Iterator iterator = arrayList.iterator();

        IteratorEnumeration iteratorEnumeration = new IteratorEnumeration(iterator);

        while(iteratorEnumeration.hasMoreElements()){
            System.out.println(iteratorEnumeration.nextElement());
        }
    }

}
