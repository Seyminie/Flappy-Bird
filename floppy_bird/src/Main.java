import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Floppy Bird");//Creates the frame window
        //frame.setVisible(true);//Making the frame visible
        frame.setSize(boardWidth, boardHeight);//Setting the width and height of the window
        frame.setLocationRelativeTo(null);//Making the frame window locate in center
        frame.setResizable(false);//User cannot resize the frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//When user click on X it terminates

        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();//This is used to ignore the width of the title bar when the window is opened
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}