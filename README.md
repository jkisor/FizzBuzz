FizzBuzz
========

Flexible Fizz Buzz example using Test Driven Development showcasing a great example of the Open Closed Principle

Requirements
Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz?”.

As this was a simple problem, I added more requirements to make it more interesting:
* – Support custom words (example: FooBar instead of FizzBuzz
* – Support a variable amount of multiple rules: ( example: In addition of fizz and buzz, add multiple of 7 = “Boom”)
* – Support different types of rules such as ‘number contains atleast one of specific digit’(AtleastOneOfDigitRule ‘in sample) and ‘if all digits are the same’(AllDigitsSameRule in sample)

Analysis
The extra requirements stated above brought up a great example of the Open-Closed Principle which states “software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification”.

Notice how extending the game to include new rules is possible without modifying the FizzBuzz class. This leaves the FizzBuzz class very generic and no longer has a need to change. Thank you polymorphism!

New rules are added by creating a new class, extending Rule, and overriding the ‘apply’ method. Without polymorphism, the FizzBizz would a chain of ‘if’ statements or a ‘switch’ that would need to be modified for every new rule thus violating the Open Closed Principle.
