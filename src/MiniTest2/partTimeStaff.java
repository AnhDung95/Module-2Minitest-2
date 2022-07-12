package MiniTest2;

public class partTimeStaff extends Staff {
    private double workingTime;

    public partTimeStaff(int staffCode, String name, int age, int phoneNumber, String email,double workingTime) {
        super(staffCode, name, age, phoneNumber, email);
        this.workingTime = workingTime;
    }

    public double getWorkingTime() {
        return workingTime;
    }

    public void setWorkingTime(double workingTime) {
        this.workingTime = workingTime;
    }
//    Tạo phương thức tính lương thực lĩnh
    public double getpartTimeSalary(){
        double netSalary2=this.workingTime*10000;
        return netSalary2;
    }
}
