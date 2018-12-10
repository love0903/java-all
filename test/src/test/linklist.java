public class linklist<E> {
private class Node {
Node(E elem) {
this.elem = elem;
}
E elem;
Node next;
}
private Node first;
public void add(E elem) {
Node node = new Node(elem);
if(first == null) {
first = node;
}
else {append(node);
}
}
private void append(Node node) {
Node last = first;
while(last.next != null) {
last = last.next;
}
last.next = node;
}
public int size() {
int count = 0;
Node last = first;
while(last != null) {
last = last.next;
count++;
}
return count;
}
public E get(int index) {
checkSize(index);
return findElemOf(index);
}
private void checkSize(int index) throws IndexOutOfBoundsException {
int size = size();
if(index >= size) {
throw new IndexOutOfBoundsException(
String.format("Index: %d, Size: %d", index, size));
}
}
private E findElemOf(int index) {
int count = 0;
Node last = first;
while(count < index) {
last = last.next;
count++;
}
return last.elem;
}
}

