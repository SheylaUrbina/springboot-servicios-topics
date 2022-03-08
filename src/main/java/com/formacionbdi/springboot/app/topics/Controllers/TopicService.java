package com.formacionbdi.springboot.app.topics.Controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.formacionbdi.springboot.app.topics.entity.Topic;

@Service
public class TopicService {

	
	private List<Topic> topics =  new ArrayList<>( Arrays.asList(
			new Topic("CR19000001115114","009","DI"),
			new Topic("CR19000001115114","100","Frijoles"),
			new Topic("CR19000001115114","567","DI"),
			new Topic("CR19000001115114","987","DI"),
			new Topic("CR19000001115114","208","DI"),
			new Topic("CR19000001115114","498","DI")
			));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
		
	public Topic getTopic(String codigoError) {
		 return topics.stream().filter(t -> t.getCodigoError().equals(codigoError)).findFirst().get();	
		}
	
	public void addTopic(Topic topic) {
	topics.add(topic);	
	}
}
