
Feature: Login to Web Application
  @Smoke
  Scenario Outline: Verify the login functionality
    Given Select the browser type "<browser>"
    When Initiating page factory
    When Application launched in the browser
    And Enter the "<Username>" and "<password>"
    And  Click on the Login button
    Then Verify the Home Page


    Examples:

    |Username|       |password|       |browser|
    |Maheshkannan77| |Kannan@1992|    |Chrome|




@Smoke1
  Scenario Outline: Verify the login functionality
    Given Launch the application in chrome browser
    When Enter the "<Username>" and "<password>"
    Then Click on the Login button

    Examples:

      |Username| |password|
      |Mahesh| |Kanmah77|


