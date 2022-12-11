import java.util.Scanner;

public class Main
{
    public static void getBalance(Customer[] array)
    {
        int j = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].getBalance() < 0)
            {
                System.out.println(array[i].getId() + " Surname: " + array[i].getSurname() + " Name: " + array[i].getName() + " Father's Name: " + array[i].getFathersName() + " Address: " + array[i].getAddress() + " Credit: " + array[i].getCredit() + " Balance: " + array[i].getBalance());
                j++;
            }
        }
        System.out.println("Кількість людей з заборгованістю: " + j);
    }
    public static void getCredit(Customer[] array)
    {
        System.out.println("Введіть діапазон кредитної карти (шестизначне число)");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].getCredit() > a && array[i].getCredit() < b)
            {
                System.out.println(array[i].getId() + " Surname: " + array[i].getSurname() + " Name: " + array[i].getName() + " Father's Name: " + array[i].getFathersName() + " Address: " + array[i].getAddress() + " Credit: " + array[i].getCredit() + " Balance: " + array[i].getBalance());
            }
        }

    }
    public static void getName(Customer[] array)
    {
        System.out.println("Введіть імʼя");
        Scanner sc = new Scanner(System.in);
        String newName = sc.nextLine();
        for (int i = 0; i < array.length; i++)
        {
            if (array[i].getName().equals(newName)) {
                System.out.println(array[i].getId() + " Surname: " + array[i].getSurname() + " Name: " + array[i].getName() + " Father's Name: " + array[i].getFathersName() + " Address: " + array[i].getAddress() + " Credit: " + array[i].getCredit() + " Balance: " + array[i].getBalance());
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Customer[] array = new Customer[5];
        array[0] = new Customer(1, "Konchak", "Vasyl", "Ivanovych", "Grenn 13", 749147, 15000);
        array[1] = new Customer(2, "Rudysh", "Ivan", "Andrievych", "Central 15", 750182, 17000);
        array[2] = new Customer(3, "Tsap", "Vasyl", "Andrievych", "Forest 23", 749366, -1000);
        array[3] = new Customer(4, "Soloha", "Max", "Vitalevich", "Sunny 11", 750981, 4000);
        array[4] = new Customer(5, "Klofa", "Roman", "Vasylevich", "Parking 17", 750501, -2000);
        System.out.println("a) список покупців, із вказаним іменем");
        System.out.println();
        getName(array);
        System.out.println();
        System.out.println("b) список покупців, у яких номер кредитної картки знаходиться в заданому інтервалі");
        System.out.println();
        getCredit(array);
        System.out.println();
        System.out.println("с) кількість та список покупців, які мають заборгованість (від’ємний баланс на карті)");
        System.out.println();
        getBalance(array);

    }
}