package unit5.unit5_1;

class Node {
    Object obj;
    Node next;

    Node(Object objNew) {
        obj = objNew;
        next = null;
    }
}

public class MyLinkedList {

    private Node firstNode;
    private int size;

    public MyLinkedList() {
        firstNode = null;
        size = 0;
    }

    /**
     * Добавляет элемент в конец
     * @param obj - значение добавления
     */
    public void add(Object obj) {
        Node node2 = new Node(obj);
        Node now = firstNode;

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
    public void add(int index, Object obj) {

        Node node2 = new Node(obj);

        if (index < 0 || index > size) throw new IndexOutOfBoundsException("Недопустимый индекс");

        if (index == 0) {
            node2.next = firstNode;
            firstNode = node2;
        }
        else {
            Node newNode = firstNode;
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
    public Object remove(int index) {

        Object remNode;

        if (index < 0 || index >= size) throw new IndexOutOfBoundsException("Недопустимый индекс");

        if (index == 0) {
            remNode = firstNode.obj;
            firstNode = firstNode.next;
        }
        else {
            Node now = firstNode;
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
    public Object get(int index) {
        Node now = firstNode;
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

        Node now = firstNode;

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
