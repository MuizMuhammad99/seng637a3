**SENG 637 - Dependability and Reliability of Software Systems**

**Lab. Report #3 – Code Coverage, Adequacy Criteria and Test Case Correlation**

| Group: 3      |
| -------------- |
| Aemen |
| Jauhar |
| Muhammad |
| Shaun |
| Soumini |

(Note that some labs require individual reports while others require one report
for each group. Please see each lab document for details.)

# 1 Introduction

In this lab report, we document our work on code coverage, adequacy criteria, and test case correlation for Assignment #3 in the SENG 637 course. The focus of the assignment is on white-box testing using JUnit and code coverage tools. Our group worked collaboratively on various aspects of the assignment. Our tasks involved manual data-flow coverage calculations, developing new unit tests, and evaluating the coverage achieved.

The assignment is all about getting better at automated unit testing, especially using a tool called JUnit. We're focusing on a type of testing called White Box Testing. We're working together as a group to create test code based on specific unit requirements. Our main goal is to make automated test code using JUnit and another testing tool called XUnit. We're specifically looking at a Java system called JFreeChart, which is used for making charts.

We followed the given instructions to set up our testing environment. We're also learning about something called mocking objects to help us create tests for the methods we need to check. We're using Javadoc API specifications to understand how the methods should behave, and then we're making a plan for our tests based on that.

# 2 Manual data-flow coverage calculations for X and Y methods

Aemen and Shaun were responsible for performing manual data-flow coverage calculations for the specified methods, namely DataUtilities.calculateColumnTotal and one method from the org.jfree.data.Range class. The process included creating data flow graphs, identifying def-use sets, and analyzing DU-pairs per variable. The results of test case coverage were documented for each method.

# 3 A detailed description of the testing strategy for the new unit test
White-box testing is based on specific knowledge of the source code to define the test cases and examine the outputs. 

For the Range.getCentralValue() method, the test cases are shown below:

```Java
    @Test
    public void testCentralValueWithPositiveRange() {
        Range range = new Range(1.0, 9.0);
        assertEquals("The central value of a positive range should be correct", 5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithNegativeRange() {
        Range range = new Range(-9.0, -1.0);
        assertEquals("The central value of a negative range should be correct", -5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithZeroIncluded() {
        Range range = new Range(-5.0, 5.0);
        assertEquals("The central value of a range including zero should be correct", 0.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithZeroWidthRange() {
        Range range = new Range(5.0, 5.0);
        assertEquals("The central value of a zero-width range should be equal to its bounds", 5.0, range.getCentralValue(), 0.000000001d);
    }

    @Test
    public void testCentralValueWithVeryLargeRange() {
        Range range = new Range(1.0E30, 1.0E32);
        assertEquals("The central value of a very large range should be correctly calculated", 5.05E30, range.getCentralValue(), 0.000000001E30);
    }

    @Test
    public void testCentralValueWithVerySmallRange() {
        Range range = new Range(-1.0E-30, 1.0E-30);
        assertEquals("The central value of a very small range should be correctly calculated", 0.0, range.getCentralValue(), 0.000000001E-30);
    }

```

# 4 A high level description of five selected test cases you have designed using coverage information, and how they have increased code coverage

For the Range class:
* | Metrics | Coverage Before New Testcases |
  | ------- | ------ |
  | Statement / Line | 25.2% |
  | Branch | 20.7% |
  | Condition / Method | 30.4% |

* | Metrics | Coverage After New Testcases |
  | ------- | ------ |
  | Statement / Line | 87.4% |
  | Branch | 84.1% |
  | Condition / Method | 100% |
* Test cases for the getCentralValue() method helped increase the coverage percent:
    
    <img width="617" alt="rt6" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/edaf4d90-bdc0-4705-bc0a-8d50b4723803">

* Test cases for the shiftWithNoZeroCrossing(double, double) method:
      
    <img width="605" alt="rt12" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/383626d3-1055-4584-91b5-bd5f51f60a6b">

For the DataUtilities class:
* | Metrics | Coverage Before New Testcases |
  | ------- | ------ |
  | Statement / Line | 45.8% |
  | Branch | 32.8% |
  | Condition / Method | 50.0% |

* | Metrics | Coverage After New Testcases |
  | ------- | ------ |
  | Statement / Line | 88.5% |
  | Branch | 75.0% |
  | Condition / Method | 90.0% |

* Test cases for the
  
    ![du_clone](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/4e52d264-d61d-4747-9f78-5576dfdedbc1)

* Test cases for the calculateRowTotal() method:

    ![du_test2](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/d39ffd07-52ed-4a86-b23d-ec4272ee7896)
  
