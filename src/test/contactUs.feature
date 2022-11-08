Feature: I want to see ContactUs Page on website because I want the customer able to contact us
  Scenario: Go to Website
    Given navigate to WebSite
    And click ContactUs element
    And choose subject heading
    And enter your email
    And type a message
    When click send button
    Then verify your message has been sent