package selenium_java_interview_questions.linkedList;

import java.util.List;

public class LinkedList {
    ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    public  void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    int count = 0;
    public void length(){
        ListNode current = head;
        while(current!=null){
            count++;
            current = current.next;
        }
        System.out.println("length of linked list is "+count);
    }
    public void sort(){
        ListNode current = head;
        while(current!=null){
            ListNode index = current.next;
            ListNode min = current;
            while(index!=null){
                if(index.data<min.data){
                    min = index;
                }
                index = index.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data = temp;
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.print("null");
    }
    public void largest(){
        ListNode current = head;
        ListNode large = current;

        while(current!=null){
            if(large.data<current.data){
                large = current;
            }
            current = current.next;
        }
        System.out.println(large.data);
    }
public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);

        //forming the chain
       ll.head.next = second;
       second.next = third;
       third.next = fourth;
       fourth.next = fifth;
       fifth.next = null;
       ll.display();
       ll.length();
       ll.sort();
    System.out.println();
       ll.largest();
}
}
