package com.springinaction.events;

import org.springframework.context.ApplicationEvent;

public class CourseFullEvent extends ApplicationEvent {

    private Course course;

    public CourseFullEvent(Object source, Course course) {
        super(source);
        this.course = course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
