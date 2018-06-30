package com.dyh.edu.demo.Controller;

import com.dyh.edu.demo.Entity.User;
import com.dyh.edu.demo.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private  UserRepository userRepository;

    @GetMapping("/")
    public String index(Model model) {
        //User result =  userRepository.findById(id);
        List<User>list=userRepository.findAll();
        model.addAttribute("lists", list);
        return "index";
    }


}
