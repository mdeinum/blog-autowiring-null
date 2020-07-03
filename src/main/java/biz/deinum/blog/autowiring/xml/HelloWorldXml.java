package biz.deinum.blog.autowiring.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldXml {

    public static void main(String[] args) throws Exception {

        var ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        var service = ctx.getBean(HelloWorldService.class);
        service.sayHello("World"); // Throws NullPointerException due to not configuring annotation config
    }
}
