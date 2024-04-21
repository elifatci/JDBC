Feature: US04 Select Query Execute

  Scenario Outline: Verify the "charge" value of the data with "trx=4GC9SMZUS69S" among the data with "amount" value below $500,000.

    Given Connected to the Database
    When Query04 is prepared and executed
    Then The ResultSet04 results are processed <que1>
    Then The database connection is closed

    Examples:
      | que1 |
      | 102  |
