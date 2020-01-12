@Smoke
Feature: Login to Web Application

  Scenario Outline: Verify the login functionality
    Given Launch the application in chrome browser
    When Enter the "<Username>" and "<password>"
    Then Click on the Login button

    Examples:

    |Username| |password|
    |Mahesh| |Kanmah77|


@Smoke1
  Scenario Outline: Verify the login functionality
    Given Launch the application in chrome browser
    When Enter the "<Username>" and "<password>"
    Then Click on the Login button

    Examples:

      |Username| |password|
      |Mahesh| |Kanmah77|


