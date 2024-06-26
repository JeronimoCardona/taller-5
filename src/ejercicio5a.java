import java.util.Scanner;
public class ejercicio5a {
}

class DrumKit {// aqui esta el codigo ordenado

    boolean topHat = true;
    boolean snare = true;

    void playSnare (){
        System.out.println("bang bang ba-bang");
    }
    void playTopHat (){
        System.out.println("ding ding da-ding");
    }
}
class DrumKitTestDrive
{
    public static void main(String[] args) {
        DrumKit d = new DrumKit();
        d.snare = false;
        d.playSnare();
        d.playTopHat();

        if (d.snare == true){
            d.playSnare();
        }

    }
}