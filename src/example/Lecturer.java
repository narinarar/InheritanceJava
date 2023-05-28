package example;

public class Lecturer extends Academician{

    private String doorNo;
    public Lecturer(String nameLastName, String phoneNum, String eposta, String department, String title, String doorNo) {
        super(nameLastName, phoneNum, eposta, department, title);
        this.doorNo = doorNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }
}
