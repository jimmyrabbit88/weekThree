import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class MyFlicks {
    public static Film[] myFilms = new Film[10];
    public static void main(String[] args) {
        addFilm();
        displayFilms();
    }

    public static void addFilm(){
        String title = "", director = "";
        int i = 0;
        int duration = 0;
        int choice = 0;
        do{
            choice = JOptionPane.showConfirmDialog(null, "Enter a film", "Enter Film", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (choice == 0) {
                title = JOptionPane.showInputDialog(null, "Please enter title of the film");
                director = JOptionPane.showInputDialog(null, "Please enter director of the film");
                duration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter duration of the film"));
                Film film = new Film(title, director, duration);
                myFilms[i] = film;
                i++;
            }

        }while (choice==0);
    }

    public static void displayFilms(){
        JTextArea jta = new JTextArea();
        Font font = new Font("monospaced", Font.PLAIN, 12);
        jta.setFont(font);
        for(int i = 0;myFilms[i] != null; i++){
            Film film;
            if(myFilms[i] != null) {
                film = myFilms[i];
                System.out.println(i);
                System.out.println(film.toString());
                jta.append(film.toString());
            }
            //System.out.println("loop\n");

        }
        JOptionPane.showMessageDialog(null, jta);
    }
}


