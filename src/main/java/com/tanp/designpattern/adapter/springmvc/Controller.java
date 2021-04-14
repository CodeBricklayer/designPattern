package com.tanp.designpattern.adapter.springmvc;

/**
 * @author CodeBricklayer
 * @date 2021/4/14 20:58
 * @description 多种Controller实现
 */
public interface Controller {
}
class HttpController implements Controller{
    public void doHttpHadler(){
        System.out.println("http..");
    }
}

class SimpleController implements Controller{
    public void doSimpleHandler(){
        System.out.println("simple...");
    }
}

class AnnotationController implements Controller{
    public void doAnnotationHandler(){
        System.out.println("annotation...");
    }
}
