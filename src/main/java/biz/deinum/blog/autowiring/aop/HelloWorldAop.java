package biz.deinum.blog.autowiring.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @see HelloWorldService
 * @see HelloWorldConfig
 *
 * @author Marten Deinum
 */
public class HelloWorldAop {

    public static void main(String[] args) throws Exception {

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var service = ctx.getBean(HelloWorldService.class);
        service.sayHello("World"); // Throws NullPointerException due to method invocation on the proxy insteadof
    }
}


