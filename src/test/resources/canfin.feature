Feature: Canfin site need to search in google
  Scenario: client search for Canfin homes site
    Given User opens browser Google Site
    Then He search for 'canfin homes'
    Then Search results should cntains the canfin homes site