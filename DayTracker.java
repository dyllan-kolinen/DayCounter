import java.awt.*;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
import javax.swing.*;

public class DayTracker {

    private static void createWindow() {
        // 1. Create and set up the window (JFrame)
        JFrame frame = new JFrame("Simple Swing GUI");
        // Ensure the application exits when the window is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Set the initial size of the frame
        frame.setSize(300, 400);
        
        // 2. Add a text label (JLabel) to the frame's content pane
        JLabel textLabel = new JLabel("Hello, World!", SwingConstants.CENTER);
        frame.getContentPane().add(textLabel, BorderLayout.CENTER);
        
        // 3. Display the window
        // pack() resizes the frame to fit its components, if setSize was not enough
        // frame.pack(); 
        // Make the window visible
        frame.setVisible(true);
    }

    private static void updateDays(int dayCompleted) throws FileNotFoundException {
        int daysLeft = 100;
        int dayToDo = 1;

        System.out.println("What day did you complete?");

        daysLeft -= dayCompleted;

        dayToDo = dayCompleted + 1;

        System.out.println("You've Completed: " + dayCompleted);

        System.out.println("You have: " + daysLeft);


        PrintStream out = new PrintStream("/Users/dyllankolinen/Desktop/daysleft.txt");
            
        out.println("You have " + daysLeft + " days left." + "\n" + "Do day " + dayToDo + " today.");
    }

    public static void main(String[] args) {
        
        createWindow();

        Scanner scanner = new Scanner(System.in);

        String completed = scanner.nextLine();

        int dayNumberCompleted = Integer.parseInt(completed);

        try {
            updateDays(dayNumberCompleted);
        } 
        catch (FileNotFoundException) {
            
        }
    }
}
