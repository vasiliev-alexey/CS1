package com.av.domain;

import java.util.List;

/**
 * Created by vasil on 05.11.2015.
 */
public class R124 {

    private String s1;
    private String s2;

    private List<R124Item> lines;

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public List<R124Item> getLines() {
        return lines;
    }

    public void setLines(List<R124Item> lines) {
        this.lines = lines;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

private List<R124Item> r124ItemList;

    public List<R124Item> getR124ItemList() {
        return r124ItemList;
    }

    public void setR124ItemList(List<R124Item> r124ItemList) {
        this.r124ItemList = r124ItemList;
    }

    @Override
    public String toString() {
        return "R124{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", lines=" + lines +
                ", r124ItemList=" + r124ItemList +
                '}';
    }
}
