package com.rplbo.utsnota;


public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public BilanganString(String huruf) {
        this.bilanganstring = huruf;
    }

    public int getBilangan() {
        String sAngka = "";
        String kecil = bilanganstring.toLowerCase();
        String[] splited = kecil.split("\\s+");
        if ((!kecil.contains("belas"))){
            if (splited[0].equals("satu")) {
                sAngka += "1";
            } else if (splited[0].equals("dua")) {
                sAngka += "2";
            } else if (splited[0].equals("tiga")) {
                sAngka += "3";
            } else if (splited[0].equals("empat")) {
                sAngka += "4";
            } else if (splited[0].equals("lima")) {
                sAngka += "5";
            } else if (splited[0].equals("enam")) {
                sAngka += "6";
            } else if (splited[0].equals("tujuh")) {
                sAngka += "7";
            } else if (splited[0].equals("delapan")) {
                sAngka += "8";
            } else if (splited[0].equals("sembilan")) {
                sAngka += "9";
            } else if (splited[0].equals("nol")) {
                sAngka += "0";}
        }
        else if (splited[0].equals("sebelas")) {
            sAngka += "11";
        }
        else if (splited[0].equals("dua") && splited[1].equals("puluh")) {
            sAngka += "20";
        }
        else{
            if (splited[1].equals("belas")) {
                sAngka += "1";
                if (splited[0].equals("satu")) {
                    sAngka += "1";
                } else if (splited[0].equals("dua")) {
                    sAngka += "2";
                } else if (splited[0].equals("tiga")) {
                    sAngka += "3";
                } else if (splited[0].equals("empat")) {
                    sAngka += "4";
                } else if (splited[0].equals("lima")) {
                    sAngka += "5";
                } else if (splited[0].equals("enam")) {
                    sAngka += "6";
                } else if (splited[0].equals("tujuh")) {
                    sAngka += "7";
                } else if (splited[0].equals("delapan")) {
                    sAngka += "8";
                } else if (splited[0].equals("sembilan")) {
                    sAngka += "9";
                } else if (splited[0].equals("nol")) {
                    sAngka += "0";}
            }
        }
        this.bilangan = Integer.parseInt(sAngka);
        return this.bilangan;
    }

    public boolean apakahDuaDigit() {
        getBilangan();
        if (bilangan >= 10 && bilangan <= 99) {
            return true;
        } else {
            return false;
        }
    }

    public boolean apakahLebihDari10() {
        getBilangan();
        if (bilangan > 10) {
            return true;
        } else {
            return false;
        }
    }
}

