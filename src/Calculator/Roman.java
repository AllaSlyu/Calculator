package Calculator;

class Roman {
    Roman(String a, String znak, String b) {
        this.a = a;
        this.znak = znak;
        this.b = b;
    }
    String a, b;
    String znak;
    String izRomVArab;
    String rezultatDeistvii2 = "";
    static byte flagUslovija2 = 0;
    String preobrazovanieIzRomVArab(String a1) {
        switch (a1) {
            case "I":
                izRomVArab = "1";
                break;
            case "II":
                izRomVArab = "2";
                break;
            case "III":
                izRomVArab = "3";
                break;
            case "IV":
                izRomVArab = "4";
                break;
            case "V":
                izRomVArab = "5";
                break;
            case "VI":
                izRomVArab = "6";
                break;
            case "VII":
                izRomVArab = "7";
                break;
            case "VIII":
                izRomVArab = "8";
                break;
            case "IX":
                izRomVArab = "9";
                break;
            case "X":
                izRomVArab = "10";
                break;
        }
        return izRomVArab;

    }

    byte predrewenie() {
        String q = preobrazovanieIzRomVArab(a);
        String e = preobrazovanieIzRomVArab(b);
        if (Byte.valueOf(q)<0|| Byte.valueOf(q)>10|| Byte.valueOf(e)<0|| Byte.valueOf(e)>10){
            flagUslovija2 =0;}
        else{
            flagUslovija2 =1;
            }
        return flagUslovija2;
    }
    int rewenie() {
            Arabic arabic2 = new Arabic(preobrazovanieIzRomVArab(a), znak, preobrazovanieIzRomVArab(b));
            int f1 = arabic2.itogMatDeistvii();
            return f1;
        }



    String preobrazovanieIzArabVRom(int f){

    while (f==100){
        rezultatDeistvii2 +="C";
        f -=100;}
    while (f>=90){
        rezultatDeistvii2 +="XC";
        f -=90;}
    while (f>=50){
        rezultatDeistvii2 +="L";
        f -=50;}
    while (f>=40){
        rezultatDeistvii2 +="XL";
        f -=40;}
    while (f>=10){
        rezultatDeistvii2 +="X";
        f -=10;}
    while (f>=9){
        rezultatDeistvii2 +="IX";
        f -=9;}
    while (f >= 5) {
        rezultatDeistvii2 += "V";
        f -= 5;
        }
    while (f >= 4) {
        rezultatDeistvii2 += "IV";
        f -= 4;
        }
    while (f >= 1) {
        rezultatDeistvii2 += "I";
        f -= 1;
        }
    return rezultatDeistvii2;
}
}

