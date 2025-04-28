package example.spring.core;

public class UserService implements GreetingService {
  
public UserService(int age, String name, String message) {
	System.out.println("int,string,string");
		this.age = age;
		this.name = name;
		this.message = message;
	}
@Override
	public String toString() {
		return "UserService [name=" + name + ", message=" + message + ", age=" + age + "]";
	}
public String getName() {
	System.out.println("From getName");
		return name;
	}
	public void setName(String name) {
		System.out.println("From setName");
		this.name = name;
	}
	public String getMessage() {
		System.out.println("from getmessage");
		return message;
	}
	public void setMessage(String message) {
		System.out.println("from setmessage");
		this.message = message;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
public UserService() {
		System.out.println("Inside UserSrvice()");
	}
public UserService(String name, String message, int age) {
		System.out.println("string,string,int");
		this.name = name;
		this.message = message;
		this.age = age;
	}
private String name;
   private String message;
   private int age;
	@Override
	public String sayGreeting() {
		
		String reply=message +" "+name+" ,Your Age Is "+age+" Years.";
		return reply;
	}

}
