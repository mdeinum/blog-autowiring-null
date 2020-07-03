package biz.deinum.blog.autowiring.unsatisfied;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Sample with autowiring but not having the desired dependency available. This will result in an
 * {@code org.springframework.beans.factory.UnsatisfiedDependencyException} and prevent the application from starting.
 *
 * @see HelloWorldConfig
 *
 * @author Marten Deinum
 */
public class HelloWorldUnsatisfied {

    public static void main(String[] args) throws Exception {

        var ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

    }
}


