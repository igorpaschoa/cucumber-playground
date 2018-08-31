Feature: delivery
  Calculate the delivery time

  Scenario: should calculate delivery
    Given the delivery is on 2018/05/28
    When the delivery is 2 days late
    Then the delivery will be on 2018/05/30

  Scenario: should calculate imported delivery
    Given the delivery is on 2018/05/28
    When the delivery is 2 months late
    Then the delivery will be on 2018/07/28

