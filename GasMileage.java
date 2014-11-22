// Elijah Grubb
// CS1410
// August 29, 2014
// u0894728

package cs1410;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class GasMileage {

	public static void main(String[] args) {
		String c = JOptionPane.showInputDialog("What type of car are you driving?");
		String m = JOptionPane.showInputDialog("How many miles have you driven?");
		int miles = Integer.parseInt(m);		
		String p = JOptionPane.showInputDialog("What is the current price of gas (dollar ammount)?");
		double price = Double.parseDouble(p);
		String g = JOptionPane.showInputDialog("Number of gallons used:");
		double gallons = Double.parseDouble(g);
		double gasCost = price * gallons;
		double milesPerGallon = (miles / gallons);
		double gasCostPerMile = gasCost / miles;
		g = new DecimalFormat("#.##").format(gasCost);
		m = new DecimalFormat("#.##").format(milesPerGallon);
		p = new DecimalFormat("#.##").format(gasCostPerMile);
				
		JOptionPane.showMessageDialog(null, c + "\nGas Cost: $" + g + "\nMiles per Gallon: " + m + "\nGas cost per mile: $" + p);

	}

}
