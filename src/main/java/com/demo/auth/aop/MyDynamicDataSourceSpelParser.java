package com.demo.auth.aop;

import com.baomidou.dynamic.datasource.spel.DefaultDynamicDataSourceSpelParser;
import com.baomidou.dynamic.datasource.spel.DynamicDataSourceSpelParser;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Component
public class MyDynamicDataSourceSpelParser extends DefaultDynamicDataSourceSpelParser implements DynamicDataSourceSpelParser {
    @Override
    public String parse(MethodInvocation invocation, String key) {
        if("#{primaryDbName()}".equals(key)){
//            invocation.getProxy();
            return getValue(invocation,"primaryDbName");
        }else if("#{moveDbName()}".equals(key)){
            return getValue(invocation,"moveDbName");
        }
        return super.parse(invocation, key);
    }
    private String getValue(MethodInvocation invocation,String methodName){
        try{
            Object aThis = invocation.getThis();
            Method method = aThis.getClass().getDeclaredMethod(methodName);
            String value = (String) method.invoke(aThis);
            return value;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
