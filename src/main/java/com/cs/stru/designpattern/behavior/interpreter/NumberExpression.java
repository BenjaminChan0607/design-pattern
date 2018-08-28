package com.cs.stru.designpattern.behavior.interpreter;

/**
 * Created by benjaminChan on 2018/7/27 0027 下午 5:34.
 */
public class NumberExpression implements Expression {

    public void interpreter(Context context) {
        //设置操作数
        Integer operateNumber = Integer.valueOf(String.valueOf(context.current()));
        if (context.getOperateNumbers().size() == 0) {
            context.setLeftOperateNumber(operateNumber);
            context.setResult(operateNumber);
        } else {
            context.setRightOperateNumber(operateNumber);
            Expression expression = new ArithmeticExpression();//转换成算数表达式
            expression.interpreter(context);
        }
    }
}
