package vatit.com.model;

public class Todo {

	private String id;
	private String name;
	private Boolean completed;

	public Todo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Todo(String id, String name, Boolean completed) {
		super();
		this.id = id;
		this.name = name;
		this.completed = completed;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

}
