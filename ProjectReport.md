# Project Report

Max Kidd

## Challenge #1 Complete
For challenge number one I changed fakeQueryEngine in the QueryEngineModule class 
to be the real query engine,'wikipediaQueryEngine'. 


## Challenge #2 Incomplete

Although I was able to implement an interface, formatter, 
that is used by all formats, I was unable to change the format of the timestamp.
I tried using things like ISO_DATE_TIME, RFC_1123_DATE_TIME, 
ofLocalizedDateTime(dateStyle, timeStyle), but I had trouble 
due to the timestamp being an INSTANT value. I was unsure how to change the instant to a local variable 
that would help me better manipulate the date and time. 
The only way I changed the NewRevisionFormatter was by changing the presenting text 
before the data. I did bind my interface to Guice in the QueryEngineModule, 
and successfully injected it into wikipediaAnalyzer. 

## Challenge #3 Complete
Challenge 3 we were tasked with changing the iterative for loop to a java stream 
that used a high-order function. With your collectors hint, I was able to use a map function which collects
the revisions and returns a stream of revisions. 

## Reflection Question #1: Functional vs OO

The obvious difference between the iterative approach and the functional approach is the length of code. 
The iterative approach is six lines whereas the functional is one line. Using the for loop means we 
have to use the .toString() method on the StringBuilder in order to convert it to a string, but the functional method 
allows us to format the revisions to strings. For me I prefer the functional approach. Without the assignment statements
and the .append() methods I find it to be easier to follow. 


## Reflection Question #2: Polymorphism and Dependency Inversion

The formatter interface is an example of dependency inversion. The interface allows for the formatter to be used by any
formatting module. WikipediaAnalyzer and NewRevisionFormatter do not depend on each other, instead they depend on the interface.
This is preferred as to keep them separate and modular. Polymorphism is used by Guice when injecting dependencies. 

