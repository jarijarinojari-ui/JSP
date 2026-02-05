package com.global.json;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tools.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) {
		Map<String, Object> header = new HashMap<>();
		List<User> list = new ArrayList<User>();
		ObjectMapper mapper = new ObjectMapper();
		User user = new User("Gemini", 3, true);
		try {
			String json = mapper.writeValueAsString(user);
			System.out.println(json);
			
			String prettyJson = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
			System.out.println(prettyJson);
			
			user =mapper.readValue(json, User.class);
			
			System.out.println("이름: " + user.getName());
			System.out.println("나이: " + user.getAge());
			System.out.println("개발자 여부: " + user.isDeveloper());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		list.add(new User("Gemini", 3, true));
		list.add(new User("HongGilDong", 30, false));
		list.add(new User("JavaMaster", 25, true));
		
		try {
			String jsonList = mapper.writeValueAsString(list); 
			//List 를 넣으면 Jackson이 자동으로 [] 형태로 만들어줌
			
			System.out.println("----한줄 출력----");
			System.out.println(jsonList);
			
			// 보기 좋게 출력(Pretty Print)
			String prettyJsonList = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
			System.out.println("예쁘게 출력");
			System.out.println(prettyJsonList);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
