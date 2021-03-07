import javax.swing.*;
import java.awt.*;

public class Orang {

    private int posX,posY;
    private int kesehatan;
    private Image objImage;


    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getKesehatan() {
        return kesehatan;
    }

    public Image getObjImage() {
        return objImage;
    }


    public Orang() {
        //inisialisasi
        posX = 0;
        posY = 0;
        kesehatan = 100;

        //load image
        //hati-hati salah nama file/direktori
        ImageIcon icon = new ImageIcon("src/hat-guy.png");
        objImage = icon.getImage();

    }

    public void kiri() {
        posX = posX - 5;
        kesehatan--;
    }

    public void kanan() {
        posX = posX + 5;
        kesehatan--;
    }

    public void atas() {
        posY = posY - 5;
        kesehatan--;
    }

    public void bawah() {
        posY = posY + 5;
        kesehatan--;
    }

}
