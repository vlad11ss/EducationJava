package DZ_Employe;

public class Employee {
    private static final int CURRENT_YEAR = 2021;

    private String surname;
    private String secondName;
    private String name;
    private String position;
    private String phone;
    private float salary;
    boolean isSalaryChanged;
    private int birthYear;
    private int uid;

    private static int id = 0;

    // 2.	Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String surname, String secondName, String name, String position, String phone, float salary, int birthYear) {
        this.surname = surname;
        this.secondName = secondName;
        this.name = name;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
        this.birthYear = birthYear;
        this.uid = ++id;


    }

    // 3.	Внутри класса «Сотрудник» написать методы, которые возвращают
    // значение каждого поля;
    public int getAge() {
        return CURRENT_YEAR - birthYear;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return (int) salary;
    }

    public void setSalary(float difference) {
        this.salary = this.salary + difference;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullInfo() {
        return this.uid + " " + this.name + " " +
                this.secondName + " " +
                this.surname + ", " +
                this.getAge() + "  лет " +
                this.position + " номер телефона " +
                this.phone + " зарплата " +
                this.getSalary() + " RU ";
    }


}


