//--------------------------- class Node ------------------------------
class node {
	private Customer data;
	private node next;
	
	public  node(Customer data) {
		this.data = data;
		this.next = null;
	}
	public Customer getData() {
		return data;
	}
	public void setData(Customer data) {
		this.data = data;
	}
	public node getNext() {
		return next;
	}
	public void setNext(node next) {
		this.next = next;
	}
}  // end class node
