/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package car.rental.system;

/**
 *
 * @author TOK ZUAN YOU
 */
public class Registration {
    private int rentalNo;
    private int nextRentNo = 1001;

    //Constructor

    public Registration() {
    }
    
    public Registration(int rentalNo) {
        this.rentalNo = nextRentNo;
        nextRentNo++;
    }

    public int getRentalNo() {
        return rentalNo;
    }
    
    public String toString(){
        return String.format("%-6s\n", rentalNo);
    }    
}


