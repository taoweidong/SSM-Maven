package com.taowd.controller;

import java.io.UnsupportedEncodingException;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * User控制器单元测试
 * @author Taowd
 * @version 2018年12月26日
 * @see UserControllerTest
 */
public class UserControllerTest extends BaseTest {

	@Test
	public void getUserListTest() throws Exception {

		// perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
		String result = mockMvc.perform(MockMvcRequestBuilders//
				// get:声明发送一个get请求的方法。另外提供了其他的请求的方法，如：post、put、delete等。
				.get("/getList")// 请求URL地址
				// param：添加request的参数，如上面发送请求的时候带上了了pcode =root的参数。
				// 假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
				.characterEncoding("UTF-8")//
				.accept(MediaType.APPLICATION_JSON)//
				.contentType(MediaType.APPLICATION_JSON_UTF8))//
				.andDo(MockMvcResultHandlers.print())//
				// andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
				.andExpect(MockMvcResultMatchers.status().isOk())//
				.andReturn()//
				.getResponse()//
				.getContentAsString();

		System.out.println(result);
	}

	@Test
	public void userListTest() throws UnsupportedEncodingException, Exception {
		// perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
		String result = mockMvc.perform(MockMvcRequestBuilders//
				// get:声明发送一个get请求的方法。另外提供了其他的请求的方法，如：post、put、delete等。
				.post("/getUserList")// 请求URL地址
				// param：添加request的参数，如上面发送请求的时候带上了了pcode =root的参数。
				// 假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
				.characterEncoding("UTF-8")//
				.accept(MediaType.APPLICATION_JSON)//
				.contentType(MediaType.APPLICATION_JSON_UTF8))//
				.andDo(MockMvcResultHandlers.print())//
				// andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
				.andExpect(MockMvcResultMatchers.status().isOk())//
				.andReturn()//
				.getResponse()//
				.getContentAsString();

		System.out.println(result);
	}

	/**
	 * Pos请求单元测试.
	 * @throws UnsupportedEncodingException
	 * @throws Exception
	 */
	@Test
	public void postTestTest() throws UnsupportedEncodingException, Exception {
		// perform：执行一个RequestBuilder请求，会自动执行SpringMVC的流程并映射到相应的控制器执行处理；
		String result = mockMvc.perform(MockMvcRequestBuilders//
				// get:声明发送一个get请求的方法。另外提供了其他的请求的方法，如：post、put、delete等。
				.post("/postTest/张三")// 请求URL地址
				// param：添加request的参数，如上面发送请求的时候带上了了pcode =root的参数。
				// 假如使用需要发送json数据格式的时将不能使用这种方式，可见后面被@ResponseBody注解参数的解决方法
				.accept(MediaType.APPLICATION_JSON)//
				.contentType(MediaType.APPLICATION_JSON_UTF8))//
				.andDo(MockMvcResultHandlers.print())//
				// andExpect：添加ResultMatcher验证规则，验证控制器执行完成后结果是否正确（对返回的数据进行的判断）；
				.andExpect(MockMvcResultMatchers.status().isOk())//
				.andReturn()//
				.getResponse()//
				.getContentAsString();

		System.out.println(result);
	}

}
