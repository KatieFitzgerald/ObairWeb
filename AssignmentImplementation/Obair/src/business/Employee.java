package business;

public class Employee extends User {
		private String employeeName;
		private String category;
		private int availability;
		 
		private User sender;
		private Employee reciever;
		
		public String getName() {
			return employeeName;
		}
		public void setName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public int getAvailability() {
			return availability;
		}
		public void setAvailability(int availability) {
			this.availability = availability;
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
