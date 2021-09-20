package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InlineResponse2002
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-09-20T22:16:26.513Z[GMT]")


public class InlineResponse2002   {
  @JsonProperty("department_name")
  private String departmentName = null;

  @JsonProperty("average_salary")
  private Integer averageSalary = null;

  public InlineResponse2002 departmentName(String departmentName) {
    this.departmentName = departmentName;
    return this;
  }

  /**
   * Get departmentName
   * @return departmentName
   **/
  @Schema(description = "")
  
    public String getDepartmentName() {
    return departmentName;
  }

  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }

  public InlineResponse2002 averageSalary(Integer averageSalary) {
    this.averageSalary = averageSalary;
    return this;
  }

  /**
   * Get averageSalary
   * @return averageSalary
   **/
  @Schema(description = "")
  
    public Integer getAverageSalary() {
    return averageSalary;
  }

  public void setAverageSalary(Integer averageSalary) {
    this.averageSalary = averageSalary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002 inlineResponse2002 = (InlineResponse2002) o;
    return Objects.equals(this.departmentName, inlineResponse2002.departmentName) &&
        Objects.equals(this.averageSalary, inlineResponse2002.averageSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(departmentName, averageSalary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002 {\n");
    
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    averageSalary: ").append(toIndentedString(averageSalary)).append("\n");
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
