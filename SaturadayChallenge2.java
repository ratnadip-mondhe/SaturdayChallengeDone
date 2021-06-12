package DAY_05;

public class SaturadayChallenge2 {
	
		 

	    static Node head;
	 

	    static class Node {
	 

	        int data;

	        Node next;
	 

	        Node(int d)

	        {

	            data = d;

	            next = null;

	        }

	    }
	 


	    Node pairWiseSwap(Node node)

	    {
	 


	        if (node == null || node.next == null) {

	            return node;

	        }
	 

	        

	        Node prev = node;

	        Node curr = node.next;
	 

	        node = curr; 
	 

	        

	        while (true) {

	            Node next = curr.next;

	            curr.next = prev; 
	            if (next == null || next.next == null) {

	                prev.next = next;

	                break;

	            }
	 

	           

	            prev.next = next.next;
	 

	            
	            prev = next;

	            curr = prev.next;

	        }

	        return node;

	    }
	 

	    void printList(Node node)

	    {

	        while (node != null) {

	            System.out.print(node.data + " ");

	            node = node.next;

	        }

	    }
	 


	    public static void main(String[] args)

	    {
	 

	      	SaturadayChallenge2 list = new SaturadayChallenge2();

	        list.head = new Node(1);

	        list.head.next = new Node(2);

	        list.head.next.next = new Node(3);

	        list.head.next.next.next = new Node(4);
	        //

    
	        System.out.println("Linked list Original ");

	        list.printList(head);

	        Node st = list.pairWiseSwap(head);

	        System.out.println("");

	        System.out.println("Linked list after Swapping");

	        list.printList(st);

	        System.out.println("");

	    }
	}
	 


