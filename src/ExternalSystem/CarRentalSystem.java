/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ExternalSystem;

import java.util.Scanner;
import InternalSystem.*;

/**
 *
 * @author William
 */
public class CarRentalSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        
    }
    
    
        // Customer Information Input
        public void customerMenu(){
            
            Scanner sc = new Scanner(System.in);
            
            // Customer Class declaration
            Name name = new Name();
            Address addr = new Address();
            Customer cust = new Customer();
            
            // System display Info request
            System.out.println("Please Enter Your First Name: ");
            name.setFirstName(sc.nextLine());
            System.out.println("Please Enter Your Last Name: ");
            name.setLastName(sc.nextLine());
            System.out.println("Please Enter contact No: ");
            cust.setContactNo(sc.nextLine());
            System.out.println("Please Enter Your IC: ");
            cust.setIc(sc.nextLine());
            System.out.println("Please Enter Your Gender(M/N): ");
            System.out.println("");
        
        }
}
