/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InternalSystem;

/**
 *
 * @author TOK ZUAN YOU
 */
public class Customer extends Person{

    public Customer() {
    }

    public Customer(Name name, String contactNo, String ic, char gender, int age, Address address) {
        super(name, contactNo, ic, gender, age, address);
    }
    
    @Override
    public String displayPersonInfo() {
        return super.displayPersonInfo();
    }
}
