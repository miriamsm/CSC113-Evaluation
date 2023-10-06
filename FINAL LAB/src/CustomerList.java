// write your information
// Name : Miriam almogren
// ID : 443200568
// Lab instructor :
//------------------ class customer list -----------------------

class CustomerList {

	private node head;

	public CustomerList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}
	
// insert a customer at the front of the list
	public void InsetAtfront (Customer data){
		node n = new node(data);
		if(isEmpty())
			head=n;
		else
		{
			n.setNext(head);
			head=n;
		}	
	}

 /*deletes all customers whose price of all orders is less than
 the received price.*/
	public void removeCustomer(double price) {
        node cNode=head;
        while(cNode!=null){
        if(cNode.getData().calculatePrice()<price){
            cNode=null;
        }
        cNode=cNode.getNext();}


		
	}

// print each customer name and total price of all orders

	public void print() {
		node current = head;
		while (current != null) {
			System.out.println("Customer name =" + current.getData().getname()+" Total Price ="+current.getData().calculatePrice());
			current = current.getNext();
		}
	}
}  // end of class CustomerList