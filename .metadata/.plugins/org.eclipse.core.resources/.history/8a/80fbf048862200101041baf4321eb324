package example.spring.mvc.controller;

import org.apache.tomcat.util.log.UserDataHelper.Mode;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import example.spring.mvc.model.User;
import example.spring.mvc.model.UserValidator;


@Controller
@SessionAttributes({"loggedInUser"})// storing this attribute at session level
public class SpringMvcController {
	//@RequestMapping("/doGreet")
	@GetMapping("/doGreet")
public String getIndexPage()
{
		System.out.println("Request received.");
	return "index";
}
	
	//@RequestMapping("/doLogin")
	@GetMapping("/doLogin")
	public String getLoginPage() {
		return "login";
		
	}
	//@RequestMapping(value = "/doValidate", method = RequestMethod.POST)
	@PostMapping("/doValidateAgain")
	public String doVAlidateUserAgain(
			@RequestParam("uid") String userName,
			@RequestParam("pwd") String password,
			Model modelObject
			
			)
	{
		String page= "failurePage";
		User userObject = new User(userName,password);
		boolean valid = UserValidator.isvalid(userObject);
		if(valid) {
              page="successPage";
              modelObject.addAttribute("loggedInUser",userName);
              modelObject.addAttribute("successMessage","Welcome");
		}
		else {
			modelObject.addAttribute("failureMessage","Sorry, Access Denied.");
		}
			return page;
	}
	
}
