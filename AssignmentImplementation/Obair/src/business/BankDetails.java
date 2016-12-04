package business;

public class BankDetails {
	
	private int accNum;
	private String iban;
	private String bic;
	private User bankDetails;
	
	public int getAcc() {
		return accNum;
	}
	public void setAcc(int accNum) {
		this.accNum = accNum;
	}
	public String getIban() {
		return iban;
	}
	public void setIban(String iban) {
		this.iban = iban;
	}
	public String getBic() {
		return bic;
	}
	public void setBic(String bic) {
		this.bic = bic;
	}
	public User getDetails() {
		return bankDetails;
	}
	public void setDetails0(User bankDetails) {
		this.bankDetails = bankDetails;
	}
	
}
