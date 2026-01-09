import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    public User(){
        this.name = null;
        dob = LocalDate.now();
    }
    public User(String n, int year, int month, int day){
        this.name = n;
        dob = LocalDate.of(year,month,day);
    }

    public void displayInfo(){
        System.out.println(name+" was born on "+dob);
    }
}
