package planilla;

public class gradeBook {

    private String courseName;

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public gradeBook(String name) {
        // TODO Auto-generated constructor stub
        courseName = name;
    }

    public String displayMessage() {
        return "Bienvenido al sistema de planillas del curso" + getCourseName();
    }



}
