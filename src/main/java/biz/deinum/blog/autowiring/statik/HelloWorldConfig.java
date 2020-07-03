package biz.deinum.blog.autowiring.statik;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.PrintWriter;
import java.io.Writer;

@Configuration
@ComponentScan
public class HelloWorldConfig {

    @Bean
    public Writer consoleWriter() {
        return new PrintWriter(System.out);
    }
}
