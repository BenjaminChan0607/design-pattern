package com.cs.stru.designpattern.behavior.observer.button;

/**
 * @author benjaminChan
 * @date 2018/12/10 0010 下午 4:40
 */
//我们模拟一个html页面的button元素，LZ只添加个别属性，其余属性同理
public class Button {

    private String id;//这相当于id属性
    private String value;//这相当于value属性
    private ClickListener onclick;//我们完全模拟原有的模型，这个其实相当于onclick属性
    private DbClickListener onDbClick;//同理，这个相当于双击属性
    private MouseMoveListener onMouseMove;//同理

    //按钮的单击行为
    public void click() {
        onclick.click(new ClickEvent(this));
    }

    //按钮的双击行为
    public void dbClick() {
        onDbClick.dbClick(new DbClickEvent(this));
    }

    //按钮的鼠标移动行为
    public void mouseMove(int x, int y) {
        onMouseMove.mouseMove(new MouseMoveEvent(this, x, y));
    }

    //相当于给id赋值
    public void setId(String id) {
        this.id = id;
    }

    //类似
    public void setValue(String value) {
        this.value = value;
    }

    //这个相当于我们在给onclick添加函数，即设置onclick属性
    public void setOnclick(ClickListener onclick) {
        this.onclick = onclick;
    }

    //同理
    public void setOnDbClick(DbClickListener onDbClick) {
        this.onDbClick = onDbClick;
    }

    //同理
    public void setOnMouseMove(MouseMoveListener onMouseMove) {
        this.onMouseMove = onMouseMove;
    }

    //以下get方法
    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public ClickListener getOnclick() {
        return onclick;
    }

    public DbClickListener getOnDbClick() {
        return onDbClick;
    }

    public MouseMoveListener getOnMouseMove() {
        return onMouseMove;
    }

}
