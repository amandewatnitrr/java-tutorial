import java.util.Scanner;

/**
 * Self Implementation Of LinkedList
 */
public class LinkedList
{
    Node head;
    int size;

    static class Node
    {
        int data;
        Node next;
        Node(int d){
            data = d;
            next = null;
        }
    }

    public static LinkedList insertll(LinkedList list,int data)
    {
        Node new_node = new Node(data);
        new_node.next = null;

        if(list.head == null){
            list.head = new_node;
        }
        else{
            Node temp = list.head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new_node;
        }
        return list;
    }


    public static void printll(LinkedList list)
    {
        System.out.println();
        System.out.print("Linked List: ");
        Node temp = list.head;
        while(temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void removeele(LinkedList list, int data){

        Node temp = list.head;

        if(temp == null)
        {
            System.out.println("Linked List is empty");
            return ;
        }

        while(temp.next != null)
        {
            if(temp.next.data == data){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
    }

    public static void removeeleatindex(LinkedList list, int index){

        Node temp = list.head;

        if(temp == null)
        {
            System.out.println("Linked List is empty");
            return ;
        }

        if(index>list.size){
            System.out.println("Index out of bound.");
            return;
        }

        int i = 0;
        while(temp != null)
        {
            if(i == index-1 && temp.next != null){
                temp.next = temp.next.next;
                break;
            }
            if(i == index && temp.next == null){
                temp = null;
                break;
            }
            temp = temp.next;
            i++;
        }
    }

}

/*
 * LinkedList is a linear data structure where the elements are not stored in contiguous locations and ...
 * every element is a separate object with a data part and address part.
 *
 * LinkedList is a dynamic data structure which can grow and shrink according to the needs of the program.
 *
 * LinkedList is a linear data structure where the elements are not stored in contiguous locations and ...
 * every element is a separate object with a data part and address part.
 *
 * LinkedList is a dynamic data structure which can grow and shrink according to the needs of the program.
 *
 * LinkedListName.add(int index, E element)
 * Inserts the given element at specified position in the list.
 *
 * LinkedListName.equals(Object o)
 * Compares the specified object with this list for equality.
 *
 * LinkedListName.isEmpty()
 * Returns true if this list contains no elements.
 *
 * LinkedListName.toArray();
 * Returns an array containing all the elements in this list in proper sequence (from first to last element).
 *
 * LinkedListName.clear();
 * Removes all the elements from this list (optional operation).
 *
 * LinkedListName.get(int index);
 * Returns the element at the specified position in this list.
 *
 * LinkedListName.sort(Comparator<? super E> c);
 * Sorts this list according to the order induced by the specified Comparator.
 *
 *
 * */

/*

public static void main(String[] args){

    Scanner sc = new Scanner(System.in);

    LinkedList arr = new LinkedList();

    System.out.print("Enter the number of elements you want to add to the LinkedList: ");
    int n = sc.nextInt();
    arr.size=n;

    System.out.print("Enter the elements: ");
    for(int i=0;i<n;i++){
        int x = sc.nextInt();
        insertll(arr, x);
    }

    System.out.println("");

    System.out.print("Elements in the LinkedList are: ");
    printll(arr);

    System.out.println("");

    System.out.print("Enter the element value you want to delete: ");
    int x = sc.nextInt();

    removeele(arr, x);

    System.out.println("");

    System.out.print("Elements in the LinkedList are: ");
    printll(arr);

    System.out.println("");

    System.out.print("Enter the index of the element you want to delete: ");
    int index = sc.nextInt();
    removeeleatindex(arr, index);

    System.out.print("Elements in the LinkedList are: ");
    printll(arr);
}



 */
