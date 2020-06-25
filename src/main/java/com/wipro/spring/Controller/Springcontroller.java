package com.wipro.spring.Controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.spring.Bean.Bean;

@Controller
@CrossOrigin(origins="http://18.218.54.169:8080/")
public class Springcontroller {
	@Autowired(required=true)
	Bean b;
	@RequestMapping("/")
	public String employee() {
		return "index.html";
	}
	
	@RequestMapping(path="/check")
	public String currency(@RequestParam(required = true) String num,
            @RequestParam(required = true) String Currency,Model model) {
		
		
	int n=Integer.parseInt(num);
	String Curr=Currency.toString();
	//Bean b=new Bean();
		float res=0;
		if(Curr.equalsIgnoreCase("Dollar"))
		{
			res=71*n;
			
		}else if(Curr.equalsIgnoreCase("Euro"))
		{
			res=78*n;
			
		}else if(Curr.equalsIgnoreCase("Riyal"))
		{
			res=18*n;
		}
	
	//System.out.print(b.getRes());
	
	model.addAttribute("cur", res);
		
		return "index1.html";
	}

}
