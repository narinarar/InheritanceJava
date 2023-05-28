package example;

public class Officer extends Employee{
    private String officerDepartment;
    private String shift;

    public Officer(String nameLastName, String phoneNum, String eposta, String officerDepartment, String shift) {
        super(nameLastName, phoneNum, eposta);
        this.officerDepartment = officerDepartment;
        this.shift = shift;
    }

    public String getOfficerDepartment() {
        return officerDepartment;
    }

    public void setOfficerDepartment(String officerDepartment) {
        this.officerDepartment = officerDepartment;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public void work() {
        System.out.println(this.getNameLastName() + " memur görevlerini yapıyor.");
    }
}
