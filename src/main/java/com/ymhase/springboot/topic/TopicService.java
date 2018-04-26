package com.ymhase.springboot.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

    private List<Topic> topicList = new ArrayList<Topic>(Arrays.asList(new Topic("1", "abcs", "des1"),
	    new Topic("2", "abcs", "des1"), new Topic("3", "abcs", "des1")));

    public List<Topic> getAllTopic() {

	return topicList;
    }

    public Topic getAllTopicById(String topicName) {

	if (topicName.equals("abcd") || topicName == "abcd") {
	    return topicList.get(0);
	}
	if (topicName.equals("abcd")) {
	    return topicList.get(1);
	}

	if (topicName.equals("abcd")) {
	    return topicList.get(2);
	}
	return topicList.get(2);
    }

    public void addTopic(Topic topic) {

	topicList.add(topic);

	System.out.println(topic.getDescription() + topic.getId() + topic.getName());

    }

    public void updateTopic(Topic topic) {

	for (Topic t : topicList) {

	    if (t.getId().equals(topic.getId())) {
		t.setDescription(topic.getDescription());
		t.setName(topic.getName());
	    }
	}
    }

    public void deleteTopic(String id) {
	for (Topic t : topicList) {

	    if (t.getId().equals(id)) {

		topicList.remove(t);
	    }
	}

    }
}
