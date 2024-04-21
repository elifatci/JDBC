Feature: US03 Select Query Execute

  Scenario Outline: Verify the "name" information of the first 2 records in the "cron_schedules" table in the database

    Given Connected to the Database
    When Query03 is prepared and executed
    Then The ResultSet03 results are processed "<que1>" and "<que2>"
    Then The database connection is closed

    Examples:
      | que1      | que2       |
      | 5 Minutes | 10 Minutes |