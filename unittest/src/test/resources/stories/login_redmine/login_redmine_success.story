Scenario: Record a new todo action for future use using examples

Given I need to something
When I add the todo action something
Then something should be recorded in my todo list



Scenario: Should list items related to a specified keyword
    
Given I want to buy a wool scarf
When I search for items containing wool
Then I should only see items related to ttl


Scenario: 百度搜索关键字

Given 打开百度网页
When 搜索关键字 git
Then 搜索结果内容包括 git 