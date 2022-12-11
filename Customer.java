public class Customer
{
    private int id; // id customer
    private String surname; // прізвище
    private String name; // імʼя
    private String fathersName; // по-батькові
    private String address; // адреса
    private int credit; // кредитна карта
    private int balance; // кількість грошей
    Customer(int id, String surname, String name, String fathersName, String address, int credit, int balance)
    {
        this.id = id;
        this.surname = surname;
        this.name = name;
        this.fathersName = fathersName;
        this.address = address;
        this.credit = credit;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public int getCredit() {
        return credit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

}
