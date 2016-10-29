/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.to.Classes.and.Objects;

import javax.swing.JOptionPane;

/**
 *
 * @author 1609963
 */
public class MeasurementMain {

    private static String unit;
    private static double value;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Measurement measurement = new Measurement("meter", 125.67);

        System.out.println(" Measurement unit : " + measurement.getUnit());
        System.out.println(" Measurement value : " + measurement.getValue());
        System.out.println(" Measurement string : " + measurement.toString());
        System.out.println(" Measurement : " + measurement.hasSameUnit(measurement));

        Measurement measurement2 = new Measurement("feet", 200.532);

        System.out.println(" Measurement unit : " + measurement2.getUnit());
        System.out.println(" Measurement value : " + measurement2.getValue());
        System.out.println(" Measurement string : " + measurement2.toString());
        System.out.println(" Measurement : " + measurement2.hasSameUnit(measurement));

        unit = JOptionPane.showInputDialog("Enter Unit : ");
        value = Double.parseDouble(JOptionPane.showInputDialog("Enter value:"));
        Measurement measurement3 = new Measurement(unit, value);

        System.out.println(" Measurement unit : " + measurement3.getUnit());
        System.out.println(" Measurement value : " + measurement3.getValue());
        System.out.println(" Measurement string : " + measurement3.toString());
        System.out.println(" Measurement : " + measurement2.hasSameUnit(measurement3));

        Measurement[] myMeasurement = new Measurement[5];
        for (int i = 0; i < 5; i++) {
            unit = JOptionPane.showInputDialog("Enter Unit : ");
            value = Double.parseDouble(JOptionPane.showInputDialog("Enter value:"));
            myMeasurement[i] = new Measurement(unit, value);
        }

        for (Measurement measurement1 : myMeasurement) {
            System.out.println(" Measurement unit : " + measurement1.getUnit());
            System.out.println(" Measurement value : " + measurement1.getValue());
            System.out.println(" Measurement string : " + measurement1.toString());
            System.out.println(" Measurement : " + measurement1.hasSameUnit(measurement3));
        }
        
        for (int i = 0; i < 5; i++) {
           System.out.println(" Measurement unit : " + myMeasurement[i].getUnit());
            System.out.println(" Measurement value : " + myMeasurement[i].getValue());
            System.out.println(" Measurement string : " + myMeasurement[i].toString());
            System.out.println(" Measurement : " 
                    + myMeasurement[(int)(Math.random() * 1)].hasSameUnit(myMeasurement[(int)(Math.random() * 1)]));
         
        }
    }

}
