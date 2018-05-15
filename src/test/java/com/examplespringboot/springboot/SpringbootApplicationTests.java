package com.examplespringboot.springboot;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.http.HttpServlet;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.SpringBoot.model.PersonDTO;













@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SpringbootApplicationTests {
	
	private static final Logger logger = Logger.getLogger(SpringbootApplicationTests.class.getName());
	
	@Value("${local.server.port:8080}")
	private int localServerPort;
	
	@Test
	public void exampleRestTest() throws Exception {
		 
		String url = "http://localhost:" + localServerPort + "/regestion";
		RestTemplate restTemplate =new RestTemplate();
		Map<String,String> requestParams = new HashMap<String,String> ();
		requestParams.put("id",  "11");
		requestParams.put("firstName", "saleem"); // Cast
		requestParams.put("secondName", "ali");
		requestParams.put("profession", "enger");
		requestParams.put("salary", "1200");
		PersonDTO response = restTemplate.postForObject(url, requestParams, PersonDTO.class);
		logger.log(Level.INFO, "First name [" + response.getFirstName() + "] lastname [" + response.getSecondName() + "] Salary [" + response.getSalary() + "]");
		
	}
	
}
