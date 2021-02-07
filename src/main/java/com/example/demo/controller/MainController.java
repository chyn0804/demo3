package com.example.demo.controller;

import com.example.demo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.demo.vo.DptVO;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;

    @RequestMapping(value = "/")
    public String home(HttpServletRequest request, Model model) throws Exception {

        DptVO dptVO = mainService.getDpt() ;
        System.out.println("Dept No=" + dptVO.getDeptno());
        model.addAttribute("usr", dptVO );
        return "index";
    }
}
