package com.cs.stru.designpattern.behavior.templatemethod.concrete;

/**
 * Created by benjaminChan on 2018/7/23 0023 上午 10:10.
 */
public class MyPageBuilder extends AbstractPageBuilder {

    public void appendHead(StringBuffer stringBuffer) {
        stringBuffer.append("<head><title>MyPageBuilder 你好</title></head>");
    }

    public void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body><h1>MyPageBuilder 你好,世界！</h1></body>");
    }
}
