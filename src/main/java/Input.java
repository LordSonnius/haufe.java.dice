import java.io.*;

public class Input {
    public static void main (String[] args) {
        byte eingabe[] = new byte[256];
        int anzahlBytesgelesen = -1;
        String eingelesenerText = "";
        try {
            anzahlBytesgelesen = System.in.read(eingabe);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if (anzahlBytesgelesen >0){
            eingelesenerText = new String(eingabe, 0, anzahlBytesgelesen);
        }
        System.out.println("Es wurden "+anzahlBytesgelesen+"Bytes gelesen");
        System.out.println("Folgender Text wurde eingegeben: "+eingelesenerText);
    }

}

