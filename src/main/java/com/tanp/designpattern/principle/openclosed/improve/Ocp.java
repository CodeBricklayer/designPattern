package com.tanp.designpattern.principle.openclosed.improve;

/**
 * @author CodeBricklayer
 * @ClassName Ocp
 * @Description 开闭原则演示2
 * @date 2021/4/1 22:19
 */
public class Ocp {
    public static void main(String[] args) {

        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherGraphic());
    }
}

class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

abstract class Shape{
    int m_type;

    /**
     * 抽象方法
     */
    public abstract void draw();
}

class Rectangle extends Shape{

    public Rectangle() {
        super.m_type = 1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape{

    public Circle() {
        super.m_type = 2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}


class Triangle extends Shape{

    public Triangle() {
        super.m_type = 3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}

class OtherGraphic extends Shape{

    public OtherGraphic() {
        super.m_type = 4;
    }

    @Override
    public void draw() {
        System.out.println("绘制其他图形");
    }
}
