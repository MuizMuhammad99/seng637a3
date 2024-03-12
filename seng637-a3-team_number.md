**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group: 3      |     |
| -------------- | --- |
| Aemen |     |
| Jauhar |     |
| Muhammad |     |
| Shaun |     |
| Soumini |     |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1 Introduction

In this lab report, we document our work on code coverage, adequacy criteria, and test case correlation for Assignment #3 in the SENG 637 course. The focus of the assignment is on white-box testing using JUnit and code coverage tools. Our group worked collaboratively on various aspects of the assignment. Our tasks involved manual data-flow coverage calculations, developing new unit tests, and evaluating the coverage achieved.

The assignment is all about getting better at automated unit testing, especially using a tool called JUnit. We're focusing on a type of testing called White Box Testing. We're working together as a group to create test code based on specific unit requirements. Our main goal is to make automated test code using JUnit and another testing tool called XUnit. We're specifically looking at a Java system called JFreeChart, which is used for making charts.

We followed the given instructions to set up our testing environment. We're also learning about something called mocking objects to help us create tests for the methods we need to check. We're using Javadoc API specifications to understand how the methods should behave, and then we're making a plan for our tests based on that.

# 2 Manual data-flow coverage calculations for X and Y methods

Aemen and Shaun were responsible for performing manual data-flow coverage calculations for the specified methods, namely DataUtilities.calculateColumnTotal and one method from the org.jfree.data.Range class. The process included creating data flow graphs, identifying def-use sets, and analyzing DU-pairs per variable. The results of test case coverage were documented for each method.

# 3 A detailed description of the testing strategy for the new unit test

Soumini, Muhammad, and Jauhar focused on developing new unit tests for the org.jfree.data.DataUtilities and org.jfree.data.Range classes. The testing strategy involved creating a comprehensive test plan, designing test cases for achieving high statement, branch, and condition coverage, and ensuring consistency in test case organization. The focus was on using specifications for developing test oracles.

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

Our group selected five test cases strategically to increase code coverage for the target classes. These test cases were designed to cover various control flow paths and ensure a more thorough examination of the code.

<img width="619" alt="line_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/dd237a04-7242-4ed5-9466-c27c465e47b4">

<img width="613" alt="branch_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/02acfac1-dd9b-4d5a-901a-9bfe384b28f3">


<img width="611" alt="condition_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/cd2d4e79-3866-4543-8112-8643f63ccce3">


# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

The coverage achieved for each class and method was documented in detail. Screenshots from the code coverage results were included, providing a visual representation of the achieved coverage metrics.

# 6 Pros and Cons of coverage tools used and Metrics you report

Our group analyzed the coverage tools used, highlighting their pros and cons. Factors such as integration with IDE, user-friendliness, reported metrics, and potential issues like crashes were discussed.

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

A comparison was drawn between requirements-based test generation and coverage-based test generation. The advantages and disadvantages of each approach were discussed, providing insights into their applicability in different scenarios.

# 8 A discussion on how the team work/effort was divided and managed

The report includes a discussion on how the team work and effort were divided among the group members. The collaborative coding efforts were organized into subgroups, and the finalization of the report was achieved through a collective effort.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab

Our group faced challenges related to the clarification of assignment instructions and the use of mocking objects. The report discusses how these challenges were overcome through team collaboration and highlights the lessons learned in the process.

# 10 Comments/feedback on the lab itself

There are suggestions for providing more support for learning and using different Integrated Development Environments (IDEs) to enhance the overall learning experience.
