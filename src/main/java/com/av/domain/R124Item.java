package com.av.domain;

/**
 * Created by vasil on 05.11.2015.
 */
public class R124Item {

private String ppp;
private String kosgu;
private Long data001;

    public String getPpp() {
        return ppp;
    }

    public void setPpp(String ppp) {
        this.ppp = ppp;
    }

    public String getKosgu() {
        return kosgu;
    }

    public void setKosgu(String kosgu) {
        this.kosgu = kosgu;
    }


    public Long getData001() {
        return data001;
    }

    public void setData001(Long data001) {
        this.data001 = data001;
    }

    @Override
    public String toString() {
        return "R124Item{" +
                "ppp='" + ppp + '\'' +
                ", kosgu='" + kosgu + '\'' +
                ", data001=" + data001 +
                '}';
    }
}
