package biz.deinum.blog.autowiring.omitted;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample with omitted {@code @Autowired} on a field. The field is {@code null}.
 *
 * Executing this code will lead to a {@code NullPointerException}. To fix add {@code @Autowired} to the field or use
 * constructor injection (which is actually the preferred way).
 *
 * @see HelloWorldService
 *
 * @author Marten Deinum
 */
public class HelloWorldOmitted {

    public static void main(String[] args) throws Exception {

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var service = ctx.getBean(HelloWorldService.class);
        service.sayHello("World"); // Throws NullPointerException due to injection metadata not available
    }
}


