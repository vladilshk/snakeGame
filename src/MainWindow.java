import javax.swing.*;

public class MainWindow extends JFrame {
    public MainWindow(){
        setTitle("Snake");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(368, 384);
        setLocation(500, 200);
        add(new GameField());
        setVisible(true);
    }



    public static void main(String[] args){
       MainWindow mw = new MainWindow();
    }
}