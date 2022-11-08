Feature: Search GiftCard Product
  Background:
    Given Navigate to Website
    And click gift cards



    Scenario: Option Birthday
      And click birthdayOption
      Then verify BirthdayGiftPage
      And close driver

      Scenario: Option Thank You
        And click thankYouOption
        Then verify thankYouOption
        And close driver



