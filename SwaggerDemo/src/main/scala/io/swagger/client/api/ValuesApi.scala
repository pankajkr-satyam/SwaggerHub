/**
 * NOTE: This class is auto generated by the akka-scala (beta) swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * For any issue or feedback, please open a ticket via https://github.com/swagger-api/swagger-codegen/issues/new
 */
package io.swagger.client.api

import io.swagger.client.model.Employee
import io.swagger.client.core._
import io.swagger.client.core.CollectionFormats._
import io.swagger.client.core.ApiKeyLocations._

object ValuesApi {

  /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Employee] (OK)
   * 
   * @param id Employee id of the employee to be deleted
   */
  def valuesDelete(id: String): ApiRequest[Seq[Employee]] =
    ApiRequest[Seq[Employee]](ApiMethods.DELETE, "http://localhost:55668", "/api/Values/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Seq[Employee]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Employee] (OK)
   */
  def valuesGet(): ApiRequest[Seq[Employee]] =
    ApiRequest[Seq[Employee]](ApiMethods.GET, "http://localhost:55668", "/api/Values", "application/json")
      .withSuccessResponse[Seq[Employee]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Employee (OK)
   * 
   * @param id The employeeId of the item to be retrieved
   */
  def valuesGet_0(id: String): ApiRequest[Employee] =
    ApiRequest[Employee](ApiMethods.GET, "http://localhost:55668", "/api/Values/{id}", "application/json")
      .withPathParam("id", id)
      .withSuccessResponse[Employee](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 200 : Seq[Employee] (OK)
   * 
   * @param employeeList 
   */
  def valuesPost(employeeList: Seq[Employee]): ApiRequest[Seq[Employee]] =
    ApiRequest[Seq[Employee]](ApiMethods.POST, "http://localhost:55668", "/api/Values", "application/json")
      .withBody(employeeList)
      .withSuccessResponse[Seq[Employee]](200)
        /**
   * 
   * 
   * Expected answers:
   *   code 204 :  (No Content)
   * 
   * @param id 
   * @param value 
   */
  def valuesPut(id: Int, value: String): ApiRequest[Unit] =
    ApiRequest[Unit](ApiMethods.PUT, "http://localhost:55668", "/api/Values/{id}", "application/json")
      .withBody(value)
      .withPathParam("id", id)
      .withSuccessResponse[Unit](204)
      

}

