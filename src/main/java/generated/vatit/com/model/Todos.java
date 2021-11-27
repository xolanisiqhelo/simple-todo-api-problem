package generated.vatit.com.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import generated.vatit.com.model.Todo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Todos
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-11-28T00:51:35.936+02:00[Africa/Johannesburg]")

public class Todos   {
  @JsonProperty("todos")
  @Valid
  private List<Todo> todos = new ArrayList<>();

  public Todos todos(List<Todo> todos) {
    this.todos = todos;
    return this;
  }

  public Todos addTodosItem(Todo todosItem) {
    this.todos.add(todosItem);
    return this;
  }

  /**
   * Get todos
   * @return todos
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Todos todos = (Todos) o;
    return Objects.equals(this.todos, todos.todos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(todos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Todos {\n");
    
    sb.append("    todos: ").append(toIndentedString(todos)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

