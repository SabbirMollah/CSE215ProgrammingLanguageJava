/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab13;

/**
 *
 * @author USER
 */
public class Herb extends Plant{
    private boolean isMedicinal;
    private String season;

    public Herb(String name, String color) {
        super(name, color);
    }
    
    public Herb(String name, String color, boolean isMedicinal, String season) {
        super(name, color);
        this.isMedicinal = isMedicinal;
        this.season = season;
    }
    
    public Herb() {
    }

    public boolean isIsMedicinal() {
        return isMedicinal;
    }

    public void setIsMedicinal(boolean isMedicinal) {
        this.isMedicinal = isMedicinal;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return super.toString()+"Herb{" + "isMedicinal=" + isMedicinal + ", season=" + season + '}';
    }
    
    
    
    
}
