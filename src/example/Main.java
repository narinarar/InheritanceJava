package example;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new Employee("Narin Arar", "5012089090","xyz@gmail.com");
        Academician a1 = new Academician("Umut Arar","053566778", "nar@gmail.com", "Bilgisayar Mühendisliği", "Doçent");
        Officer o1 = new Officer("Tuğba Arar","5050505050","tugbasi@gmail.com","Memur","09.00-17.00");

        System.out.println(a1.getDepartment());
        a1.finish();
        a1.attendClass();


    }
}