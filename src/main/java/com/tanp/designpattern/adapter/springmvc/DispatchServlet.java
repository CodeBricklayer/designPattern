package com.tanp.designpattern.adapter.springmvc;

import java.util.ArrayList;
import java.util.List;

/**
 * @author CodeBricklayer
 * @date 2021/4/14 20:58
 * @description 适配器
 */
public class DispatchServlet {
    static List<HandlerAdapter> handlerAdapters = new ArrayList<HandlerAdapter>();

    public DispatchServlet() {
        handlerAdapters.add(new AnnotationHandlerAdapter());
        handlerAdapters.add(new HttpHandlerAdapter());
        handlerAdapters.add(new SimpleHandlerAdapter());
    }

    public void doDispatch() {
        //此处模拟Spring MVC从request取handler对象，
        //适配器可以获取到希望的Controller
        //HTTPController controller = new HttpController();
        AnnotationController controller = new AnnotationController();
        //SimpleController controller = new SimpleController();
        //得到对应的适配器
        HandlerAdapter adapter = getHandler(controller);
        //通过适配器执行对应的controller对应方法
        adapter.handle(controller);
    }

    public HandlerAdapter getHandler(Controller controller) {
        //遍历：根据得到的controller（handler），返回对应的适配器
        for (HandlerAdapter adapter : handlerAdapters) {
            if (adapter.supports(controller)) {
                return adapter;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().doDispatch();
    }
}
