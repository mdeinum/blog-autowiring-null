package biz.deinum.blog.autowiring.omitted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.Writer;

/**
 * Sample with omitted {@code @Autowired} on a field. The field is {@code null}.
 *
 * Executing this code will lead to a {@code NullPointerException}. To fix add {@code @Autowired} to the field or use
 * constructor injection (which is actually the preferred way).
 *
 * @author Marten Deinum
 */
@Service
public class HelloWorldService {

    private Writer writer;

    public void sayHello(String name) throws IOException {
        writer.write("Hello " + name);
    }
}
