package com.tanp.designpattern.principle.openclosed;

/**
 * @author CodeBricklayer
 * @ClassName Ocp
 * @Description 开闭原则的演示
 * @date 2021/4/1 22:06
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawTriangle(new Triangle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }else if (s.m_type == 3){
            drawTriangle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }

    public void drawTriangle(Shape r){
        System.out.println("绘制三角形");
    }
}


class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    public Circle() {
        super.m_type = 2;
    }
}

class Triangle extends Shape{
    public Triangle() {
        super.m_type = 3;
    }
}