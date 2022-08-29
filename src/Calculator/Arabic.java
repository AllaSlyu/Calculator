package Calculator;

class Arabic {

        byte chislo1, chislo2;
        String znak;

        Arabic(String a1, String znak1, String b1) {
            chislo1 = Byte.valueOf(a1);
            chislo2 = Byte.valueOf(b1);
            znak = znak1;
        }

        int rezultatDeistvii1;
        static int flagUslovija1 =0;


        void konechnii_itog(){
            if (chislo1 < 1 || chislo1 > 10 || chislo2 < 1 || chislo2 > 10) {
                flagUslovija1 = 0;
            } else {
                flagUslovija1 = 1;
            }
        }
        int itogMatDeistvii() {
            switch (znak) {
                case "+":
                    rezultatDeistvii1 = chislo1 + chislo2;
                    break;
                case "-":
                    rezultatDeistvii1 = chislo1 - chislo2;
                    break;
                case "*":
                    rezultatDeistvii1 = chislo1 * chislo2;
                    break;
                case "/":
                    rezultatDeistvii1 = chislo1 / chislo2;
                    break;

            }
            return rezultatDeistvii1;
        }

    }


