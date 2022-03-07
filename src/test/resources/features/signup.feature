Feature: Sign up
  As a user I
  need to register in to the page

  Scenario Outline: Sign up succefull
    Given Dalmi Go to website


    When enter the sign up credentials
    | username | <username> |
    | email    | <email>    |
    | password | <password> |

    Then validate that the new username is "Dalmi"

    Examples:
    | username | email            | password  |
    | Dalmi    | dalmi@gmail.com  | 123456789 |