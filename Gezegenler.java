import java.util.Arrays;

public class Gezegenler {

    static String[] gezegenlerDizisi = {"Merkur", "Venus",  "Dunya", "Mars", "Jupiter", "Saturn", "Uranus", "Neptun"};
    static String s = Arrays.toString(gezegenlerDizisi);

    public static void siralama (){

        for (int i=0;i<gezegenlerDizisi.length;i++){

            System.out.println(gezegenlerDizisi[i]+" gezegeninin Gunese olan siralamasi : "+ (i+1));

        }
    }
    public static void guneseUzaklik (){

        for (int i=0;i<gezegenlerDizisi.length;i++){

            System.out.println(gezegenlerDizisi[i]+" gezegeninin Gunese olan uzakligi : "+ (i+10)+" km");

        }
    }
    public static void yaricap () {

        for (int i = 0; i < gezegenlerDizisi.length; i++) {

            switch (i) {

                case 0:
                    System.out.println(gezegenlerDizisi[0] + " yaricapi : " + 45 + " km");
                    break;

                case 1:
                    System.out.println(gezegenlerDizisi[1] + " yaricapi : " + 65 + " km");
                    break;

                case 2:
                    System.out.println(gezegenlerDizisi[2] + " yaricapi : " + 60 + " km");
                    break;

                case 3:
                    System.out.println(gezegenlerDizisi[3] + " yaricapi : " + 40 + " km");
                    break;

                case 4:
                    System.out.println(gezegenlerDizisi[4] + " yaricapi : " + 155 + " km");
                    break;

                case 5:
                    System.out.println(gezegenlerDizisi[5] + " yaricapi : " + 25 + " km");
                    break;

                case 6:
                    System.out.println(gezegenlerDizisi[6] + " yaricapi : " + 125 + " km");
                    break;

                case 7:
                    System.out.println(gezegenlerDizisi[7] + " yaricapi : " + 75 + " km");
                    break;

                case 8:
                    System.out.println(gezegenlerDizisi[8] + " yaricapi : " + 55 + " km");
                    break;
            }
        }
    }
        public static void donmeSuresi () {

            for (int i = 0; i < gezegenlerDizisi.length; i++) {

                switch (i) {

                    case 0:
                        System.out.println(gezegenlerDizisi[0] + " donme suresi : " + 45 + " saat");
                        break;

                    case 1:
                        System.out.println(gezegenlerDizisi[1] + " donme suresi : " + 65 + " saat");
                        break;

                    case 2:
                        System.out.println(gezegenlerDizisi[2] + " donme suresi : " + 60 + " saat");
                        break;

                    case 3:
                        System.out.println(gezegenlerDizisi[3] + " donme suresi : " + 40 + " saat");
                        break;

                    case 4:
                        System.out.println(gezegenlerDizisi[4] + " donme suresi : " + 155 + " saat");
                        break;

                    case 5:
                        System.out.println(gezegenlerDizisi[5] + " donme suresi : " + 25 + " saat");
                        break;

                    case 6:
                        System.out.println(gezegenlerDizisi[6] + " donme suresi : " + 125 + " saat");
                        break;

                    case 7:
                        System.out.println(gezegenlerDizisi[7] + " donme suresi : " + 75 + " saat");
                        break;

                    case 8:
                        System.out.println(gezegenlerDizisi[8] + " donme suresi : " + 55 + " saat");
                        break;
                }
            }
        }

        public static void main (String[]args){

            System.out.println("Gunes sisteminde varolan gezegenlerin listesi : "+s);
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            siralama();
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            guneseUzaklik();
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            yaricap();
            System.out.println("***********************************************");
            System.out.println("***********************************************");
            donmeSuresi();

        }
    }

