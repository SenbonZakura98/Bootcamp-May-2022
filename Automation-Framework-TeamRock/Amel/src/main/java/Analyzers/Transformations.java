package Analyzers;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Transformations implements IAnnotationTransformer {


    public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstractor, Method testMethod) {
        annotation.setRetryAnalyzer(RetryAnalyzer.class);
    }
}





