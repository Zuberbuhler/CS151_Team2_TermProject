package application;

public class Task 
{
	// Declarations
	private String taskName; // Name of the task
	private String course; // Course that the task is attached to
	private String dueDate; // Date the task needs to be done by
	private int priority; // The priority of the task
	private boolean completed; // Whether the task has been completed or not
	
	public Task(String taskName, String dueDate, String course)
	{
		this.taskName = taskName;
		this.dueDate = dueDate;
		this.course = course;
	}
	
	// Returns task name
	public String getTaskName()
	{
		return taskName;
	}
	
	// Returns due date
	public String getDueDate()
	{
		return dueDate;
	}
	
	// Returns course name
	public String getCourse()
	{
		return course;
	}
	
	// Sets complete boolean to true
	public void markAsComplete()
	{
		completed = true;
	}	
	public boolean getCompletedStatus() {
		return completed;
	}
	
}
