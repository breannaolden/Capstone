package model;

import javafx.collections.ObservableList;

public class Customer {

    private int customerID;
    private String customerName;
    private String address;
    private String zipCode;
    private String country;
    private String phone;
    private String customerDivision;
    private int divisionID;
    private String customerCountry;

    /*
     * -------------------------
     * BEGIN GETTERS AND SETTERS
     * -------------------------
     */

    /**
     *
     * @return Getter for customer ID
     *
     */
    public int getCustomerID() {
        return customerID;
    }

    /***
     *
     * @param customerID Setter for customer ID
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /***
     *
     * @return Getter for name
     */
    public String getCustomerName() {
        return customerName;
    }

    /***
     *
     * @param customerName Setter for name
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    /***
     *
     * @return getter for address
     */
    public String getAddress() {
        return address;
    }

    /***
     *
     * @param address setter for address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /***
     *
     * @return getter for zipcode
     */
    public String getZipCode() {
        return zipCode;
    }

    /***
     *
     * @param zipCode setter for zipcode
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /***
     *
     * @return getter for country
     */
    public String getCountry() {
        return country;
    }

    /***
     *
     * @param country setter for country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /***
     *
     * @return getter for  phone
     */
    public String getPhone() {
        return phone;
    }

    /***
     *
     * @param phone setter for phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /***
     *
     * @return getter for customer division
     */
    public String getCustomerDivision() {
        return customerDivision;
    }

    /***
     *
     * @param customerDivision setter for customer division
     */
    public void setCustomerDivision(String customerDivision) {
        this.customerDivision = customerDivision;
    }

    /***
     *
     * @return getter for customer division ID
     */
    public int getDivisionID() {
        return divisionID;
    }

    /***
     *
     * @param divisionID setter for customer division ID
     */
    public void setDivisionID(int divisionID) {
        this.divisionID = divisionID;
    }

    /***
     *
     * @return getter for customer country
     */
    public String getCustomerCountry() {
        return customerCountry;
    }

    /***
     *
     * @param customerCountry setter for customer country
     */
    public void setCustomerCountry(String customerCountry) {
        this.customerCountry = customerCountry;
    }
    /*
     * -------------------------
     * END GETTERS AND SETTERS
     * -------------------------
     */

    /*
     * -------------------------
     * BEGIN FUNCTIONALITY
     * -------------------------
     */

    /***
     * Private - Creates observable list with all customers
     */
    private static ObservableList<Customer> customers = CustomerDatabase.getAllCustomers();

    /**
     * Public - creates observable list with all customers
     * @return all customers listed
     *
     */
    public static ObservableList<Customer> getAllCustomers() {
        return customers;
    }

    /**
     *
     * Constructor for customer
     * @param customerID customerID
     * @param customerName name
     * @param address address
     * @param zipCode zipcode
     * @param phone phone
     * @param customerDivision customerDivision
     * @param customerCountry customerCountry
     */
    public Customer(int customerID, String customerName, String address, String zipCode, String phone, String customerDivision, int divisionID, String customerCountry) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.address = address;
        this.zipCode = zipCode;
        this.phone = phone;
        this.divisionID = divisionID;
        this.customerDivision = customerDivision;
        this.customerCountry = customerCountry;
    }

    /**
     *
     * @param newCustomer add new customer
     */
    public static void addCustomers(Customer newCustomer) {
        customers.add(newCustomer);
    }

    /**
     * Used to modify existing customers
     * @param i index of the chosen customer
     * @param customer new customer info
     */
    public static void modifyCustomer(int i, Customer customer) {
        customers.set(i, customer);
    }

    /**
     *
     * @param selectedCustomer deletes this customer from database
     */
    public static void removeCustomer(Customer selectedCustomer) {
        customers.remove(selectedCustomer);
    }




}