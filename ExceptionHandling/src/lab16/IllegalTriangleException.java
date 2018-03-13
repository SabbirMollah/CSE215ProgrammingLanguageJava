/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab16;

/**
 *
 * @author USER
 */
public class IllegalTriangleException extends Exception {
    private String message;
    public IllegalTriangleException(String message) {
        this.message = message;
    }
    public IllegalTriangleException(){}

    public String getMessage() {
        return message;
    }
}
