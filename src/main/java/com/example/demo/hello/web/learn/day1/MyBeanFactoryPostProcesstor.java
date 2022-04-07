package com.example.demo.hello.web.learn.day1;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcesstor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {

        for (String name :  configurableListableBeanFactory.getBeanDefinitionNames()) {
            System.out.println(name);
            BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(name);
            System.out.println(beanDefinition);
        }
    }
}
