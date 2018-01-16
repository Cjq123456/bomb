package cn.cjq.bomb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//@RestController
@Controller
@RequestMapping("/hello")
public class HelloWorldController {
        @RequestMapping(value="/world",method = RequestMethod.GET)
        public String list(
        ) throws Exception{
            return "helloworld";
        }
}
