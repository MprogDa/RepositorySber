package unit5.unit5_2;

class Node<T> {
    T obj;
    Node<T> next;

    Node(T objNew) {
        obj = objNew;
        next = null;
    }
}

public class MyLinkedListGeneric<T> {

    private Node<T> firstNode;
    private int size;

    public MyLinkedListGeneric() {
        firstNode = null;
        size = 0;
    }

    /**
     * Добавляет элемент в конец
     * @param obj - значение добавления
     */
    public void add(T obj) {
        Node<T> node2 = new Node<>(obj);
        Node<T> now = firstNode;

        if (now == null) {
            firstNode = node2;
        }
        else {
            while (now.next != null) {
                now = now.next;
            }
            now.next = node2;
        }
        size++;
    }

    /**
     * Добавляет элемент по индексу
     * @param index - позиция для вставки
     * @param obj - значение для добавления
     */
    public void add(int index, T obj) {

        Node<T> node2 = new Node<>(obj);

        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Недопустимый индекс");

        if (index == 0) {
            node2.next = firstNode;
            firstNode = node2;
        }
        else {
            Node<T> newNode = firstNode;
            for (int i = 0; i < index - 1; i++) {
                newNode = newNode.next;
            }
            node2.next = newNode.next;
            newNode.next = node2;
        }
        size++;
    }

    /**
     * Удаляет элемент по индексу
     * @param index - индекс удаляемого
     */
    public T remove(int index) {

        T remNode;

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Недопустимый индекс");

        if (index == 0) {
            remNode = firstNode.obj;
            firstNode = firstNode.next;
        }
        else {
            Node<T> now = firstNode;
            for (int i = 0; i < index - 1; i++) {
                now = now.next;
            }
            remNode = now.next.obj;
            now.next = now.next.next;
        }
        size--;
        return remNode;
    }

    /**
     * Очищает список
     */
    public void clear() {
        firstNode = null;
        size = 0;
    }

    /**
     * Возвращает размер
     */
    public int size() {
        return size;
    }

    /**
     * Возвращает элемент по указанному индексу
     * @param index - позиция элемента
     */
    public T get(int index) {
        Node<T> now = firstNode;
        if (index < 0 || index >= size)  throw new IndexOutOfBoundsException("Недопустимый индекс");
        for (int i = 0; i < index; i++) now = now.next;
        return now.obj;
    }

    /**
     * Выводит содержимое списка
     */
    @Override
    public String toString() {

        String str = "[ ";

        Node<T> now = firstNode;

        while (now != null) {
            str += now.obj.toString();
            if (now.next == null) break;
            str += ", ";
            now = now.next;
        }

        str += " ]";

        return str;
    }

}
