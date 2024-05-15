/**
 * A class showing instance variables.
 *
 * @author Carlos Limão.
 * @version April 8 2024
 */
package instanceVariables;

public class Student {
    // The "name"  instance variable is visible from any class outside.
    public String name;

    // The "grade" instance variable is visible in this class only.
    private double grade;

    /**
     * grade "getter"
     *
     * By convention the name should be "getInstanceVarName".
     *
     * @return the "grade" instance variable.
     */
    double getGrade() {
        return grade;
    }

    /**
     * grade "setter"
     *
     * By convention the name shoud be "setInstanceVarName".
     *
     * @param grade The grade to assign to this user
     * @apiNote This setter validates the specified grade to make sure it's impossible to assign an invalid grade.
     */
    void setGrade(double grade) {
        if (grade >= 0 && grade <= 20) {
            this.grade = grade;
        }
    }
}
