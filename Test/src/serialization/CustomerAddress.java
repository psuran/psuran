package serialization.com;

import java.io.Serializable;

public class CustomerAddress implements Serializable{
	
	private static final long serialVersionUID = -4475012822559208297L;
	private String add1;
	private String add2;
	private String city;
	private String zip;
	
	public CustomerAddress(String add1, String add2, String city, String zip) {
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.zip = zip;
	}
	public String getAdd1() {
		return add1;
	}
	public String getAdd2() {
		return add2;
	}
	public String getCity() {
		return city;
	}
	public String getZip() {
		return zip;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "CustomerAddress [add1=" + add1 + ", add2=" + add2 + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
