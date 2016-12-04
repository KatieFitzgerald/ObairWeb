package business;

public class Job {
	
	private int id;
	private String description;
	private String location;
	private User customer;
	private Employee worker;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public User getCustomer() {
		return customer;
	}
	public void setCustomer(User customer) {
		this.customer = customer;
	}
	public Employee getWorker() {
		return worker;
	}
	public void setWorker(Employee worker) {
		this.worker = worker;
	}
	
}
