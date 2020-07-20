// [Problem Statement] - Linked List (https://www.hackerrank.com/challenges/30-linked-list/problem)

 public static  Node insert(Node head,int data) {
        //Complete this method
        Node current = head;
        Node temp = null;
        if(current == null)
         {
            temp=new Node(data);
            current=temp;
            return temp;
        }
        
        else 
        {
            Node temp1=current;
          while(current.next!=null)
          {
              current=current.next;
          }
            current.next= new Node(data);
            current= current.next;
            current.data =data;
            
            return temp1;
 
        }   
    }

