package com.tanp.designpattern.prototype.deepclone;

import java.io.*;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 15:40
 * @description TODO
 */
public class DeepPrototype implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    public String name;

    /**
     * 引用数据类型
     */
    public DeepCloneableTarget deepCloneableTarget;

    public DeepPrototype() {
    }

    /**
     * 深拷贝-方式1 使用clone方法
     *
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //这里完成对基本数据类型（属性）和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepPrototype deepPrototype = (DeepPrototype) deep;
        deepPrototype.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepPrototype;
    }

    /**
     * 深拷贝- 方式2 通过对象的序列化实现深拷贝（推荐使用）
     */
    public Object deepClone() {
        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            //序列化
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            //当前对象以输入流的方式输出
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepPrototype copyObj = (DeepPrototype) ois.readObject();
            return copyObj;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (Exception e2) {
                System.out.println(e2.getMessage());
            }
        }
    }

}
