/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

/**
 *
 * @author Du
 */
public class Assessment {

    String assessmentTitle;
    int maxMarks;

    public Assessment(String title, int marks) {
        assessmentTitle = title;
        maxMarks = marks;
    }
    
    public void outputLessonDetails()
    {
        System.out.println("Title: "+assessmentTitle+" Max Marks: "+maxMarks);
    }
    
}
