package MiniTest2;

public class fullTimeStaff extends Staff {
    private double salaryBonus;
    private double penaltyFee;
    private double hardSalary;


    public fullTimeStaff(int staffCode, String name, int age, int phoneNumber, String email, double salaryBonus, double penaltyFee,double hardSalary) {
        super(staffCode,name,age,phoneNumber,email);
        this.salaryBonus = salaryBonus;
        this.penaltyFee = penaltyFee;
        this.hardSalary = hardSalary;
    }

    public double getSalaryBonus() {
        return salaryBonus;
    }

    public void setSalaryBonus(double salaryBonus) {
        this.salaryBonus = salaryBonus;
    }

    public double getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(double penaltyFee) {
        this.penaltyFee = penaltyFee;
    }

    public double getSalary() {
        return hardSalary;
    }

    public void setHardSalary(double salary) {
        this.hardSalary = salary;
    }
//    Tạo phương thức tính lương thực lĩnh
    public double getfullTimeSalary(){
        double netSalary =this.hardSalary+ (this.salaryBonus-penaltyFee);
        return netSalary;
    }
}
