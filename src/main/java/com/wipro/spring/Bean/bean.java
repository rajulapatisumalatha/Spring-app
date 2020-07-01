package com.wipro.spring.Bean;

import org.springframework.stereotype.Component;

public class bean {
	private String opt;
	private int num;
	private int res=0;
	public bean() {
		super();
	}
	public bean(String opt, int num) {
		super();
		this.opt = opt;
		this.num = num;
	}
	public void curr()
	{
		
		if(opt.equalsIgnoreCase("Dollar"))
		{
			res=71*num;
		}else if(opt.equalsIgnoreCase("Euro"))
		{
			res=78*num;
			
		}else if(opt.equalsIgnoreCase("Riyal"))
		{
			res=18*num;
		}
		
	}
	public int getRes() {
		return res;
	}
		
		
}
