package com.wipro.spring.Bean;

import org.springframework.stereotype.Component;

@Component
public class Bean {
	private String opt;
	private int num;
	private int res=0;
	public Bean() {
		super();
	}
	public Bean(String opt, int num) {
		super();
		this.opt = opt;
		this.num = num;
	}
	
	
		
}
