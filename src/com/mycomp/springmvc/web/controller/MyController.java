package com.mycomp.springmvc.web.controller;

import com.mycomp.springmvc.domain.Goods;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MyController {

    /*
     * 使用原生HttpServletRequest接收参数
     */
    @RequestMapping("first")
    public ModelAndView myForm1(HttpServletRequest request) {
        String goods_name = request.getParameter("goods_name");
        String goods_price = request.getParameter("goods_price");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods_name", goods_name);
        modelAndView.addObject("goods_price", goods_price);

        modelAndView.setViewName("/results/result1.jsp");
        return modelAndView;
    }

    /*
     * 使用处理器形参的方式接收参数;
     * 当请求的参数名称和处理器形参名称一致时会将请求参数与形参进行绑定, 并且会自动做类型的转换;
     * 当请求的参数名称和处理器形参名称不一致时, 需要做一下参数的映射, 例如:
     * @RequestParam(value = "goods_name", required = false, defaultValue = "zzq")
     * required: 表示此参数是不是必须要传, 默认是true
     * defaultValue: 表示不传值时的默认值
     */
    @RequestMapping("second")
    public ModelAndView myForm2(@RequestParam(value = "goods_name", required = false, defaultValue = "zzq") String goodsName,
                                @RequestParam(value = "goods_price", required = false, defaultValue = "27.3") Double goodsPrice) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods_name", goodsName);
        modelAndView.addObject("goods_price", goodsPrice);

        modelAndView.setViewName("/results/result2.jsp");
        return modelAndView;
    }

    /*
     * 使用JavaBean的方式接收参数;
     * 自动将接收到的参数封装成JavaBean对象, 并传入;
     * 前提是JavaBean类中的属性名称必须和参数名称保持一致;
     */
    @RequestMapping("third")
    public ModelAndView myForm3(Goods goods) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goods);

        modelAndView.setViewName("/results/result3.jsp");
        return modelAndView;
    }

    /*
     * 数组接收参数(页面里面是复选框, JavaBean对象的属性里面有个数组)
     */
    @RequestMapping("forth")
    public ModelAndView myForm4(Goods goods) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goods);

        modelAndView.setViewName("/results/result4.jsp");
        return modelAndView;
    }

    /*
     * 包装类接收参数(JavaBean对象的属性里面有另一个对象);
     * 详见request5.jsp
     */
    @RequestMapping("fifth")
    public ModelAndView myForm5(Goods goods) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goods);

        modelAndView.setViewName("/results/result5.jsp");
        return modelAndView;
    }

    /*
     * List集合接收参数(页面里面是多个, JavaBean对象的属性里面有个其他对象的List集合);
     * 详见request6.jsp
     */
    @RequestMapping("sixth")
    public ModelAndView myForm6(Goods goods) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("goods", goods);

        modelAndView.setViewName("/results/result6.jsp");
        return modelAndView;
    }
}
