Feature: US01 Select Query Execute

  Scenario:Verify the "remember_token" information of the data in the "admins" table in the database

    Given Connected to the Database
    When Query02 is prepared and executed
    Then The ResultSet02 results are processed
    Then The database connection is closed