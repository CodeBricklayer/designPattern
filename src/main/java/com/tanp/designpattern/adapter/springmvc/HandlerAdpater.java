package com.tanp.designpattern.adapter.springmvc;

/**
 * @author CodeBricklayer
 * @date 2021/4/14 20:58
 * @description 定义一个Adapter接口
 */
public interface HandlerAdpater {
    public boolean supports(Object handler);

    public void handle(Object handler);
}

//多种适配器
class SimpleHandlerAdapter implements HandlerAdpater{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handle(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}
class AnnotationAdapter implements HandlerAdpater{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handle(Object handler) {
        ((AnnotationController)handler).doAnnotationHandler();
    }
}

class HttpAdapter implements HandlerAdpater{

    @Override
    public boolean supports(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handle(Object handler) {
        ((HttpController)handler).doHttpHadler();
    }
}