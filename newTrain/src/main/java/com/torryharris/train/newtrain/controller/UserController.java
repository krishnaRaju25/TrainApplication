package com.torryharris.train.newtrain.controller;

import com.torryharris.train.newtrain.model.TrainDetail;
import com.torryharris.train.newtrain.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    UserRepo repo;
    @RequestMapping("railway")
    public String railway(){
        return "railway.jsp";
    }
    @RequestMapping("add")
    public String add(TrainDetail detail){
        repo.save(detail);
        return "railway.jsp";
    }

    @RequestMapping("back")
    public String back()
    {
        return "railway.jsp";
    }

    @RequestMapping("get")
    public ModelAndView get(@RequestParam int trainno)
    {
        ModelAndView mv=new ModelAndView("trainuserdetail.jsp");
        TrainDetail trains=repo.findById(trainno).orElse(new TrainDetail());
        mv.addObject(trains);
        return mv;
    }

}
