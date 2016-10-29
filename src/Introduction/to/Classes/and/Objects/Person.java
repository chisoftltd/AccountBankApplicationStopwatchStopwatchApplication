package Introduction.to.Classes.and.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1609963
 */
public class Person {

    private String name;
    private int birthyear;

    public Person(String n, int y) {
        this.name = n;
        this.birthyear = y;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String n) {
        this.name = n;
    }
//

    public int getYear() {
        return this.birthyear;
    }
//

    public int getAge(int now) {
        return (now - this.birthyear);
    }
//

    public String toString() {
        return (this.name + " was born in " + this.getYear());
    }

}
