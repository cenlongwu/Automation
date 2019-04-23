package com.hx.ATwuliu.util;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/4/23.
 */
public class OverrideIAnnotationTransformer implements IAnnotationTransformer{
    @Override
    public void transform(ITestAnnotation iTestAnnotation, Class aClass, Constructor constructor, Method method) {
        IRetryAnalyzer iRetryAnalyzer= iTestAnnotation.getRetryAnalyzer();
        if(iRetryAnalyzer==null){
            iTestAnnotation.setRetryAnalyzer(OverrideIReTry.class);
        }
    }
}
