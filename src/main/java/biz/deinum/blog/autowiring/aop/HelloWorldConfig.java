package biz.deinum.blog.autowiring.aop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.io.PrintWriter;
import java.io.Writer;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class HelloWorldConfig {

    @Bean
    public Writer consoleWriter() {
        return new PrintWriter(System.out);
    }

}
