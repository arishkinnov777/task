public class Main {
    public static void main(String[] args) {

        CurriculumSubject subject = new CurriculumSubject("Системное программирование","Киселев И.Д.", 156, 3);

        System.out.println("Дисциплина: " + subject.getName());
        System.out.println("ФИО преподователя: " + subject.getTeacheName());
        System.out.println("Общее количество часов: " + subject.getTotalHours());
        System.out.println("Количество контрольных точек: " + subject.getControlPoints());
    }
}
