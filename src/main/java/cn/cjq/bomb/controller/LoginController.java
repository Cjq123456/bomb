package cn.cjq.bomb.controller;

import cn.cjq.bomb.entity.User;
import cn.cjq.bomb.util.UserRepository;
import cn.cjq.bomb.util.uuidUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@RestController
@Controller
@RequestMapping("/login")
public class LoginController {

        @RequestMapping(value="/list",method = RequestMethod.GET)
        public String list(
        ) throws Exception{
            return "login";
        }

}
