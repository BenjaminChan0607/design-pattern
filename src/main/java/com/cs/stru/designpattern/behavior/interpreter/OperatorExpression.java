package com.cs.stru.designpattern.behavior.interpreter;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 5:34.
 */
public class OperatorExpression implements Expression {

    public void interpreter(Context context) {
        context.setOperator(context.current());//设置运算符
    }
}
