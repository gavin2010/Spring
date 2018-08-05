package com.gavin.ioc.componentscan.action;

import com.gavin.ioc.componentscan.service.IPersonService;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

@Controller@Lazy(true)
public class PersonAction {

    @Resource(name="personService")
    IPersonService personService;

    public void show(){
        personService.show();
    }

    @PostConstruct
    public void init(){
        System.out.println("Action初始化……");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Action销毁……");
    }
}