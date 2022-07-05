package biz.deinum.blog.autowiring.constructor;

import java.io.IOException;
import java.io.Writer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class HelloWorldService {

    @Autowired
    private Writer writer;

    public HelloWorldService() throws IOException {
        this.writer.write("Constructed: " + getClass().getSimpleName());
    }

    public void sayHello(String name) throws IOException {
        writer.write("Hello " + name);
    }
}
