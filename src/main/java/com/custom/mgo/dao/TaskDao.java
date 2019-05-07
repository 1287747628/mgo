package com.custom.mgo.dao;

import com.custom.mgo.model.Task;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class TaskDao {

    @Resource
    private MongoTemplate mongoTemplate;

    public List<Task> findAll() {
        return mongoTemplate.findAll(Task.class);
    }

}
