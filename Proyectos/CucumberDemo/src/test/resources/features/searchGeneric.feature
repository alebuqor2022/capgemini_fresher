Feature: Search articles

  Scenario Outline: Search articles
    Given the user is in the index page
    When the user enters <article> in the search bar
    And the user clicks the search button
    Then the <article> page appears

    Examples: 
      | article |
      | dresses | 
      | blouses | 
