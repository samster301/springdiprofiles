package com.samster.springdiprofiles;

import com.samster.springdiprofiles.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

//@ActiveProfiles("dev")
@SpringBootTest
class SpringdiprofilesApplicationTests {

	@Autowired
	private MyController myController;


	@Test
	void testDevService(){
		System.out.println(myController.doIt());

	}

	@Test
	void contextLoads() {
	}

}
