package DH2;

import java.util.*;

public class ListSortable<E> {
    private List<E> list = new ArrayList<>();

    public void add(E e) {
        list.add(e);
    }

    public void sort(Comparator<E> comparator) {
        list.sort(comparator);
    }

    public void print() {
        for (E e : list) {
            System.out.println(e);
        }
    }
}
