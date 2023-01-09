package Chapter3;

/*3.17 (Computerization of Health Records) A health-care issue that has been in the news lately is
the computerization of health records. This possibility is being approached cautiously because of
sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
Computerizing health records could make it easier for patients to share their health profiles and
 histories among their various health-care professionals. This could improve the quality of health care,
help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person.
The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s age in years, maximum
heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
class HealthProfile for that person and prints the information from that object—including the person’s first name,
last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
the BMI values chart from Exercise 2.33*/

public class Health {
    private String firstName;
    private String lastName;
    private String gender;
    private int month;
    private int day;
    private int year;
    private double height;
    private double weight;

    public Health(String firstName, String lastName, String gender, int month, int day, int year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.height = height;
        this.weight = weight;
    }

    public void setFirstName(){
        this.firstName = firstName;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setGender(){
        this.gender = gender;
    }
    public String getGender(){
        return gender;
    }
    public void setMonth(int month){
        if (month > 12) throw new IllegalArgumentException("Month is out of range");
        this.month = month;
    }
    public int getMonth(){
        return month;
    }
   public void setDay(int day){
        if (day > 31) throw new IllegalArgumentException("Day is out of range");
        this.day = day;
   }
   public int getDay(){
        return day;
   }
   public void setYear(int year){
        this.year = year;
   }
   public int getYear(){
        return year;
   }
   public void setHeight(double height){
        this.height = height;
   }
   public double getHeight(){
        return height;
   }
   public void setWeight(double weight){
        this.weight = weight;
   }
   public double getWeight(){
        return weight;
   }
}
