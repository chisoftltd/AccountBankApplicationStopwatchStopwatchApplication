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
public class Contact {
    private String name;
    private String number;
    
    public Contact(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String newname) {
        this.name = newname;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String newnumber) {
        this.number = newnumber;
    }
    
}
