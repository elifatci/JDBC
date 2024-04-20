package stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import manage.QueryManage;
import org.junit.Assert;
import utils.ConfigReader;
import utils.JDBCReusableMethods;

import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.Assert.assertEquals;

public class Stepdefinition {

    String query;
    QueryManage queryManage = new QueryManage();

    ResultSet resultSet;

    @Given("Connected to the Database")
    public void connected_to_the_database() {
        JDBCReusableMethods.getConnection();
    }

    @When("Query01 is prepared and executed")
    public void query01_is_prepared_and_executed() throws SQLException {
        query = queryManage.getQuery01();
        resultSet = JDBCReusableMethods.getStatement().executeQuery(query);
    }

    @Then("The ResultSet01 results are processed")
    public void the_result_set01_results_are_processed() throws SQLException {
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        resultSet.next();
        int actual = resultSet.getInt("user_id");
        int expected = 21;
        assertEquals(expected, actual);
    }

    @Then("The database connection is closed")
    public void the_database_connection_is_closed() {
        JDBCReusableMethods.closeConnection();
    }

    @When("Query02 is prepared and executed")
    public void query02_is_prepared_and_executed() throws SQLException {
        query=queryManage.getQuery02();
        resultSet=JDBCReusableMethods.getStatement().executeQuery(query);
    }

    @Then("The ResultSet02 results are processed")
    public void the_result_set02_results_are_processed() throws SQLException {
        resultSet.next();
        String actual=resultSet.getString("remember_token");
        String expected= ConfigReader.getProperty("expectedToken");
        assertEquals(expected,actual);

    }
}
