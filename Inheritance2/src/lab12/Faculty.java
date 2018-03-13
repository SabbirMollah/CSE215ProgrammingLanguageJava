/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

/**
 *
 * @author USER
 */
public class Faculty extends Employee {
    private String initial;
    private String rank;
    
    public Faculty(){};
    
    public Faculty(String initial, String rank) {
        this.initial = initial;
        this.rank = rank;
    }
    
    public Faculty(String name, String gender, int age, String id, String department, double salary, String initial, String rank) {
        super(name, gender, age, id, department, salary);
        this.initial = initial;
        this.rank = rank;
    }

    public String getInitial() {
        return initial;
    }

    public void setInitial(String initial) {
        this.initial = initial;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\nFaculty{" + "initial=" + initial + ", rank=" + rank + '}';
    }
    
    
    
    
}
