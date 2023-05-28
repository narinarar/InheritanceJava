package example;

public class Employee {
    private String nameLastName;
    private String phoneNum;
    private String eposta;

    public Employee(String nameLastName, String phoneNum, String eposta) {
        this.nameLastName = nameLastName;
        this.phoneNum = phoneNum;
        this.eposta = eposta;
    }

    public String getNameLastName() {
        return nameLastName;
    }

    public void setNameLastName(String nameLastName) {
        this.nameLastName = nameLastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }

    public void start() {
        System.out.println(this.nameLastName + " üniversiteye giriş yaptı.");
    }

    public void finish() {
        System.out.println(this.nameLastName + " üniversiteden çıkış yaptı.");
    }

    public void refectory() {
        System.out.println(this.nameLastName + " yemekhaneye girdi");
    }
}
