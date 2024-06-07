package com.demo.auth.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 交互日志
 *
 * @author jack
 * @date 2024/06/06
 * @since develop
 */
@Aspect
@Component
public class UseTimeAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(UseTimeAspect.class);

    /**
     * queryAndMove
     */
    @Pointcut("execution(* com.demo.auth.controller.*.queryAndMove(..)) ")
    public void queryAndMovePointCuts() {
    }
    /**
     * queryAndMove
     *
     * @param point
     * @return
     * @throws Throwable
     */
    @Around(value = "queryAndMovePointCuts()")
    public Object paymentAround(ProceedingJoinPoint point) throws Throwable {
        Method method = ((MethodSignature) point.getSignature()).getMethod();
        String methodName = method.getDeclaringClass().getName() + "#" + method.getName();
        long start = System.currentTimeMillis();
        Object result = point.proceed();
        long end = System.currentTimeMillis();
        LOGGER.info("methodName:{},useTime:{}",methodName,(end-start)/1000);

        return result;
    }
}
