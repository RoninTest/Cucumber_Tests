Feature: Find my login info
  Scenario Outline: If you aren't a customer, you couldn't be found.
    Given navigate to WebSite
    And click forgot and register link
    And fill firstname "<firstname>"
    And fill lastname "<lastname>"
    And fill address "<address>"
    And fill city "<city>"
    And fill state "<state>"
    And fill zipcode "<zipcode>"
    And fill ssn "<ssn>"
    When click findMyLoginInfo button
    Then verify the message
    Examples:
      | firstname | lastname | address | city | state | zipcode | ssn |
      | Ronin | Roni | Levent | Istanbul | Turkey | 322322 | 342443 |
      | Roni | Ronin | Los Angeles | Los Angeles | USA | 322341 | 342443111 |



