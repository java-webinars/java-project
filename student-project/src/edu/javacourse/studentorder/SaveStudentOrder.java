package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.sethFirstName("Алексей");
        so.sethLastName("Петров");
        so.setwFirstName("Галина");
        so.setwLastName("Петрова");

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.gethLastName());

        return answer;
    }
}
