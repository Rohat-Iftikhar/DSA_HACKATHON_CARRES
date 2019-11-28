import java.util.*;
class Car_Record{
    List<String> l=new ArrayList<String>();
    List<String> c1=new ArrayList<String>(Arrays.asList("2017","2018","2019"));
    List<String> c2=new ArrayList<String>(Arrays.asList("2011","2015","2019"));
    List<String> c3=new ArrayList<String>(Arrays.asList("2015","2017","2018"));
    
    public void carCollection(){
        l.add("BMW");
        l.add("Ferarri");
        l.add("Lamborghni");
    }
    
    public void carsAvailable(String type){
        if(type.equals(l.contains("BMW"))){
            System.out.println("Models Available: ");
            System.out.println(c1);
        }

        else if(type.equals(l.contains("Ferarri"))){
            System.out.println("Models Available: ");
            System.out.println(c2);
        }

        else if(type.equals(l.contains("Lamborghni"))){
            System.out.println("Models Available: ");
            System.out.println(c3);
        }
    }
    
    public void carPrices(String model){
        //BMW
        if(model.equals(c1.contains("2017"))){
            System.out.println("Price: 81.8 Lakh");
        }

        else if(model.equals(c1.contains("2018"))){
            System.out.println("Price: 3.5 Cr");
        }

        else if(model.equals(c1.contains("2019"))){
            System.out.println("Price: 5.2 Cr");
        }
        
        //Ferarri
        else if(model.equals(c2.contains("2011"))){
            System.out.println("Price: 4.4 Cr");
        }

        else if(model.equals(c2.contains("2015"))){
            System.out.println("Price: 4.5 Cr");
        }

        else if(model.equals(c2.contains("2019"))){
            System.out.println("Price: 1.2 Cr");
        }
        
        //Lamborghni
        else if(model.equals(c3.contains("2015"))){
            System.out.println("Price: 1.8 Cr");
        }

        else if(model.equals(c3.contains("2017"))){
            System.out.println("Price: 2.2 Cr");
        }

        else if(model.equals(c3.contains("2018"))){
            System.out.println("Price: 3.6 Cr");
        }
    }
}

class Reservation{
    String fName;
    String lName;
    String email;
    String address;
    char gender;
    int contact;
    
    public Reservation(String fName, String lName, String email, String address, char gender, int contact){
        this.fName=fName;
        this.lName=lName;
        this.email=email;
        this.address=address;
        this.gender=gender;
        this.contact=contact;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getContact() {
        return contact;
    }

    public void setContact(int contact) {
        this.contact = contact;
    }

    public String toString() {
        return "Reservation{" + "First Name=" + fName + ", Last Name=" + lName + ", Email=" + email + ", Address=" + address + ", Gender=" + gender + ", Contact No.=" + contact + "}";
    }
}


public class DSA_HACKATHON_CARRES {
    public static void main(String[] args) {
        //Car_Record obj= new Car_Record
        //Cars record
        //Customer record
        //Priority based on the payment done full
        //Rent a car
        //Ded - Searching what cars are available. - will be added in cars record.
        //Reservations
        //Transaction
        
    }    
}
