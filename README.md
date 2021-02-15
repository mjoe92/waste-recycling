# Waste Recycling

## Story

It's 2020.
The mentors of Codecool Phnom Pen (capital of Cambodia) are fed up, that despite the strict house rules, no one cares about collecting the waste in a selective way in the school.
They decided to make an automated dustbin, which can detect different types of garbage, and can put them to different containers automatically.

Mentors at Codecool usually have a whole bunch of things to do, and they aren't exceptions either, so they don't have time to implement the dustbin's software.
Luckily their internal computer is capable of running Java or C# programs...

Have you found out yet?
Yes! It's your job to implement it in an object-oriented way!

## What are you going to learn?

- How to use the basic mechanics of inheritance
- How to use arrays and how to make them grow in size dynamically
- How to inspect the runtime type of objects referenced by polymorphic references
- How to make decisions in your code based on the runtime type of an object
- How to throw exceptions to signal errors, bad usage from within methods and catch those in an outer scope
- How to allow objects to display textual information about themselves in an object-oriented way
- How to use access modifiers like `private` and `protected` to achieve data hiding and encapsulation

## Tasks

1. Define the `Dustbin` class in an object-oriented way.
    - Only allow instantiating `Dustbin` instances by supplying a color name
    - `Dustbin` instances allow access to the color name they were created with using the `getColor()` method
    - `Dustbin` instances allow `Garbage` instances to be thrown into them using the `throwOutGarbage(Garbage)` method
    - `Dustbin` instances only allow the following kinds of garbage to be thrown into them:
- cleaned `PlasticGarbage` - squeezed `PaperGarbage` - any other kind of `Garbage` (e.g. house waste),
otherwise a `DustbinContentException` should occur
    - `Dustbin` instances allow access to the number of different kinds of garbage stored in them via the following methods:
- `getHouseWasteCount()` - `getPaperCount()` - `getPlasticCount()`
    - `Dustbin` instances provide a way to clear their contents via the `emptyContents()` method
    - `Dustbin` should provide a way to get its textual representation via `toString()` method and it should look like this: ``` Green Dustbin! House waste content: 2 item(s)
    Rotten tomato nr.1
    Half-eaten lettuce nr.2
Paper content: 1 item(s)
    Failed exam nr.1
Plastic content: 3 item(s)
    Empty plastic bottle nr.1
    Plastic bag nr.2
    Wrapper foil nr.3
```
    - `Dustbin` instances provide possibility to print to the console their textual representation via the `displayContents()` method

2. Define the `Garbage` class in a way that other garbage types could use it as their base/parent class, sharing as many behaviour between parent-child as possible.
    - Only allow instantiating `Garbage` instances by supplying a garbage name
    - `Garbage` instances allow access to the name they were created with using the `getName()` method

3. Define the `PlasticGarbage` class in a way that it reuses every regular garbage behaviour as possible and extends it with the notion of being *cleanable*.
    - Only allow instantiating `PlasticGarbage` instances by supplying a garbage name and a flag that signals whether they are clean or not (in this order)
    - `PlasticGarbage` instances allow access to the name they were created with just like `Garbage` instances do
    - `PlasticGarbage` instances allow checking whether they are clean or not using the `isClean()` method
    - `PlasticGarbage` instances provide a way to clean them via the `clean()` method (if a plastic garbage is already clean using this method has no effect)

4. Define the `PaperGarbage` class in a way that it reuses every regular garbage behaviour as possible and extends it with the notion of being *squeezable*.
    - Only allow instantiating `PaperGarbage` instances by supplying a garbage name and a flag that signals whether they are squeezed or not (in this order)
    - `PaperGarbage` instances allow access to the name they were created with just like `Garbage` instances do
    - `PaperGarbage` instances allow checking whether they are squeezed or not using the `isSqueezed()` method
    - `PaperGarbage` instances provide a way to squeeze them via the `squeeze()` method (if a paper garbage is already squeezed using this method has no effect)

5. In your `Main` class write code that serves as a "movie script" for a little story. Think of the contents of the main method as series of things (statements) that happen over time in the life of an ordinary dustbin.
    - Create at least one `DustBin` instance and name it as you wish.
    - Create at least one instance of each garbage subtype but store them in `Garbage` variables.
    - Throw all garbage you created into the `DustBin`.
    - Create a dirty plastic garbage and throw it to the DustBin.
    - Clean one of the dirty plastic garbage and throw it to the `DustBin`.
    - Write your bin content to the console.
    - Empty your bin and print its content again to see how did it change.

## General requirements

- Your program should be compiled without error and be executable.
- Your code should follow language specific naming convention.
- The program should notify the user when exceptional situation occurs.

## Hints

- Make your life easy with formatted strings.
- In case of the different contents of Dustbin you can use simple arrays and resize them dynamically.
- To determine that a variable is a particular type or not you can use the `instanceof` operator.

## Starting your project



## Background materials

- <i class="far fa-exclamation"></i> [Arrays](project/curriculum/materials/pages/java/arrays.md)
- <i class="far fa-exclamation"></i> [OOP Basics](project/curriculum/materials/pages/java/basics-of-object-oriented-programming.md)
- <i class="far fa-exclamation"></i> [OOP Basics 2](project/curriculum/materials/pages/java/basics-of-object-oriented-programming-with-java-part-2.md)
- <i class="far fa-exclamation"></i> [Inheritance](project/curriculum/materials/pages/java/inheritance-java.md)
- <i class="far fa-exclamation"></i> [Polymorphism](project/curriculum/materials/pages/java/polymorphism.md)
- <i class="far fa-candy-cane"></i> [How do dynamic arrays work](https://www.geeksforgeeks.org/how-do-dynamic-arrays-work/)
- <i class="far fa-exclamation"></i> [Exception handling](project/curriculum/materials/pages/java/exception-handling.md)
- <i class="far fa-video"></i> <i class="far fa-book-open"></i> [Formatted string](https://www.youtube.com/watch?v=hCG1mNIVn54)

