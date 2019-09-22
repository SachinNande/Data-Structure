package collections.practice;
// liked list creation 
//adding the element
// retrieve the element from the given position 
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
			}
			temp1.next=temp2.next;
			temp2.next=null;
			temp2=null;
			size--;
			
		}
		
	}
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
	
	public String printT(LinkedList l1) 
	{
		String elem="";
		Node temp=head;
		while(temp.next!=null)
		{
			elem=elem+" "+temp.data;
			temp=temp.next;
		}
		return elem;
	}
		public int size()
	{
		return size;
	}
}

public class Linked {

	public static void main(String[] args) 
	{
		
		LinkedList l1 = new LinkedList();
		System.out.println("size before adding-> "+l1.size());
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		System.out.println(l1);
		
		LinkedList l2 = new LinkedList();
		l2.add(90);
		l2.add(80);
		l2.add(70);
		System.out.println(l2);
		System.out.println();
		System.out.println();
		l1.merge(l1, l2);
		String x = l1.printT(l1);
		System.out.println(x);
		
	
	
		
		
		
		
		
		
		
		
	}

}
