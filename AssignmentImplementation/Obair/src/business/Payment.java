package business;

public class Payment {
	private int id;
	private String details;
	private User sender;
	private Employee reciever;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String details() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public User getSender() {
		return sender;
	}
	public void setSender(User sender) {
		this.sender = sender;
	}
	public Employee getReciever() {
		return reciever;
	}
	public void setReciever(Employee reciever) {
		this.reciever = reciever;
	}
	
}
