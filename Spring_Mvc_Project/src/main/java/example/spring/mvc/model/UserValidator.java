package example.spring.mvc.model;

public class UserValidator {
  public static boolean isvalid(User currentUser) {
	  boolean success=false;
	  String currentUserName = currentUser.getUserName();
	  String currentUserPassword = currentUser.getPassword();
		if(currentUserName.equals("admin") && currentUserPassword.equals("phoenix1234"))	
			success=true;
		
	  return success;
  }
}
