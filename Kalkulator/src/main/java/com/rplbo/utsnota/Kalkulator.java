package com.rplbo.utsnota;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString b1 ,BilanganString b2 ,Operator op){
        this.bil1 = b1.getBilangan();
        this.bil2 = b2.getBilangan();
        this.op = op.getOperatorSimbol();
    }

    public void hitung(){
        if (op == "*"){
            System.out.println ("Hasil:" + (bil1 * bil2));
        }
        else if (op == "/"){
            System.out.println ("Hasil:" +(bil1 / bil2));
        }
        else if (op == "+"){
            System.out.println ("Hasil:" + (bil1 + bil2));
        }
        else if (op == "-"){
            System.out.println ("Hasil:" + (bil1 - bil2));
        }
        else if (op == "**"){
            System.out.println ("Hasil:" + (Math.pow(bil1,bil2)));
        }
    }
}
