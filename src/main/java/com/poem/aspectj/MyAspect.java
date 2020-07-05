package com.poem.aspectj;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
/**
 * 切面类，在此类中编写各种类型通知
 */
@Aspect//对应<aop:aspect ref="myAspect">
@Component//对应<bean id="myAspect" class="aspectj.xml.MyAspect"/>
public class MyAspect {
    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.poem.repository.*.*(..))")
    private void myPointCut() {
        //对应<aop:pointcut expression="execution(* dynamic.jdk.*.*(..))" id="myPointCut"/>
    }
    /**
     * 前置通知，使用Joinpoint接口作为参数获得目标对象信息
     */
    @Before("myPointCut()")//对应<aop:before method="before" pointcut-ref="myPointCut"/>
    public void before(JoinPoint jp) {
        System.out.print("前置通知：模拟权限控制");
        System.out.println("，目标类对象：" + jp.getTarget()
                + "，被增强处理的方法：" + jp.getSignature().getName());
    }
    /**
     * 后置返回通知
     */
    @AfterReturning("myPointCut()")
    public void afterReturning(JoinPoint jp) {
        System.out.print("后置返回通知：" + "模拟删除临时文件");
        System.out.println("，被增强处理的方法：" + jp.getSignature().getName());
    }
    /**
     * 环绕通知
     * ProceedingJoinPoint是JoinPoint子接口，代表可以执行的目标方法
     * 返回值类型必须是Object
     * 必须一个参数是ProceedingJoinPoint类型
     * 必须throws Throwable
     */
    @Around("myPointCut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable{
        //开始
        System.out.println("环绕开始：执行目标方法前，模拟开启事务");
        //执行当前目标方法
        Object obj = pjp.proceed();
        //结束
        System.out.println("环绕结束：执行目标方法后，模拟关闭事务");
        return obj;
    }
    /**
     * 异常通知
     */
    @AfterThrowing(value="myPointCut()",throwing="e")
    public void except(Throwable e) {
        System.out.println("异常通知：" + "程序执行异常" + e.getMessage());
    }
    /**
     * 后置（最终）通知
     */
    @After("myPointCut()")
    public void after() {
        System.out.println("最终通知：模拟释放资源");
    }

}
