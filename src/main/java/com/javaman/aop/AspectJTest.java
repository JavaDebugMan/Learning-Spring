/*
package com.javaman.aop;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

*/
/**
 * @author pengzhe
 * @date 2018/4/21 14:44
 * @description
 *//*

@Aspect
public class AspectJTest {

    @Pointcut("execution(* *.test(..))")
    public void test() {
        System.out.println("AspectJTest point");
    }

    @Before("test()")
    public void beforeTest() {
        System.out.println("@Before beforeTest");
    }

    @After("test()")
    public void afterTest() {
        System.out.println(" @After afterTest");
    }

    @Around("test()")
    public Object aroundTest(ProceedingJoinPoint joinPoint) {
        System.out.println("@Around aroundTest before1");
        Object o = null;
        try {
            o = joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("@Around aroundTest after1");

        return o;
    }

}
*/
