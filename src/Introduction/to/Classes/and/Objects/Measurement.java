/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Introduction.to.Classes.and.Objects;

/**
 *
 * @author 1609963
 */
public class Measurement {

    private String unit;
    private double value;
    private boolean status;

    public Measurement(String unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getValue() + " and " + getUnit();
    }

    public boolean hasSameUnit(Measurement m) {
        
        if (unit == m.unit) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}
