**Real Estate Management System (REMS)**
=====================================

**Overview**
-----------

The Real Estate Management System (REMS) is a Java-based application designed to manage various aspects of a real estate agency. The system allows users to create accounts, login, search for properties, manage real estate properties, and interact with each other through comments.

**Features**
------------

* User management: create accounts, login, and manage user profiles
* Property management: add, remove, and search for properties
* Real estate management: manage properties for sale, rent, and auction
* Comment system: allow users to comment on properties and interact with each other
* User roles: buyers, renters, housekeepers, managers, and contractors

**Menu**
-----

The system has a menu-driven interface with the following options:

* Login
* Sign Up
* Search for properties
* Manage real estate properties (for managers only)
* Exit

**Implementation**
----------------

The system is implemented using Java, with a focus on object-oriented programming principles. The system consists of several classes, including:

* `App`: the main application class that handles user input and menu navigation
* `Account`: represents a user account
* `User`: represents a user with a role (buyer, renter, housekeeper, manager, or contractor)
* `RealEstate`: represents a real estate property
* `RealEstateAgency`: manages the real estate properties
* `Comment`: represents a comment on a property

**Contributors**
--------------

* SBAI Aymane: Worked on the following classes: RealEstate, RealEstateForSale, RealEstateForRent, SaleType, Bid, Auction, Comment and tested their functionalities in the App.java. Created all the classes and packages (for the initial start of the project) and finally the README.md.
* ECHRAMI Mohammed Badr: Worked on the following classes: RealEstateAgency, BuyNow, Unit, UnitType, Comment (post and reply methods). Implemented serialization and deserialization of real estate properties as well as users in the main. Implemented the following use cases in the main: 1. Searching for a real estate properties, 2. Managing real estate properties for managers (adding and removing).
* Morchid Saad: Worked on the following classes: User, Owner, Manager, Housekeeper, contractor. Worked on them with the help of teammates.
* Aouahchi Hiba: Worked on the classes in the User package (implemented the methods), as well as the main: User, Manager, Renter, Owner, Account along with their testing in the main.

**How to Run**
--------------

To run the system, follow these simple and straightforward steps:

1. Compile the Java code using `javac`
2. Run the `App` class using `java`
3. Follow the menu prompts to interact with the system

**Testing**
---------

The system has been tested with various scenarios, including:

* Creating and managing user accounts
* Searching for properties
* Managing real estate properties
* Commenting on properties

**UML Diagram**
--------------

The UML diagram for the system is included in the submission. (It is the Copy of OOP UML Diag in the repo)

**Submission**
------------

The submission includes:

* A zip or rar file containing the Java code, UML diagram, and report
* A README file explaining how to run and test the code
* An email to the instructors with the submission subject "OOP_Project_Team6_sec4"

** The end :) **
