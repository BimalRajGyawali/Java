package serializable;

import java.io.Serializable;

//Serialization is used to write the state of object

// Class should implements Serialization

public class User implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -410060763075842830L;
	private int id;
	private String name;
	private transient String password;
	
	// transient properties are not shown during deserialiszation
	
	
	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
	}
	
	
	
	
}





