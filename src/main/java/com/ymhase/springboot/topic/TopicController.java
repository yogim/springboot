package com.ymhase.springboot.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getTopic() {

	return topicService.getAllTopic();
    }

    @RequestMapping("/topic/{topicName}")
    public Topic getTopicById(@PathVariable String topicName) {

	System.out.println(topicService.getAllTopicById(topicName).getName());
	return topicService.getAllTopicById(topicName);
    }

    @RequestMapping(method=RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic){
	
	topicService.addTopic(topic);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic) {
	
	topicService.updateTopic(topic);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value = "/topics/{id}")
    public void updateTopic(String id) {
	
	topicService.deleteTopic(id);
    }
    
}
