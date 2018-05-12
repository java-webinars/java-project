package edu.javacourse.studentorder;

import edu.javacourse.studentorder.domain.StudentOrder;

public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        StudentOrder so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Петров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Петрова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);

        return answer;
    }
}
