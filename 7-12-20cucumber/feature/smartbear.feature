Feature:  login gmail application
Scenario: login valid credential

Given open chromebrowser
Given navigate the url
When enter userName
When click the nextbutton
When enter passWord
When click the nextbutton
Then loginInbox successfully



