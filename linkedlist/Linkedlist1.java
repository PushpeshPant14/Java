import java.rmi.server.RemoteServer;

import org.w3c.dom.Node;

public class Linkedlist1 {
    //this is only for practice
    //crreate a single node
    class Node {
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = next;
        }
    }
    //head ,tail & size;
    public static Node head;
    public static Node tail;
    public static int size;

    //add functions -- 1. addfirst 2.add last 3.addmiddle
    void addfirst(int data){
        Node newnode = new Node(data);
        size++;
        if(head==null){
            head=tail=newnode;
        }
        newnode.next=head;
        head = newnode;
    }

    void addlast(int data){
        Node newnode = new Node(data);
        size++;
        //base case
        if(head==null){
            head=tail=newnode;
        }
        tail.next=newnode;
        tail= newnode;
    }

    void addmiddle(int data,int idx){
        //base csae
        if(idx==0){
            addfirst(data);
            return;
        }
        Node temp= head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        Node newnode = new Node(data);
        size++;
        newnode.next=temp.next;
        temp.next = newnode;
    }
    //print function'
    void print(){
        if(head==null){
            System.out.println("empty");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    //remove or delete functions -- 1.removefirst 2.removelast 3.removenthformend
    int removefirst(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val = head.data;
            head=tail=null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    int removelast(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev =prev.next;
        }
        int val=tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    int removenthfromend(int n){
        //size;
        int sz=0;
        Node temp=head;
        while(temp!=null){
            temp=temp.next;
            sz++;
        }
        //base case
        if(sz==n){
            int val=head.data;
            head=head.next;  //ll.removefirst();
            return val;
        }
        int i=0;
        Node prev = head;
        while(i<sz-n-1){
            prev = prev.next;
            i++;
        }
        int val=prev.next.data;
        prev.next=prev.next.next;
        return val;
    }

    //search's -- 1.iterative search   2. recursice search

    int itrsearch(int key){
        if(head==null){
            return -1;
        }
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            temp=temp.next;
            idx++;
        }
        return -1;
    }

    int recursivesearch(Node head,int key,int i){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return i;
        }
        return recursivesearch(head.next, key, i+1);
    }

    //reverse a linkedlist
    void reverse(){
        Node prev = null;
        Node curr = tail=head;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    //find mid of linkedlist -- using slow and fast pointer approach
    Node findmid(){
        Node slow =head;
        Node fast =head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    //check palindrome
    boolean checkpalindrom(){
        if(size==0||size==1){
            return true;
        }
        Node mid= findmid();
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }

        Node left=head;
        Node right= prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            left=left.next;
            right=right.next;
        }
        return true;
    }

    public static boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    //main fn
    public static void main(String[] args) {
        Linkedlist1 ll = new Linkedlist1();
        ll.addfirst(1);
        ll.addlast(1);
        ll.addmiddle(2, 1);
        ll.removenthfromend(2);
        ll.print();
        ll.reverse();
        ll.print();
        System.out.println(ll.findmid().data);
        System.out.println(ll.checkpalindrom());;

    }
}
