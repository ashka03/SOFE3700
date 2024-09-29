This project shows the use of Factory Design Pattern to create products
like Banana and Apple, for a grocery store. This pattern allows us to define a 
GroceryProductFactory interface for creating different types of grocery products,
which can be extended to create products using their respective factories. 

The PriceReader class handles product pricing based on the type of product.

The project structure is as follows: 
    abstractFactory
        /src
            Apple
            Banana
            AppleFactory
            BananaFactory
            Product
            PriceFactory
            GroceryProductFactory
            TestGroceryStore
            price.txt
        README.md

Product.java is an abstract class which is responsible for gathering the name and price of the product with methods, getPrice and setPrice.
Classes like Apple.java and Banana.java extend the Product class and ensure that each product has its own specific price to fetch from price.txt.
This is an interface that defines the factory pattern for creating products. It has a method createProduct() which will be implemented by specific product factories.






When the program runs, it will load the prices from price.txt. If the file is not found or if a product’s price is missing, the program will return a default price of 0.0.