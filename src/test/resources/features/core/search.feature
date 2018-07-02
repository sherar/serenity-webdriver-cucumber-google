Feature: Google Search Engine

  Scenario Outline: Search
    Given I can access the Google Search Engine
    When I run a search for <search_term>
    # Then I get more than one result
    And the results are returned in under a second

    Examples: 
      | search_term |
      | cat         |
      | dog         |
