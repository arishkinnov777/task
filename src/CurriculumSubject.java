public class CurriculumSubject {

    private String name;
    private String teacheName;
    private int totalHours;
    private int controlPoints;

    public CurriculumSubject(String name, String teacheName, int totalHours, int controlPoints) {
        this.name = name;
        this.teacheName = teacheName;
        this.totalHours = totalHours;
        this.controlPoints = controlPoints;
    }

    public String getName() {
        return name;
    }

    public String getTeacheName() {
        return teacheName;
    }

    public int getTotalHours() {
        return totalHours;
    }

    public int getControlPoints() {
        return controlPoints;
    }
}
