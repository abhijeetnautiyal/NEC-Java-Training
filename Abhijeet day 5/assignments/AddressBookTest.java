


import java.util.LinkedList;
import java.util.Scanner;




class Address{

    private String name;
    private int postalCode;
    private String city;
    private String country;
    
    public Address(String x, String y, String z, int a){
        name = x;
        city = y;
        country = z;
        postalCode = a;
    }
    
}

class Phone
{
    private int internationalAreaCode;
    private int prefix;
    private int number;
    
    public Phone(int x, int y, int z)
    {
        internationalAreaCode = x;
        prefix = y;
        number = z;
    }
    
}

class Contact{

    private String name;
    private String email;
    
    private Address postalAddrMain;
    private Address postalAddrAlternative;
    
    private Phone phoneMain;
    private Phone phoneAlternative;
    
    public Contact(String x, String y)
    {
        name = x;
        email = y;
    }
    
    public void setMainAddress(Address x)
    {
        postalAddrMain = x;
    }
    
    public void setAltAddress(Address x)
    {
        postalAddrAlternative = x;
    }
    
    public void setPhoneMain(Phone x)
    {
        phoneMain = x;
    }
    
    public void setPhoneAlt(Phone x)
    {
        phoneAlternative = x;
    }
    
    public String toString()
    {
        return name+"\n"+email;
    }
    
    public void addAddress(int x)
    {
        String addName, city ,country;
        int post;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your address details: ");
        
        System.out.println("Country:");
        country = sc.nextLine();
        
        System.out.println("City:");
        city = sc.nextLine();
        
        System.out.println("House No and Street");
        addName = sc.nextLine();
        
        System.out.println("Postal code:");
        post = sc.nextInt();
        
        Address tmp = new Address(addName, city, country, post);
        
        if(x==1) this.setMainAddress(tmp);
        else if(x==2) this.setAltAddress(tmp);
        
    }
    
    public void addPhone(int x)
    {
        
        int areaCode, prefix, phonNo;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Phone details");
        
        System.out.println("International area code:");
        areaCode = sc.nextInt();
        
        System.out.println("Prefix:");
        prefix = sc.nextInt();
        
        System.out.println("Phone no:");
        phonNo = sc.nextInt();
        
        Phone tmp = new Phone(areaCode, prefix, phonNo);
        if(x==1) this.setPhoneMain(tmp);
        else if(x==2) this.setPhoneAlt(tmp);
        
    }
    
    
}

class AddressBook{

    private String introduction="This is the Addressbook.";
    private LinkedList<Contact> contacts = new LinkedList<>();

    public AddressBook() {
        System.out.println(introduction);
    }
    
    
    
    
    
    public void addContact()
    {
        String name, email;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter your personal details: ");
        
        System.out.println("Name:");
        name = sc.nextLine();
        
        System.out.println("Email:");
        email = sc.nextLine();
        
        
        
        Contact tmp = new Contact(name,email);
        tmp.addAddress(1);
        //tmp.addAddress(2);
        tmp.addPhone(1);
        //tmp.addPhone(2);
        
        contacts.add(tmp);
        
    }
    
    
    public void print()
    {
        for(Contact c:contacts)
        {
            System.out.println(c);
        }
    }

}



public class AddressBookTest {
    
    public static void main(String[] args) {
    
        AddressBook nec = new AddressBook();
        nec.addContact();
        nec.print();
    }
    
    
}
