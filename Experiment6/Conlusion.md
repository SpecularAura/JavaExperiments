### How to use Math class static members without the Math prefix
Quote from [link](https://dev.java/learn/packages/#:~:text=Copy-,The%20Static%20Import%20Statement,-There%20are%20situations):  

> There are situations where you need frequent access to static final fields (constants) and static methods from one or two classes. Prefixing the name of these classes over and over can result in cluttered code. The static import statement gives you a way to import the constants and static methods that you want to use so that you do not need to prefix the name of their class.

> To access members outside a package the classes in the package must be public

> To class' constructor must also be declared public to be used outside the package(to be used with the new operator)

> All the methods that need to be accessed outside the package must be declared public