## UPDATE LOGS - Welley

#### 2019:

* [Aug 13](#august13) <br>
* [Aug 07](#august07)

Github: CT-Mill-Rate-Project-Java

*Code for Connecticut, Code for America*

*Project built on IntelliJ IDEA/JavaFX Java8. To set up, .java files in src folder and CSVs outside of src*
*Please note that I am still learning the language, so there may be errors in the files*

<b><a name="august13">2019-Aug-13</a></b>

- [x] Create BufferedReader to read CSV lines
- [x] Added first level of HashMap to add key (String) municipality name and return mill rate value.
- [ ] Incorporate JSON (XML?)
- [ ] Plot graphs

<b><a name="august07">2019-Aug-07</a></b>

This originally began as a personal project to learn and practice Java. Given the massive amount of public data available for mill rates (and other useful demographic information per municipality), there is a lot one can do here. For the civil service aspect of this project, I'd like to create a UI that takes in your property value(s) and return the total calculated taxes. Along with that, there should be interactive graphics with regression analyses for the last decade (at least). Currently, most of this information is buried in the state portal and while public, it can be daunting for a civilian to dig through the summaries to make sense of it all. There are various types of tax calculators that pop up on Google, too, but do we really understand where these numbers are coming from?

Going further, there are specific hypotheses that we can test (and these questions can be refined later):

Is there a significant correlation between increased mill rates and..

*..increased gentrification?*

*..decreased crime?*

*..increased household income?*

*..increased property insurance costs?*

*..value of a car?*

*..value of a home?*


To start, here are some literature search questions:

1. What is a mill rate?

2. How is it determined?

3. What are existing applications, calculators, and graphics that are available to public?

4. What are the pros and cons of those existing resources and what we can do differently?

My first commit contains a basic borderpane window made with JavaFX, just to test it out and to make comparisons to Swing for educational purposes. I may move on to Scene Builder later to speed things up and to focus more on funcationality. 

In the background, I have the compiler read the 2019 mill rate data line-by-line from a CSV using BufferedReader. Each municipality is organized into a list of a list of strings, so the individual pieces of information associated with each municipality can be printed by .get(index). 

My next steps are to learn how to build graphs using this data.
