package serialization.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Customer extends Account implements Serializable {

	private static final long serialVersionUID = 2035641721183526239L;
	private String customerId;
	private String custName;
	private String phoneNumber;
	private CustomerAddress address;
	
	public Customer(String customerId, String custName, String phoneNumber, CustomerAddress address) {
		super();
		this.customerId = customerId;
		this.custName = custName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getCustomerId() {
		return customerId;
	}
	public String getCustName() {
		return custName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public CustomerAddress getAddress() {
		return address;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(CustomerAddress address) {
		this.address = address;
	}
	 private void writeObject(ObjectOutputStream oos) throws IOException {
		 oos.defaultWriteObject();
		 oos.writeObject(getAccountNumber());
		 oos.writeObject(getAccountType());
		 oos.writeObject(getBalance());
	}
	 private void readObject(ObjectInputStream ois) throws ClassNotFoundException, IOException {
		 ois.defaultReadObject();
		 setAccountNumber((String) ois.readObject());
		 setAccountType((String) ois.readObject());
		 setBalance((String) ois.readObject());
	}
	
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", custName=" + custName + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + ", getAccountNumber()=" + getAccountNumber() + ", getAccountType()="
				+ getAccountType() + ", getBalance()=" + getBalance() + "]";
	}
	public static void main(String[] args) {
		String fileName = "customer.ser";
		//serializeObject(fileName);
		deserializeObject(fileName);

	}
	private static void deserializeObject(String fileName) {
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(fileName)))){
			Customer customer = (Customer)ois.readObject();
			System.out.println(customer.toString());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	private static void serializeObject(String fileName) {
		
		CustomerAddress address = new CustomerAddress("add1", "add2", "city", "zip");
		Customer customer = new Customer("id", "name", "number", address);
		customer.setAccountNumber("accountNumber");
		customer.setAccountType("checking");
		customer.setBalance("1000");
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(fileName)))){
			oos.writeObject(customer);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
