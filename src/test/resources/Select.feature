Feature:Select Query Execute

  @wip
  Scenario:Verify user_ids with "amount" value between $100 and $500 in the "deposits" table in the database

    Given Connected to the Database
    When Query01 is prepared and executed
    Then The ResultSet01 results are processed
    Then The database connection is closed