package cn.cjq.bomb.controller;

import cn.cjq.bomb.entity.User;
import cn.cjq.bomb.util.UserRepository;
import cn.cjq.bomb.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


//@RestController
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
    @Autowired
    private MongoTemplate mongoTemplate;
    @Autowired
    private UserRepository repository;

        @RequestMapping(value="/world",method = RequestMethod.GET)
        public String list(
        ) throws Exception{
            return "helloworld";
        }


    @RequestMapping(value="/data",method = RequestMethod.GET)
//    @ResponseBody
    public String data() throws Exception{
        // save a couple of User
        mongoTemplate.save(new User(uuidUtil.getUUID(), "admin"));
        mongoTemplate.save(new User(uuidUtil.getUUID(), "cjq"));


        // fetch all User
        System.out.println("User found with findAll():");
        System.out.println("-------------------------------");
        for (User user : repository.findAll()) {
            System.out.println(user);
        }


        // fetch an individual User
        System.out.println("User found with findByName('cjq'):");
        System.out.println("--------------------------------");
        System.out.println(repository.findByName("cjq"));
        return "新增成功";
    }

    @RequestMapping(value="/deletedata",method = RequestMethod.GET)
    public String deletedata() throws Exception{
        repository.deleteAll();
        return "删除成功";
    }
}
