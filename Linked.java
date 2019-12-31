package com.sachin.java.datastructure;
//liked list creation 
//adding the element
// get the middle element ....
//retrieve the element from the given position 
// delete element from the given position
// join two linked list 
// display the linked list...
class Node
{
	int data;
	Node next;
	
	public Node(int data)
	{
		this.data=data;
	}
	public String toString()
	{
		return " "+data;
	}
}
class LinkedList
{
	public Node head=null;
	Node tail=null;
	int size=0;
	
	// add the element....
	public void add(int data)
	{
		Node node = new Node(data);	
		System.out.print(node);
		size++;
		if(head==null)
		{
			head=node;
			tail=node;
			tail.next=null;
		}
		tail.next=node;
		tail=node;
	}
	// get the element at the specific position...
	
	public int get(int pos)
	{
		if(pos==0)
		{
			return head.data;
		}
		Node temp=head;
		
		int i=1;
		while(i<pos)
		{
			temp=temp.next;
			i++;
		}
		return temp.data;
	}
	// get the middle element
	
	public int getMid()
	{
		int mid= size()/2;
		Node temp = head;
		int i=1;
		while(i<=mid)
		{
			temp=temp.next;
			i++;
		}
		return temp.data;
	}
	
	
	
	public void reverse(Node current) {  
        //Checks if list is empty  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        else {  
            //Checks if the next node is null, if yes then prints it.  
            if(current.next == null) {  
                System.out.print(current.data + " ");  
                return;  
            }  
            //Recursively calls the reverse function  
            reverse(current.next);  
            System.out.print(current.data + " ");  
        }  
    }  
	
	
	// delete element at the specific position....
	
	public void delete(int pos)
	{
		if(size!=0)
		{
			Node temp1=head;
			Node temp2 = head.next;
			int i=0;
			while(i<pos-1)
			{
				temp1=temp1.next;
				temp2 = temp2.next;
				i=i+1;
			}
			temp1.next=temp2.next;
			temp2.next=null;
			temp2=null;
			size--;
			
		}
		
	}
	
	// joining the two linked list....
	
	public void merge(LinkedList l1, LinkedList l2)
	{
		Node temp1=l1.head;
		Node temp2 = l2.head;
		while(temp1.next!=null)
		{
			temp1=temp1.next;
		}
		temp1.next=temp2;
	}

	
	// delete starting Node.....
	
	public void startDelete()
	{
		
		Node first =head;
		Node second=first.next;
		if( first!=null)
		{
			first.next=second.next;;
			first.next=null;
			first=null;
		}
		size--;
		
	}
	
	// deleting the last node....
	
	public int midelement()
	{
		Node p1 =head;
		Node p2 =p1;
		if (p2 !=null && p2.next!=null)
		{
			p2 =p2.next.next;
			p1 = p1.next;	
		}
		return p1.data;
	}
	
	// displaying the element present in the list....
	public String printT(LinkedList l1) 
	{
		String elem="";
		Node temp=head;
		while(temp!=null)
		{
			elem=elem+" "+temp.data;
			temp=temp.next;
		}
		return elem;
	}
	// size of the linked list.....
	
	public int size()
	{
		return size;
	}
}

public class SingleLinkedList {

	public static void main(String[] args) 
	{
		//Linked list 1
		LinkedList l1 = new LinkedList();
		System.out.println("size : "+l1.size());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println();
		System.out.println("size : "+l1.size());
		
		//Linked list 2
		LinkedList l2 = new LinkedList();
		l2.add(90);
		l2.add(80);
		l2.add(70);
		
		System.out.println();
		//joining
		
		l1.merge(l1, l2);
		System.out.println("joined two lists....");
		String x = l1.printT(l1);
		System.out.println(x);
		int mid = l1.getMid();
		System.out.println("middle element is : "+mid);
	
		int post=l1.get(0);
		
		System.out.println("element at post : "+post);
		System.out.println(l1.size());
		//l1.startDelete();
		System.out.println(l1.size());
		
		int p = l1.midelement();
		System.out.println("middle one is : "+p);
		
		l1.reverse(l1.head);	
	}

}
