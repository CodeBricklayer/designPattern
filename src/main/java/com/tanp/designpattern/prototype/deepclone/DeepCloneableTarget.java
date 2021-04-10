package com.tanp.designpattern.prototype.deepclone;

import java.io.Serializable;

/**
 * @author CodeBricklayer
 * @date 2021/4/10 15:37
 * @description TODO
 */
public class DeepCloneableTarget implements Serializable,Cloneable {

    private static  final  long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 因为该类的属性，都是String，因此我们使用默认的clone完成即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
