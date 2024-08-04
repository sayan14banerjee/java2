import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class FactorialApplet extends Applet implements ActionListener {
    TextField input;
    Button calculateButton;
    Label resultLabel;

    public void init() {
        // Set layout
        setLayout(new FlowLayout());

        // Create UI components
        input = new TextField(10);
        calculateButton = new Button("Calculate");
        resultLabel = new Label("Factorial: ");

        // Add components to the applet
        add(new Label("Enter a number: "));
        add(input);
        add(calculateButton);
        add(resultLabel);

        // Register event listener
        calculateButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        // Get the input from the text field
        String inputText = input.getText();
        try {
            // Parse input as an integer
            int number = Integer.parseInt(inputText);

            // Calculate factorial
            int factorial = calculateFactorial(number);

            // Display result
            resultLabel.setText("Factorial: " + factorial);
        } catch (NumberFormatException ex) {
            // Handle invalid input
            resultLabel.setText("Invalid number!");
        }
    }

    // Method to calculate factorial
    private int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
}

