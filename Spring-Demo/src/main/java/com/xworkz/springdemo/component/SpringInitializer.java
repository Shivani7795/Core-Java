package com.xworkz.springdemo.component;


import com.xworkz.springdemo.config.SpringConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class SpringInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    public SpringInitializer(){
        System.out.println("Spring initializer loaded");
    }
    @Override
    protected Class<?>[] getRootConfigClasses() {
        System.out.println("getRootConfigClasses");
        return new Class[0];
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        System.out.println("getServletConfigClasses");
        return new Class[] {SpringConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        System.out.println("getServletMappings");
        return new String[0];
    }
}
