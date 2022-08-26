package Calculator;

class Roman {
    Roman(String a, String znak, String b) {
        this.a = a;
        this.znak = znak;
        this.b = b;
    }
    String a, b;
    String znak;
    String c;
    String g = "";
    public static byte z = 0;
    String preobrazovanie1(String a1) {
        switch (a1) {
            case "I":
                c = "1";
                break;
            case "II":
                c = "2";
                break;
            case "III":
                c = "3";
                break;
            case "IV":
                c = "4";
                break;
            case "V":
                c = "5";
                break;
            case "VI":
                c = "6";
                break;
            case "VII":
                c = "7";
                break;
            case "VIII":
                c = "8";
                break;
            case "IX":
                c = "9";
                break;
            case "X":
                c = "10";
                break;
        }
        return c;

    }

    byte predrewenie() {
        String q = preobrazovanie1(a);
        String e = preobrazovanie1(b);
        if (Byte.valueOf(q)<0|| Byte.valueOf(q)>10|| Byte.valueOf(e)<0|| Byte.valueOf(e)>10){
            z=0;}
        else{z=1;
            }
        return z;
    }
    int rewenie() {
            Arabic arabic2 = new Arabic(preobrazovanie1(a), znak, preobrazovanie1(b));
            int f1 = arabic2.itog();
            return f1;
        }



    String preobrazovanie2( int f){

    while (f==100){
        g +="C";
        f -=100;}
    while (f>=90){
        g +="XC";
        f -=90;}
    while (f>=50){
        g +="L";
        f -=50;}
    while (f>=40){
        g +="XL";
        f -=40;}
    while (f>=10){
        g +="X";
        f -=10;}
    while (f>=9){
        g +="IX";
        f -=9;}
    while (f >= 5) {
        g += "V";
        f -= 5;
        }
    while (f >= 4) {
        g += "IV";
        f -= 4;
        }
    while (f >= 1) {
        g += "I";
        f -= 1;
        }
    return g;
}
}

