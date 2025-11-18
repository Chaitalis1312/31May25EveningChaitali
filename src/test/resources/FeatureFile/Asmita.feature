Feature: TRYING TO WORK ON GIT

  Scenario: 1st pull request on Chaitali's project
    Given I am on Git Bash
    When I create a new branch
    And I push the new changes made in the feature file
    Then Chaitali should receive a pull request
