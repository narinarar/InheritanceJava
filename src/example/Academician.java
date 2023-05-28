package example;

public class Academician extends Employee{
    private String department;
    private String title;


    public Academician(String nameLastName, String phoneNum, String eposta, String department, String title) {
        super(nameLastName, phoneNum, eposta);
        this.department = department;
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void attendClass() {
        System.out.println(this.getNameLastName() + " derse giriş yaptı");
    }
}
