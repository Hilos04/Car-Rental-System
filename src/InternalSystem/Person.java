/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InternalSystem;

/**
 *
 * @author TOK ZUAN YOU
 */
public abstract class Person {
    private Name name;
    private String contactNo;
    private String ic;
    private char gender;
    private int age;
    private Address address;

    protected Person() {
    }

    protected Person(Name name, String contactNo, String ic, char gender, int age, Address address) {
        this.name = name;
        this.contactNo = contactNo;
        this.ic = ic;
        this.gender = gender;
        this.age = age;
        this.address = address;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String displayPersonInfo() {
        return "Person{" + "name=" + name + ", contactNo=" + contactNo + ", ic=" + ic + ", gender=" + gender + ", age=" + age + ", address=" + address + '}';
    }
    
    
}
