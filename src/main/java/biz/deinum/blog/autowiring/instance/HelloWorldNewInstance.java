package biz.deinum.blog.autowiring.instance;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample with autowiring but creating an instance outside the scope of Spring. Executing this code will lead to a
 * {@code NullPointerException}. To fix make it a proper bean so Spring can do dependency injection.
 *
 * @see HelloWorldService
 * @see HelloWorldConfig
 *
 * @author Marten Deinum
 */
public class HelloWorldNewInstance {

    public static void main(String[] args) throws Exception {

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var service = new HelloWorldService();
        service.sayHello("World");

    }
}


