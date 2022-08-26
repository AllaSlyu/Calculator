package Calculator;

class Arabic {

        byte chislo1, chislo2;
        String znak;

        Arabic(String a1, String znak1, String b1) {
            chislo1 = Byte.valueOf(a1);
            chislo2 = Byte.valueOf(b1);
            znak = znak1;
        }

        int c;
        public static int d=0;


        void konechnii_itog(){
            if (chislo1 < 1 || chislo1 > 10 || chislo2 < 1 || chislo2 > 10) {
                d = 0;
            } else {
                d = 1;
            }
        }
        int itog() {
            switch (znak) {
                case "+":
                    c = chislo1 + chislo2;
                    break;
                case "-":
                    c = chislo1 - chislo2;
                    break;
                case "*":
                    c = chislo1 * chislo2;
                    break;
                case "/":
                    c = chislo1 / chislo2;
                    break;

            }
            return c;
        }

    }


