Feature: Working on Git - Second Feature Update

  Scenario: Adding a new scenario on a new feature branch
    Given I am on the main branch
    When I create a new branch named "asmita-feature2"
    And I make updates to the second feature file
    And I commit and push the changes to the remote repository
    Then a new pull request should be created for review
