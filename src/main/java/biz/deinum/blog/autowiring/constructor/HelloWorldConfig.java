package biz.deinum.blog.autowiring.constructor;

import java.io.PrintWriter;
import java.io.Writer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class HelloWorldConfig {

    @Bean
    public Writer consoleWriter() {
        return new PrintWriter(System.out);
    }
}
