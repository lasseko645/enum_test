public class KatteLegetøj {



        String materiale = "Nothing";
        String farve = "Nothing";

        int alter = -100;

        String reklamationsRæt = "Nothing";



    KatteLegetøj(){
            System.out.println("this shit is fucking wrong");
        }


        KatteLegetøj(String materiale, String farve){

            System.out.println("dette stykke legetøj er lavet af " + materiale + " og er farven " + farve + ".");

        }

        KatteLegetøj(String farve){

            System.out.println("dette stykke legetøj er " + farve + "t." );

        }

        public static void piv(){
            System.out.println("legetøjet kan pive");
        }

        public static void rasle(){
            System.out.println("legetøjet kan rasle");
        }

        public int getAlter() {
            return alter;
        }

        public void setAlter(int alter) {
            this.alter = alter;
        }

        public String getReklamationsRæt() {
            return reklamationsRæt;
        }

        public void setReklamationsRæt(String reklamationsRæt) {
            this.reklamationsRæt = reklamationsRæt;
        }















}
