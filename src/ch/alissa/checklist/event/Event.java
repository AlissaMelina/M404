package ch.alissa.checklist.event;

import java.io.Serializable;
import java.time.LocalDate;

public class Event implements Serializable
{

    private static final long serialVersionUID = 1L;

    private LocalDate date;
    private String task;

    public Event(LocalDate date, String task)
    {
        this.date = date;
        this.task = task;
    }

    public LocalDate getDate()
    {
        return date;
    }

    public String getTask()
    {
        return task;
    }

    @Override
    public String toString()
    {
        return "Bis: " + date + " " + task;
    }

}
