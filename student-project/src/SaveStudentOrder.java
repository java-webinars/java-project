public class SaveStudentOrder
{
    public static void main(String[] args) {
        StudentOrder so;
        so = new StudentOrder();
        so.hFirstName = "Алексей";
        so.hLastName = "Петров";
        so.wFirstName = "Галина";
        so.wLastName = "Петрова";

        StudentOrder so1;
        so1 = new StudentOrder();
        so1.hFirstName = "Алексей";
        so1.hLastName = "Сидоров";
        so1.wFirstName = "Галина";
        so1.wLastName = "Сидорова";

        long ans = saveStudentOrder(so);
        System.out.println(ans);
        long ans1 = saveStudentOrder(so1);
        System.out.println(ans1);
    }

    static long saveStudentOrder(StudentOrder studentOrder) {
        long answer;
        answer = 199;
        System.out.println("saveStudentOrder:" + studentOrder.hLastName);

        return answer;
    }
}
