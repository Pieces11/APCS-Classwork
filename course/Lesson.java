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
public class Lesson {

    String lessonTitle;
    int durationMinute;
    boolean requiresLab;

    public Lesson(String title, int duration, boolean lab) {
        lessonTitle = title;
        durationMinute = duration;
        requiresLab = lab;
    }
    
    public void OutputLessonDetails()
    {}
}
