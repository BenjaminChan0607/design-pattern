package com.cs.stru.designpattern.structural.bridge;

/**
 * Created by benjaminChan on 2018/7/10 0010 下午 7:28.
 */
public abstract class Bridge {

    private Skills skills;
    private Appearance appearance;

    public Bridge() {

    }

    public Bridge(Skills skills) {
        this.skills = skills;
    }

    public Bridge(Appearance appearance) {
        this.appearance = appearance;
    }

    public Bridge(Skills skills, Appearance appearance) {
        this.skills = skills;
        this.appearance = appearance;
    }

    public void releaseSkills() {
        skills.releaseSkills();
    }

    public void show() {
        appearance.show();
    }

    public abstract void doAllLikePeople();

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public Appearance getAppearance() {
        return appearance;
    }

    public void setAppearance(Appearance appearance) {
        this.appearance = appearance;
    }
}
