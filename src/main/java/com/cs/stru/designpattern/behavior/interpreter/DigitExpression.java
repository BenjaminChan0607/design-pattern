package com.cs.stru.designpattern.behavior.interpreter;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 5:44.
 */
public class DigitExpression implements Expression{

    public void interpreter(Context context) {
        Expression expression = new NumberExpression();//如果是数字，则直接转为number表达式
        expression.interpreter(context);
    }
}
