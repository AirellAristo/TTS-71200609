package com.rplbo.utsnota;

import java.util.Locale;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public Operator(String operator){
        String kecil = operator.toLowerCase();
        this.operatorString = kecil;
    }

    public String getOperatorString() {
        return operatorString;
    }

    public String getOperatorSimbol() {
        //“kali”, “bagi”, “tambah”, “kurang”, dan “pangkat”
        if (operatorString.equals ("kali")){
            this.operatorSimbol = "*";
        }
        else if(operatorString.equals("bagi")){
           this.operatorSimbol = "/";
        }
        else if(operatorString.equals("tambah")){
            this.operatorSimbol = "+";
        }
        else if(operatorString.equals("kurang")){
            this.operatorSimbol ="-";
        }
        else if(operatorString.equals("pangkat")){
            this.operatorSimbol ="**";
        }

        return this.operatorSimbol;
    }
}
