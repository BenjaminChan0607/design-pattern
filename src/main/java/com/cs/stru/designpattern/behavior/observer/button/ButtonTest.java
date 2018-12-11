package com.cs.stru.designpattern.behavior.observer.button;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:57
 *  观察者模式：发布（release）--订阅（subscribe），变化（listen）--更新（update）
    事件驱动模型：请求（request）--响应（response），事件发生（occur）--事件处理（handle）
 */
public class ButtonTest {

    private Button button;

    public ButtonTest() {
        super();
        button = new Button();//这个可以当做我们在页面写了一个button元素
        button.setId("submitButton");//取submitButton为id
        button.setValue("提交");//提交按钮
        button.setOnclick(new ClickListener() {//我们给按钮注册点击监听器
            //按钮被点，我们就验证后提交
            public void click(ClickEvent clickEvent) {
                System.out.println("--------单击事件代码---------");
                System.out.println("if('表单合法'){");
                System.out.println("\t表单提交");
                System.out.println("}else{");
                System.out.println("\treturn false");
                System.out.println("}");
            }
        });
        button.setOnDbClick(new DbClickListener() {
            //双击的话我们提示用户不能双击“提交”按钮
            public void dbClick(DbClickEvent dbClickEvent) {
                System.out.println("--------双击事件代码---------");
                System.out.println("alert('您不能双击" + dbClickEvent.getButton().getValue() + "按钮')");
            }
        });
        button.setOnMouseMove(new MouseMoveListener() {
            //这个我们只简单提示用户鼠标当前位置，示例中加入这个事件
            //目的只是为了说明事件驱动中，可以包含一些特有的信息，比如坐标
            public void mouseMove(MouseMoveEvent mouseMoveEvent) {
                System.out.println("--------鼠标移动代码---------");
                System.out.println("alert('您当前鼠标的位置，x坐标为：" + mouseMoveEvent.getX() + "，y坐标为：" + mouseMoveEvent.getY() + "')");
            }
        });
    }

    public Button getButton() {
        return button;
    }

    public static void main(String[] args) {
        ButtonTest buttonTest = new ButtonTest();//客户访问了我们的这个JSP页面
        //以下客户开始在按钮上操作
        buttonTest.getButton().dbClick();//双击按钮
        buttonTest.getButton().mouseMove(10, 100);//移动到10，100
        buttonTest.getButton().mouseMove(15, 90);//又移动到15,90
        buttonTest.getButton().click();//接着客户点了提交
    }
}