package com.wipro.spring.Controller;

import java.awt.PageAttributes.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wipro.spring.Bean.bean;

@Controller
@CrossOrigin(origins="http://3.15.212.114:8080/")
public class Springcontroller {
	
	@RequestMapping("/cur")
	public String employee() {
		return "index.html";
	}
	
	@RequestMapping(path="/check")
	public String currency(@RequestParam(required = true) String num,@RequestParam(required = true) String Currency,Model model) {	
	int n=Integer.parseInt(num);
	String Curr=Currency.toString();
		float res=0;
		bean b=new bean(Curr,n);
		b.curr();
	res=b.getRes();
	model.addAttribute("cur", res);
		return "index1.html";
	}

}
