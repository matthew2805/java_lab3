public class task4{

    private String name;
    private int numberGroup;
    private int[] progress = new int[5];

    private task4(String name, int numberGroup, int[] progress) {
        this.name = name;
        this.numberGroup = numberGroup;
        this.progress = progress;
    }

    private static void showBest(task4[] listStudents) {
        for (task4 student : listStudents) {
            int flag = 0;
            for (int a : student.progress) {
                if (a !=10 & a !=4)
                {
                    flag++;
                }
            }
            if (flag == 0)
                System.out.println(student.name + "  " + student.numberGroup);
        }
    }

    public static void main(String[] args) {
        task4[] listStudent = {
                new task4("Ivanov", 11, new int[]{4, 4, 4, 4, 4}),
                new task4("Petrov", 11, new int[]{10, 10, 10, 10, 10}),
                new task4("Pytin", 12, new int[]{8, 8, 8, 8, 8}),
                new task4("Timaty", 13, new int[]{5, 10, 7, 6, 9}),
                new task4("Loiko", 11, new int[]{9, 10, 9, 9, 9}),
                new task4("Izov", 12, new int[]{8, 6, 7, 7, 10}),
                new task4("Kolosov", 13, new int[]{9, 10, 9, 9, 9})};
        showBest(listStudent);
    }
}
