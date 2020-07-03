package biz.deinum.blog.autowiring.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Around("execution(* biz.deinum.blog..*.*(..))")
    public Object log(ProceedingJoinPoint pjp) throws Throwable{
        try {
            System.out.println("Before method: " + pjp.getSignature().getName());
            return pjp.proceed();
        } finally {
            System.out.println("After method: " + pjp.getSignature().getName());
        }

    }
}
