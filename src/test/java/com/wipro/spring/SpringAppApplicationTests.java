package com.wipro.spring;


import static org.junit.Assert.assertEquals;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.wipro.spring.Bean.bean;

@SpringBootTest
class SpringAppApplicationTests {

	@Test
	void contextLoads() {
	}
	@Test
	    public void doller() throws Exception {
		 bean b=new bean("Dollar",2);
			b.curr();
			int res=b.getRes();
			assertEquals(142,res);
	    }
	 @Test
	    public void ero() throws Exception {
		 bean bt1=new bean("Euro",2);
			bt1.curr();
			int res1=bt1.getRes();
			assertEquals(156,res1);
	    }
	 public void riyal() throws Exception {
		 bean bt2=new bean("Riyal",2);
			bt2.curr();
			int res2=bt2.getRes();
			assertEquals(36,res2);
	    }
	 

}
