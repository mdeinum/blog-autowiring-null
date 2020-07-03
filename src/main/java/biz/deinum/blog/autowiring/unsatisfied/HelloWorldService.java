package biz.deinum.blog.autowiring.unsatisfied;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;

/**
 * Sample with autowiring of a static field. {@code @Autowired} on a static field won't work and hence the field is
 * {@code null}. Executing this code will lead to a {@code NullPointerException}. To fix this remove the {@code static}
 * keyword for the field.
 *
 * You can work-around it as well by using either constructor, method or setter injection and assign the value to the
 * static field. Although generally that isnt recommended!
 *
 * @author Marten Deinum
 */
@Service
public class HelloWorldService {

    @Autowired
    private Writer writer;

    public void sayHello(String name) throws IOException {
        writer.write("Hello " + name);
    }
}
