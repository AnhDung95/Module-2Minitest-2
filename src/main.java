import MiniTest2.Staff;
import MiniTest2.fullTimeStaff;
import MiniTest2.partTimeStaff;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Staff[] staffs = new Staff[3];
        staffs[0] = new fullTimeStaff(1, "Dũng", 28, 123457, "dung@gmail.com", 1000, 100, 10000);
        staffs[1] = new fullTimeStaff(2, "Hiền", 26, 123456, "hien@gmail.com", 1000, 500, 10000);
        staffs[2] = new partTimeStaff(3, "Nam", 26, 123444, "nam@gmail.com", 8);
//        System.out.println(avgSalary(staffs));
        double tb = avgSalary(staffs);
//        countSalary(staffs,tb);
        System.out.println("Tổng số nhân viên fulltime lương thấp hơn trung bình là: " + countSalary(staffs, tb));
    }

    //Tính lương trung bình
    public static double avgSalary(Staff staffs[]) {
        double sumSalary = 0;
        double avgSalary = 0;
        for (int i = 0; i < staffs.length; i++) {
            if (staffs[i] instanceof fullTimeStaff) {
                double salary1 = ((fullTimeStaff) staffs[i]).getfullTimeSalary();
                sumSalary += salary1;
            } else {
                if (staffs[i] instanceof partTimeStaff) {
                    double salary1 = ((partTimeStaff) staffs[i]).getpartTimeSalary();
                    sumSalary += salary1;
                }
            }
        }

        return avgSalary = sumSalary / staffs.length;
    }

    public static int countSalary(Staff array[], double trungBinh) {
        double salary2 = 0;
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] instanceof fullTimeStaff) {
                salary2 = ((fullTimeStaff) array[i]).getfullTimeSalary();
                if (salary2 < trungBinh) {
                    count++;

                }

            }

        }
        return count;
    }
//    tính số lương phải trả cho tất cả các nhân viên bán thời gian
    public static int payPartTimeStaff(Staff[] arr){
        int sum=0;
        for (Staff staff: arr) {
            if (staff instanceof partTimeStaff){
                sum+=((partTimeStaff) staff).getpartTimeSalary();
            }
        }
        return sum;
    }

}



