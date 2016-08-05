package com.algaworks.wine;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.algaworks.wine.WineApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WineApplication.class)
@WebAppConfiguration
public class WineApplicationTests {

	@Test
	public void contextLoads() {
	}

}
