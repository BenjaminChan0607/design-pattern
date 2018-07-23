package com.cs.stru.designpattern.behavior.templatemethod.concrete;

/**
 * Created by benjaminChan on 2018/7/23 0023 上午 10:14.
 */
public class PageBuilderTest {

    public static void main(String[] args) {
        MyPageBuilder myPageBuilder = new MyPageBuilder();
        myPageBuilder.buildHtml();
        myPageBuilder.appendHead(myPageBuilder.getStringBuffer());
        myPageBuilder.appendBody(myPageBuilder.getStringBuffer());
        System.out.println(myPageBuilder.getStringBuffer().toString());
    }
}
