public class FitnessTracker {
    public final String name;
    public final Integer Birthyear;
    public final Integer Birthmonth;
    public final Integer Birthdate;
    public final String email;
    public final String phone;

    private String surName;
    private String pressure;
    private String colSteps;
    private int age;



    public FitnessTracker(String name, Integer birthyear, Integer birthmonth, Integer birthdate, String email, String phone, String surName, String pressure, String colSteps) {
        this.name = name;
        this.Birthyear = birthyear;
        this.Birthmonth = birthmonth;
        this.Birthdate = birthdate;
        this.email = email;
        this.phone = phone;
        this.surName = surName;
        this.pressure = pressure;
        this.colSteps = colSteps;
        this.age = 2022 - birthyear;
    }

    public String getName() {
        return name;
    }

    public Integer getBirthyear() {
        return Birthyear;
    }

    public Integer getBirthmonth() {
        return Birthmonth;
    }

    public Integer getBirthdate() {
        return Birthdate;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getSurName() {
        return surName;
    }

    public String getPressure() {
        return pressure;
    }

    public String getColSteps() {
        return colSteps;
    }

    public int getAge() {
        return age;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setColSteps(String colSteps) {
        this.colSteps = colSteps;
    }

    public void printAccountInfo(){
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "В перечне данных FitnessTracker сохранена информация о следующих пользователях:" +
                "name='" + name + '\'' +
                ", Birthyear='" + Birthyear + '\'' +
                ", Birthmonth='" + Birthmonth + '\'' +
                ", Birthdate='" + Birthdate + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", surName='" + surName + '\'' +
                ", pressure='" + pressure + '\'' +
                ", colSteps='" + colSteps + '\'' +
                ", age=" + age +
                '.';
    }

    public static void main(String[] args) {
        new FitnessTracker("Andrey",1992,3,26,"andrey@gmail.com","0631234567","Yakim","120/80","10_000").printAccountInfo();
        new FitnessTracker("Anastasia",1992,8,21,"nastya@gmail.com","09300011122","Luzhina","120/80","12_000").printAccountInfo();
        new FitnessTracker("Nikolay",1969,3,9,"kolya@gmail.com","0970000111","Dubin","120/80","5000").printAccountInfo();

        FitnessTracker elena =new FitnessTracker("Elena",1969,3,9,"kolya@gmail.com","0500000111","Dorogan","120/80","4000");
        elena.printAccountInfo();
        FitnessTracker boris = new FitnessTracker("Boris",2020,12,2,"boris@gmail.com","0630000111","Luzhina","120/80","8000");
        boris.printAccountInfo();

        System.out.println("");
        System.out.println("_____________ Обновляю данные по Борису и Елене _____________ ");
        System.out.println("");

        boris.surName= "Yakim";
        boris.pressure= "130/80";
        boris.colSteps= "14_000";
        boris.printAccountInfo();

        elena.surName = "Yakim";
        elena.pressure= "130/80";
        elena.colSteps= "8_000";
        elena.printAccountInfo();

    }
}