* Test cases for the calculateColumnTotal() method:
  
    ![du_col_tot](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/d6719933-41dd-4a31-9e46-6969bbcb8d25)



# 5 A detailed report of the coverage achieved of each class and method (a screen shot from the code cover results in green and red color would suffice)

The coverage achieved for each class and method was documented in detail. Screenshots from the code coverage results were included, providing a visual representation of the achieved coverage metrics.
* Range class:
  
  * Code Coverage before New Testcases:
    
    * Statement coverage / Line coverage:
      
  <img width="619" alt="line_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/41daab92-57ac-40a3-8319-7ab495a91545">
  
    * Branch coverage:
      
  <img width="613" alt="branch_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/1fc95c2f-1dba-4b3b-a695-167b98d0b828">
  
    * Condition coverage / Method coverage:
      
  <img width="611" alt="condition_before" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/2a5763fa-da49-4919-8163-541572cf8eba">
  
  * Code Coverage after New Testcases:
    
    * Statement coverage / Line coverage:
      
  <img width="639" alt="line_after" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/90c2cbfb-4798-4c85-9469-9d20bc668795">
  
    * Branch coverage:
      
  <img width="633" alt="branch_after" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/6923adff-05b9-4049-9a2e-e182714a93d2">
  
    * Condition coverage / Method coverage:
      
  <img width="639" alt="condition_after" src="https://github.com/MuizMuhammad99/seng637a3/assets/126427676/0d05e998-2e8f-4e3c-b289-8b7642fee7f2">
  
* DataUtilities class:
  
  * Code Coverage before New Testcases:
    
    * Statement coverage / Line coverage:
      
  ![du_line_before](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/8d9d1d58-ad75-4aaa-9c18-4e57ff48a6ad)

  
    * Branch coverage:
      
  ![du_branch_before](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/b2be6719-a4ba-43a0-9413-a12e055668f8)

  
    * Condition coverage / Method coverage:
      
  ![du_method_before](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/0d465bd7-daa5-46d1-930d-3608afd9629c)

  
  * Code Coverage after New Testcases:
    
    * Statement coverage / Line coverage:

  ![du_line_after](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/f1a6b449-b1ad-4a6e-bba1-5235a666bab8)

 
    * Branch coverage:
      
  ![du_branch_after](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/47ed1121-eb62-4f3c-90f9-dc7abd3f3282)

  
    * Condition coverage / Method coverage:
      
  ![du_method_after](https://github.com/MuizMuhammad99/seng637a3/assets/126427676/c3e7ec37-c443-4d3e-821c-6d30abd3107b)



# 6 Pros and Cons of coverage tools used and Metrics you report

Our group analyzed the coverage tools used, highlighting their pros and cons. Factors such as integration with IDE, user-friendliness, reported metrics, and potential issues like crashes were discussed. Listed below are the Pros and Cons.

**Pros of EclEmma:**

- **Easy to Use:** EclEmma is user-friendly, making it simple to work with.
- **Works with Eclipse:** It smoothly fits into Eclipse, a common Java development tool, offering a familiar setup.
- **Shows Testing Coverage:** EclEmma gives a clear picture of how much of the code is tested, helping in spotting areas that need more attention.
- **Visual Feedback:** It provides a visual map right in Eclipse, making it easy to see which parts of the code are well-tested and which ones need more testing.
- **Free to Use:** Being open source, EclEmma is free, encouraging collaboration.
- **Pairs with JUnit:** It easily connects with JUnit, a popular testing framework, making it handy for using JUnit.

**Cons of EclEmma:**

- **Just for Java:** EclEmma focuses on Java code. If we are working with multiple languages, we might need other tools.
- **Needs Eclipse:** It's an Eclipse plugin, so if we are not using Eclipse, it might not be as useful.
- **Can Slow Things Down:** In big projects, using EclEmma might make testing a bit slower.
- **Not Big on Data Flow:** While it's great for overall code flow, EclEmma doesn't dive too deep into data flow coverage.
- **Compatibility Hiccups:** Depending on our Eclipse version and other plugins, we might run into compatibility problems.

# 7 A comparison on the advantages and disadvantages of requirements-based test generation and coverage-based test generation.

A comparison was drawn between requirements-based test generation and coverage-based test generation. The advantages and disadvantages of each approach were discussed, providing insights into their applicability in different scenarios.

**Advantages of Requirements-Based Test Generation:**

* **Clear Focus:** It ensures testing aligns with what the software is supposed to do, keeping the focus on meeting specified requirements.
* **Thorough Coverage:** By deriving tests from requirements, it helps achieve comprehensive coverage, addressing various scenarios outlined in the specifications.
* **Traceability:** It creates a clear trace between tests and specific requirements, making it easier to validate if all aspects are tested.
* **Early Detection of Issues:** Testing against requirements can catch issues early in the development process, preventing them from becoming bigger problems later.

**Disadvantages of Requirements-Based Test Generation:**

* **Assumes Correct Requirements:** If the initial requirements are incorrect or incomplete, the generated tests might not cover actual usage scenarios, leading to gaps in testing.
* **Rigidity:** This approach might miss testing scenarios that are not explicitly mentioned in the requirements, potentially leaving out crucial aspects.
* **Limited Creativity:** It relies heavily on documented requirements, limiting the opportunity for testers to apply creative, exploratory testing methods.
* **Maintenance Challenges:** If requirements change frequently, maintaining and updating the tests to match the evolving specifications can be time-consuming and challenging.

**Advantages of Coverage-Based Test Generation:**

  * **Thorough Examination:** Ensures a comprehensive examination of the code by aiming to cover different parts, increasing the likelihood of identifying potential issues.
  * **Objective Measurement:** Provides an objective metric for testing progress, helping teams understand how much of the code has been tested.
  * **Effective Prioritization:** Helps prioritize testing efforts by focusing on critical parts of the code, ensuring that essential functionalities are thoroughly tested.
  * **Identifying Unreachable Code:** Reveals code that is never executed during testing, helping identify unnecessary or unreachable portions of the program.
  * **Increased Confidence:** Achieving high code coverage instills confidence that a significant portion of the code has been exercised, reducing the likelihood of hidden defects.

**Disadvantages of Coverage-Based Test Generation:**

  * **Not Necessarily Thorough Testing:** High code coverage does not guarantee that all possible scenarios and edge cases are tested, potentially leaving some issues undiscovered.
  * **Overlooking Logical Errors:** Focusing solely on code coverage might miss logical errors that are not apparent through structural analysis alone.
  * **Time-Consuming:** Achieving high coverage levels can be time-consuming, and the pursuit of coverage metrics might overshadow the importance of effective testing.
  * **Dependency on Implementation:** The approach heavily relies on the implementation details, and if these details change, the tests might need frequent updates.
  * **False Sense of Security:** A high coverage percentage may provide a false sense of security, as it doesn't guarantee the absence of functional or integration issues.


# 8 A discussion on how the team work/effort was divided and managed

The team was organized into three groups for collaborative coding efforts: 1) Aemen & Shaun, 2) Muiz and Fathima, and 3) Soumini. The division of work within the groups is as follows:
  * Aemen and Shaun collaborated on Measure Control Flow Coverage and Measure Data Flow Coverage.
  * Muiz and Fathima worked on Test Suite development for DataUtilities class.
  * Soumini worked on the Test Suite development for Range class.
    
