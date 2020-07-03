package biz.deinum.blog.autowiring.statik;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample with autowiring of a static field. {@code @Autowired} on a static field won't work and hence the field is
 * {@code null}. Executing this code will lead to a {@code NullPointerException}. To fix this remove the {@code static}
 * keyword for the field.
 *
 * You can work-around it as well by using either constructor, method or setter injection and assign the value to the
 * static field. Although generally that isnt recommended!
 *
 * @see HelloWorldService
 *
 * @author Marten Deinum
 */
public class HelloWorldStatic {

    public static void main(String[] args) throws Exception {

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var service = ctx.getBean(HelloWorldService.class);
        service.sayHello("World"); // Throws NullPointerException due to injection on static field
    }
}


