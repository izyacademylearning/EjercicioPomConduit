Feature: Critical flow article
  As a user I
  need to log in the page and crearte a article, update a article, view a article and delete a article

  Scenario Outline: critica Article
    Given Dalmi Go to website

    When create a article, update a article, view a article and delete a article
      | email            | <email>            |
      | password         | <password>         |
      | titleArticle     | <titleArticle>     |
      | articleTopic     | <articleTopic>     |
      | description      | <description>      |
      | tags             | <tags>             |
      | newtitleArticle  | <newtitleArticle>  |
      | newarticleTopic  | <newarticleTopic>  |
      | newdescription   | <newdescription>   |

    Then validation the message "No articles are here... yet."

    Examples:
      | email             | password  | titleArticle | articleTopic | description                                     | tags  | newtitleArticle | newarticleTopic | newdescription                      |
      | dalmi@gmail.com   | 123456789 | Hello        | Greet        | When you arrive at a new place always say hello | Hello | Hola            | saludo          | siempre que llega a un lugar saluda |