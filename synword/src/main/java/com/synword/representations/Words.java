package com.synword.representations;

public class Words {
    private final String Ankerword;
    private final String Syn1;
    private final String Syn2;
    private final String NoSyn1;
    private final String NoSyn2;
    private final String NoSyn3;
    private final String NoSyn4;

    public Words() {
        this.Ankerword = null;
        this.Syn1 = null;
        this.Syn2 = null;
        this.NoSyn1 = null;
        this.NoSyn2 = null;
        this.NoSyn3 = null;
        this.NoSyn4 = null;
    }

    public Words(String Ankerword, String Syn1,String Syn2, String NoSyn1, String NoSyn2, String NoSyn3, String NoSyn4) {
        this.Ankerword = Ankerword;
        this.Syn1 = Syn1;
        this.Syn2 = Syn2;
        this.NoSyn1 = NoSyn1;
        this.NoSyn2 = NoSyn2;
        this.NoSyn3 = NoSyn3;
        this.NoSyn4 = NoSyn4;
    }

    public String getAnkerword() {
        return Ankerword;
    }

    public String getSyn1() {
        return Syn1;
    }

    public String getSyn2() {
        return Syn2;
    }

    public String getNoSyn1() {
        return NoSyn1;
    }

    public String getNoSyn2() {
        return NoSyn2;
    }

    public String getNoSyn3() {
        return NoSyn3;
    }

    public String getNoSyn4() {
        return NoSyn4;
    }
}