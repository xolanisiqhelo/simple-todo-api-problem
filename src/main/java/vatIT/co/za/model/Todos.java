package vatIT.co.za.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="todos")
public class Todos {
	
	@Column(name = "todos_id")
	@Id
	private String id;
	private String name;
	private boolean completed;
	
}
