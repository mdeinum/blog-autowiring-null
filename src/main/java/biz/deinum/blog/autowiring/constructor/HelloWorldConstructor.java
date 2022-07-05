package biz.deinum.blog.autowiring.constructor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample with autowiring of a field and using that field in the constructor.
 *
 * The {@code @Autowired} field isn't available yet in the constructor as the object is
 * still being constructed. Spring can only inject the dependency after the object has
 * finished construction. When executing the constructor the field is still {@code null}.
 * Executing this code will lead to a {@code NullPointerException}. To fix use constructor injection
 * instead of field injection. Constructor injection should be the preferred method of
 * injecting dependencies anyway.
 *
 * @author Marten Deinum
 */
public class HelloWorldConstructor {

    public static void main(String[] args) throws Exception {

        // Throws NullPointerException due using the field too early
        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);
        var service = ctx.getBean(HelloWorldService.class);
        service.sayHello("World");
    }
}