Additionally, the report was a collective effort. The team convened over a virtual call to finalize and complete it collaboratively.

# 9 Any difficulties encountered, challenges overcome, and lessons learned from performing the lab
  * One of the challenges we faced was getting used to using code coverage tools. It was harder than expected to match our test cases with the coverage goals needed. We had to rethink and change our testing methods several times. We came to understand that beyond a certain stage, modifying the code did not impact the coverage percentage. 

# 10 Comments/feedback on the lab itself

What we...

- **Liked:** The structure the fact that the lab built upon the previous version, making it easy to set everything up.
- **Disliked:** We are not sure if intended but some of the jar files were missing and needed to be uploaded from a2 artifacts. it wouldve been much easier to just have them in the new a3 artifacts.
- **Found Interesting:** It was interesting seeing our code get covered in three different ways. At first, it looks all the same but upon closer inspection, the code coverage shows different statistics.
- **Found Confusing:** It was quite confusing understanding the three different coverages in EclEmma at first. but with the slides professor had given, this confusion was easily cleared.
- **Found Challenging:** Some of the assignment methods had logic that could not be accessed. It was confusing for us to even attempt to create tests for this part. An example is "for (int i2 = 0; i2 > data.getItemCount(); i2++)" which means that if this loop is to run, it will create infinite loop.
- **Found Motivating:** The hands-on nature of the lab, especially the practical application of automated unit testing using JUnit and XUnit frameworks, served as a motivating factor. The exposure to real-world scenarios and the opportunity to refine our skills in testing methodologies were encouraging aspects of the lab.


There are suggestions for providing more support for learning and using different Integrated Development Environments (IDEs) to enhance the overall learning experience.
