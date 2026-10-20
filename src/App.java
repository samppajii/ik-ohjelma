public class App {
    public static void main(String[] args) throws Exception {
        int ika = 30;   

// Tulostusehdot Nuorille  
        if (ika > 0 && ika < 18) { 
            System.out.println("Olet alaikäinen");

        }else if (ika >= 15 && ika < 18) { 
            System.out.println("Saat ajaa mopoa"); 

        } else if (ika >= 16 && ika < 18) { 
            System.out.println("Saat ajaa kevaria"); 

        } else if (ika == 18) {
            System.out.println("Tulit juuri täysi-ikäiseksi, ja saat ajaa autoa");


    //Tulostusehdot Eläkeläisille    
        } else if (ika == 58){
            System.out.println("Pääsisit varhais eläkkeelle");

        }else if (ika >= 65) { 
            System.out.println("Olet eläkeläinen"); 
            System.out.println("Hyvää eläkettä!");

        } else { 
            System.out.println("Olet aikuinen"); 
        } 

    // tää on vaan tämmönen speisseri
        System.out.println("");
    // Pyöreiden vuosien tarkistus
        if (ika == 20 || ika == 30 || ika == 40 || ika == 50 || ika ==60 || ika == 70 || ika == 80 || ika == 90) {
            System.out.println("Täytit myös pyöreitä vuosia");
        }else if (ika == 100){
            System.out.println("Kolmen");
            System.out.println("luvun");
            System.out.println("ikä");
        }
       
        if (ika >= 40 && ika <= 50) {
            System.out.println("Parasta keski-ikää");
        }
    }
}