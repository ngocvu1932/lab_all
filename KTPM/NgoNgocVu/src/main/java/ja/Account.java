package ja;

public class Account {
	private long id;
	private String fristName;
	private String lastName;
	private int age;
	private String address;
	
	public Account() {
		super();
	}
	
	public Account(long id, String fristName, String lastName, int age, String address) {
		super();
		this.id = id;
		this.fristName = fristName;
		this.lastName = lastName;
		this.age = age;
		this.address = address;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFristName() {
		return fristName;
	}
	public void setFristName(String fristName) {
		this.fristName = fristName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", fristName=" + fristName + ", lastName=" + lastName + ", age=" + age
				+ ", address=" + address + "]";
	}
	
	
	
	

}
