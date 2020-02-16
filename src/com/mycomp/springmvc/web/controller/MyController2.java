package com.mycomp.springmvc.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class MyController2 {

    /*
     * 参数类型转换;
     * 内部的转换器自动地进行转换;
     * 如果是日期, 默认的转换器只识别"yyyy/mm/dd"的格式;
     * 如果想用其他格式, 需要自定义类型转换器;
     * 如果配置了自定义的日期类型转换器, 原来的"yyyy/mm/dd"就不识别了;
     */
    @RequestMapping("myConvert1")
    public ModelAndView convert1(Integer age, Date dob) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("age", age);
        modelAndView.addObject("dob", dob);

        modelAndView.setViewName("/results/result7.jsp");
        return modelAndView;
    }

    /*
     * 自定义类型转换器;
     * 详见MyDateConverter.java和springmvc.xml
     */
    @RequestMapping("myConvert2")
    public ModelAndView convert2(Integer age, Date dob) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("age", age);
        modelAndView.addObject("dob", dob);

        modelAndView.setViewName("/results/result8.jsp");
        return modelAndView;
    }

    /*
     * POST请求中文乱码问题;
     * 需要在web.xml中配置一个过滤器, 设置encoding为UTF-8;
     * 详见web.xml
     */
    @RequestMapping("chinese")
    public ModelAndView chinese(String name, Integer age) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", name);
        modelAndView.addObject("age", age);

        modelAndView.setViewName("/results/result9.jsp");
        return modelAndView;
    }
}
