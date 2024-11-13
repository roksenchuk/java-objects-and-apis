# jsvs-obecjts-apis-training
###### metadata
**source** -> https://www.linkedin.com/learning/java-essential-training-objects-and-apis-16021820/sealed-classes?contextUrn=urn%3Ali%3AlyndaLearningPath%3A632b30d9498ed176d11f2931
###### inheritance
- [ ] ==Inheritance== -> when the one class becomes the extension of the another class, therefore inheriting the members of the extended class
    - [ ] super-class (parent) -> subclass (child)
    - [ ] super-class == parent class, base class
    - [ ] subclass == child class, derived class
- [ ] ==Principles of Object-Oriented Programming==:
    - [ ] Encapsulation
    - [ ] Inheritance
    - [ ] Polymorphism
    - [ ] Abstraction
- [ ] Parent class constructor is called in advance to the child's constructor
- [ ] ==super()== method -> relates to the call of the
    - [ ] if you are going to make the explicit call to the parent constructor via super() (from the child's constructor), ==it should be placed in the first line of the child's constructor==
    - [ ] by default, the children's constructor makes the implicit call to the parent's default constructor
- [ ] constructors in inheritance:
    - [ ] a super-class's constructor is run before the subclass's constructor
    - [ ] an explicit call can be made to the super-class's constructor from one of the subclass's constructors by using super()
    - [ ] an explicit call to the super-class's constructor must be the first statement in the subclass's constructor
    - [ ] if the super-class does not have a default constructor, the subclass must explicitly call one of its other constructors
- [ ] ==overriding methods== -> changing the behavior of an inherited method
- [ ] use ==@Override== method to notify java that you are overriding the method (this is optional, but it shows your intentions)
- [ ] ==overloaded methods== -> methods within the same hierarchy that have the same name but different signatures
- [ ] overriding and overloading:
    - [ ] to override a method, you keep the same signature but change the body of the method
    - [ ] to overload a method, you keep the same name but change the signature of the method
- [ ] ==chain of inheritance== -> where the subclass inherits from their ancestor classes
- [ ] every class in java inherits the properties of the object class
- [ ] java does not support multiple inheritance. but this goal can be achieved by the chain of inheritance
- [ ] access imitation in inheritance:
    - [ ] ==constructors== are not technically members of a class and are therefore not inherited
    - [ ] all ==public== and ==protected== methods and fields in a super-class are inherited by its subclasses
    - [ ] private methods and fields are not inherited
    - [ ] final methods are inherited but cannot be overridden
        - [ ] (==final== keyword -> non access identifier, that indicates the final implementation of the method, that can not be changed by the subclasses)
    - [ ] by inheriting the method (or the property), you can not change its to stricter than they are
- [ ] access modifiers enable super-classes to control which members can be shared to their subclasses
- [ ] ==sealed classes== -> restrict which other classes may extend them
    - [ ] using the keyword ==sealed== to specify the class that is sealed + using the keyword ==permits== to specify which classes can inherit from the parent class
    - [ ] if a ==sealed== class lists the sub-class in the permits clause, the sub-class is required to already exist and must have already extended the ==sealed== class
``` java
// example of the sealed class
public sealed class Shape permits Rectangle, Circle {}
```
- [ ] ==sealed class==:
    - [ ] a sealed class grants inheritance permission to a specific list of classes
    - [ ] every permitted subclass must already exist and must explicitly extend the sealed class
    - [ ] every permitted subclass is required to declare itself as sealed, non-sealed or final
###### polymorphism
- [ ] ==polymorphism== -> ability to take multiple forms
    - [ ] in OOP, polymorphism is where a subclass can define their own unique behaviors and yet share some behaviors of their superclass
- [ ] polymorphism:
    - [ ] type vs instance -> an object can have a superclass type and a subclass instance
    - [ ] overriddin methods -> if a method is overridden by the subclass, the polymorphic object will execute the overridden method at runtime
- [ ] ==object type casting== -> the act of converting an object's type into a different type
    - [ ] casting can be performed upward or downward in the inheritance tree
``` java
class Animal {...}
class Dog extends Animal {...}
class Cat extends Animal {...}

Animal entity = new Dog();
entity.makeSound();
// entity.fetch(); -> not possible

entity = new Cat();
entity.makeSound();
((Cat)entity).scratch(); // possible because of casting
```

``` java
...
// temporary casting example
((Cat)entity).scratch();
```

``` java
...
// permanent casting example
Animal entity = new Dog();
Dog entityTheDog = (Dog)entity;
```

- [ ] ==use the casting carefully and test the code to get the predicted behavior==
- [ ] ==instanceof== -> an operator that checks if an object is an instance of a specific class
``` java
Animal entity = new Dog();

boolean isDog = entity instanceof Dog; // true

boolean isAnimal = entity instanceof Animal; // true

boolean isCat = entity instanceof Cat; // false
```

- [ ] ==pattern matching== -> allows to perform 2 actions in one
``` java
// pattern matching example
Animal entity = new Dog();

// checking the instance + casting on success
if (entity instanceof Dog entityTheDog) {
	entityTheDog.fetch();
}
// upper is the same as:
if (entity instanceof Dog) {
	Dog entityTheDog = (Dog)entity;
	entityTheDog.fetch();
}
```
###### abstraction
- [ ] ==abstraction== -> structures, that represent abstract ideas. it is defined as something that exists in theory, but does not have concrete existence
- [ ] ==abstract== keyword -> used to define the template for the class or the method, but to not intend for it to be used as is
- [ ] ==abstract class== -> is not designed to be instantiated, instead. it is designed to be extended, thus pushing the burden of implementation onto the subclass
- [ ] ==designed to be implemented== -> ==abstract== classes are implemented by their subclasses
- [ ] ==abstract method== -> has no body, only the signature is defined
    - [ ] it is not designed to be run as is
    - [ ] it is designed to be overwritten by a subclass
- [ ] ==abstract classes== can inherit the ==abstract methods== from the another ==abstract classes==. the last of the classes, that is not abstract but inherits the last abstract class from the chain, should provide the implementation to the all abstract methods
- [ ] ==abstraction==:
    - [ ] abstract classes and methods are templates that are meant to be implemented by their subclasses
    - [ ] classes and methods are declared abstract by using the ==abstract== reserved keyword
    - [ ] if a subclass inherits from an abstract class, it must implement its abstract methods or the class itself must be declared as abstract
    - [ ] abstract classes can not be instantiated
###### interfaces
- [ ] ==interface== -> a stateless construct consisting of abstract behaviors to be implemented by other classes
    - [ ] purpose of the interface, is to serve as the template, that other classes can later provide implementation details for
    - [ ] ==interfaces== help to achieve ==abstraction==, ==polymorphism== in multiple inheritance
- [ ] ==interfaces==:
    - [ ] do not have constructor
    - [ ] fields are final
    - [ ] must be implemented by other classes, not extended
- [ ] ==constants==:
    - [ ] ==static== -> can be accessed from any other class without an object instantiation
    - [ ] ==final== -> value assigned at initialization and cannot be changed
    - [ ] by the convention, ==constants are written in all caps==
- [ ] ==final== values require the value to have at the time of declaration, and they can not be changed by an implementing a class
- [ ] all ==methods within the interface== are ==abstract== implicitly
- [ ] any class that implements an interface must implement all of its abstract methods or it must declare itself as an abstract class
- [ ] only interfaces are allowed to extend the other interfaces
- [ ] classes must ==implement== (as the keyword) an interface
- [ ] ==classes can implement multiple interfaces to achieve the multiple inheritance==
``` java
public class ElectronicBook implements Product, DigitalFile {
	// implement all abstract methods from Product
	...
	// implement all abstract methods from DigitalFile
	...
}
```
- [ ] if there is a method that exists in the 2 interfaces and has the same signature, the class should provide the 1 implementation, that will be applicable to both of the methods
    - [ ] if there will be 2 methods with the same signature, but with the different return values (types), java will return the clash error
- [ ] interface can not be instantiated
- [ ] ==methods allowed in interfaces==:
    - [ ] abstract
    - [ ] default
    - [ ] static
- [ ] ==default methods== -> methods within the interface, that contain a default implementation
    - [ ] this enables to ensure the backward compatibility in implementing classes when changes are made to the interface state implements
    - [ ] ==default methods== have to have function bodies
    - [ ] ==default methods== do provide the implementation, but they are not final
    - [ ] classes can override ==default methods==
- [ ] ==static methods== -> methods within an interface that contain implementation but are not inherited by implementing classes
    - [ ] ==static methods== can not be overwritten (because of their nature)
    - [ ] ==static methods== are available from the classes/interfaces themselves
- [ ] ==interfaces==:
    - [ ] can not be instantiated
    - [ ] can be implemented by classes and extended by other interfaces
    - [ ] any class that implements an interface must implement all of its methods, or it must declare itself abstract
    - [ ] by default, methods in interface are public and abstract (explicit declaration of such is not required)
    - [ ] in addition to abstract methods, interfaces may also contact default and static methods as well
###### data collections
- [ ] ==collections== -> data structures that hold a group of objects
- [ ] ==collections== are used to store and manipulate groups of objects
- [ ] ==elements== -> objects within a collection
- [ ] ==types of collections in java==:
    - [ ] with unique elements
    - [ ] with duplicated elements
    - [ ] with ordered elements
    - [ ] with unordered elements
- [ ] ==collections framework== -> unified architecture that provides data structures and algorithms to manipulate them
- [ ] ==Set== -> collection of unordered unique elements
- [ ] ==List== -> collection of ordered unique/duplicate elements that can be accessed by position
- [ ] ==Queue== -> collection of ordered elements that are processed in the order they were added -> FIFO -> first in - first out
- [ ] ==Map== -> collection of unordered unique key-value pairs
- [ ] java.utils.Collections provides a class that contains the algorithms for working with collections:
    - [ ] binarySearch()
    - [ ] copy()
    - [ ] frequency()
    - [ ] reverse()
    - [ ] shuffle()
    - [ ] sort()
- [ ] implementations of Set: -> + check on the https://docs.oracle.com/java
    - [ ] hash set
    - [ ] linked hash set
    - [ ] tree sets
- [ ] ==if to add the duplicated element to the Set, it won't be stored==
- [ ] ==immutable object== -> an object whose state cannot change after it is constructed
- [ ] note: remove() method in the List (if used the signature with the object) from all the duplicated objects removes the first found one
- [ ] Queue collection:
    - [ ] the first element is called the head
    - [ ] the last element is called the tail
    - [ ] remove() with no input arguments removes the head of the queue
- [ ] Map is not a collection, because it does not inherit from the collection interface
    - [ ] but it still a part of the collection's framework (because of the methods used and its nature)
- [ ] ==Iterator== -> an object used to loop through the collection
- [ ] ==Collections that have the Iterator() method==:
    - [ ] Set
    - [ ] List
    - [ ] Queue
- [ ] Map does not have an Iterator()
    - [ ] but, through the entrySet() method, it return the Set from the Map, that can be iterated through
- [ ] ==Enhanced for Loop== -> a repetition structure designed to loop through collections and arrays
    - [ ] works for the every type of collection
- [ ] ==Lambda expression== -> anonymous block of code, that accepts parameters and returns a value. uses the arrow "->" symbol
``` java
// lambda expression
(k, v) -> {...}
```

``` java
// forEach use with the collections
public static void printCollection_forEach() {  
    List fruits = new ArrayList();  
    fruits.add("Apple");  
    fruits.add("Banana");  
    fruits.add("Orange");  
    fruits.add("Pear");  
  
    fruits.forEach(f -> System.out.println(f));  
    fruits.forEach(System.out::println);  
}
```

``` java
// forEach use with the maps
public static void printMap_forEach() {  
    Map<String, Integer> fruitCalories = new HashMap<>();  
    fruitCalories.put("Apple", 1000);  
    fruitCalories.put("Banana", 500);  
    fruitCalories.put("Orange", 300);  
    fruitCalories.put("Pear", 100);  
  
    fruitCalories.forEach((k, v) -> System.out.println(k + ": " + v));  
}
```
###### functional programming
- [ ] ==functional programming== -> a programming style that applies pure functions to an input set to produce an output
- [ ] java provides the functional programming functionality by the java.util.function package
- [ ] ==functional interface== -> am interface with just one abstract method that can be implemented by lambda expressions and method references
- [ ] ==core functional interfaces==:

| Interface      | Description                                                | Abstract Method   |
| -------------- | ---------------------------------------------------------- | ----------------- |
| Consumer       | Accepts a single input argument and returns no result      | void accept(T t)  |
| Supplier       | Accepts no arguments and returns a result                  | T get()           |
| Predicate      | Accepts one argument and returns a Boolean result          | boolean test(T t) |
| Function       | Accepts one argument and returns a result                  | R apply(T t)      |
| Unary Operator | Accepts one argument and returns a result of the same type | R apply(T t)      |
*...where the ==T== stands for the ==type of the input==, ==R== stands for the ==type of the return==, ==U== stands for the ==type of the second argument== (if there is one)*

- [ ] ! important -> to create the own functional interfaces, use @Functionalnterface annotation (that is provided under java.util.function package) -> this will enforce having only one abstract method -> your abstract method will let the know what arguments are required
``` java
@FunctionalInterface
public interface MyInterface {
	int add(int num1, int num2, int num3);
}
```
- [ ] ==stream== -> a sequence of elements from a data source
    - [ ] stream does not store elements (like the collection does)
    - [ ] data source -> stream operations -> result
    - [ ] provided by java.util.stream package
    - [ ] powerful tool for the data processing
``` java
// stream example
int[] numbers = {0, 2, 4, 6, 8, 10};
// regular processing (single-threaded)
Arrays.stream(numbers)
	.forEach(n -> System.out.println(n + 1 + " ")); // 1 3 5 7 9 11
// parallel / multi-threaded processing
Arrays.stream(numbers).parallel()
	.forEach(n -> System.out.println(n + 1 + " ")); // 7 11 9 3 1 5 
```
- [ ] Stream operations:
    - [ ] intermediate -> perform the operation and return the resulting stream
    - [ ] Terminal -> return a result and close the stream
``` java
// stream operations example
List<String> veggies = List.of(
	"spinach",
	"cabbage",
	"peas",
	"green beans");
// look for the any matches (terminal one)
veggies.stream().anyMatch(v -> v.contains(" ")); // returns true
// look for all matches (terminal one)
veggies.stream().allMatch(v -> v.contains("s")); // returns false
// filter operation (intermediate one)
veggies.stream()
	.filter(v -> v.startsWith("c"))
	.forEach(System.out::println);
// map operations for parsing the stuff (intermediate one)
veggies.stream()
	.map(String::toUpperCase)
	.forEach(System.out::println);
// returns the collection of the choice (terminal)
veggies.stream().collect(Collectors.toList());
```
###### exception handling
- [ ] ==exception== -> an error event that disrupts the normal flow of the program
- [ ] ==stack trace== -> an interactive log of method calls that led to a thrown exception
- [ ] there are checked & unchecked exceptions
    - [ ] InputMismatchException: Unchecked
    - [ ] IOException: Checked
- [ ] ==checked exceptions== -> exceptions verified by a compiler. if method throws the checked exception, it should specify it in the method's signature
    - [ ] used when there's a possibility of recovery
- [ ] ==unchecked exceptions== -> exceptions that are not verified by the compiler. the signature does not have to declare that the method throws an exception
    - [ ] used when there's no anything that can be done
- [ ] ==ways to handle multiple exceptions==:
    - [ ] polymorphism -> handles hierarchy of exceptions
    - [ ] series of catch blocks -> handles different exceptions in the different ways
    - [ ] multiple catch block -> handles unrelated exceptions in the same way
- [ ] all exceptions inherit from the Exceptions class
- [ ] exceptions interrupt the flow of the program
- [ ] exception handling:
    - [ ] try -> tries the method with the checked exception
    - [ ] catch -> catches the possible exception thrown
    - [ ] finally -> executes the action after throwing the exception
``` java
// exception handling
File file = new File("resources/nonexistent.txt");  
try {  
    file.createNewFile();  
} catch (FileNotFoundException | InputMismatchException e) {  
    e.printStackTrace();  
} catch (Exception e) {  
    System.out.println("Sorry, there is an error." + e.getMessage());  
    e.printStackTrace();  
} finally {  
    file.delete();  
}
```

- [ ] ==try-with-resources== -> declaration of resources that should be automatically closed after the execution of a try block
    - [ ] eligible resources are:
        - [ ] classes that implement Clossable
        - [ ] classes that implement AutoClossable
    - [ ] finally:
        - [ ] an alternative to use finally to close resources
        - [ ] finally can be used with try-with-resources to execute other statements
- [ ] ways to deal with the checked exception:
    - [ ] catch it
    - [ ] rethrow it
- [ ] main method can throw the exception