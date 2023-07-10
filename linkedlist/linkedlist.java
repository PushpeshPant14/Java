public class linkedlist {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //add in first
    public void addfirst(int data){
        //setp 1 create a node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
        }
        // newnode == head
        newNode.next = head;
        //step 3- head = newnode
        head = newNode;
    }

    //add in last
    public void addlast(int data){
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
        }
        //step 2 
        tail.next =newNode;
        //step 3
        tail= newNode;
    }

    //print
    void print(){
        if(head==null){
            System.out.println("empty linkedlist");
        }
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println("null");
    }

    //add in middle
    void addmiddle(int idx,int data){
        if(idx==0){
            addfirst(data);
            return;
        }
        Node newnoNode = new Node(data);
        size++;
        Node temp= head;
        int i=0; //iterator for moving and counting location
        while(i<idx-1){
            temp=  temp.next;
            i++;
        }
        newnoNode.next = temp.next;
        temp.next = newnoNode;
    }

    //remove from first(head)
    public int removefirst(){
        if(size==0){
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int value = head.data;
            head=tail=null;
            size=0;
            return value;
        }
        int value = head.data;
        head=head.next;
        size--;
        return value;
    }

    //remove from last(tail)
    int removelast(){
        //base case
        if(size==0){
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val = tail.data;
            head=tail=null;
            return val;
        }
        
        Node prev= head;
        for(int i=0;i<size-2;i++){
            prev=prev.next;
        }
        int val= tail.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    //iterative search on linkedlist to find a element in it ...
    //if element is present return its idx else return -1
    int itrsearch(int key){
        Node temp = head;
        int i=0;  //indx of key
        while(temp!=null){
            if(temp.data==key){
                return i;
            }
            temp=temp.next;
            i++;
        }
        return -1;
    }

    //recursive search
    int recursivesearch(Node head,int key,int i){
        if(head == null){
            return -1;
        }
        if(head.data==key){
            return i;
        }
        return recursivesearch(head.next, key, i+1);
    }

    //reverse linkedlist
    void reverse(){
        Node prev=null;
        Node curr = tail= head;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next= prev;   //previous next
            prev = curr;
            curr = next;
        } 
        head = prev;
    }

    //delete nth element from last
    void deletenthfromlast(int n){
        //cal size 
        int sze=0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            sze++;
        }
        //base csae
        if(n==sze){
            head=head.next;
        }
        //delete node
        //go to prev of nth node
        int i=1;
        Node prev = head;
        int idxtore = sze-n;
        while(i<idxtore){
            prev = prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return;
    }

    //find mid -- slow fast pointer approach
    Node findmid(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){       // fast!=null is for even LL and fast.next!=null is for odd LL
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;    ///slow is mid
    }

    public boolean checkpalindrom(Node head){
        //BASE CASE
        if(head==null||head.next==null){
            return true;
        }
        //step-1 -> find mid;
        Node mid = findmid(head);

        //step-2 -> reverse half LL;
        Node prev = null;
        Node curr = mid;
        Node next;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        
        //step-3 -> compare LL;
        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data!=right.data){
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    //detect cycle
    boolean iscycle(){
        Node slow = head;
        Node fast = head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
            if(fast==slow){
                return false;
            }
        }
        return true;
    }

    //mergesort
    public Node mergesort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node mid = findmid(head);
        Node righthead = mid.next;
        mid.next=null;
        Node newleft=mergesort(head);
        Node newright=mergesort(righthead);
        return merge(newleft,newright);
    }

    Node merge(Node head1,Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergeLL.next;
    }


    public static void main(String[] args) {
        linkedlist LL = new linkedlist();
        LL.addfirst(1);
        LL.addfirst(2);
        LL.addlast(3);
        LL.addmiddle(2, 2);
        LL.addlast(2);
        LL.addlast(1);
        LL.addlast(6);
        LL.print();
        System.out.println("size is of linkedlist is "+LL.size);
        LL.removefirst();
        LL.removelast();
        LL.print();
        System.out.println("size is of linkedlist is "+LL.size);
        if(LL.recursivesearch(head, 4, 0)==-1){
            System.out.println("Element is not present in Linkedlist");
        }
        else{
            System.out.println("found at index "+LL.itrsearch(4));
        }
        LL.print();
        // LL.reverse();
        LL.print();
        LL.deletenthfromlast(3);
        LL.deletenthfromlast(2);
        LL.print();
        System.out.println(LL.checkpalindrom(head));
        System.out.println(LL.iscycle());
        LL.head=LL.mergesort(LL.head);
        LL.print();
    }
}
