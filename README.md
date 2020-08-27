# coffeeMachine

ChaiPoint.java is the main class, also interacts with user and instantiates the outlets
This also interacts with IngridientObserver.java which is responsible to handle events coming from the ingridients and to re-Fill the ingridients

IngridientObserver implemnts the observer interface which is responsible for providing functionality for registring to a sibject and listening to the events from that subject

IngridientObserver interacts with IngridientFactory which is responsible for exposing functionality for Ingridients like
1. createInstance - create a new instance
2. getInstance - get Object instance
3. getIngridient - get the desired quantity of ingridient
4. refillIngridient - re fill an ingridient

The Subject Interface provides means to interact with the oberver interface
IngridientBase implements Subject to provide the functionality for the subject
Ingridient class extends IngridientBAse and provides common functionaltiy of all Ingridients
like
1. getIngridient
2. notfyObservers
3. reFill

Concrete Ingridients like IngTea are singelton classes which are responsible for creating the instances

Outlet is class responsible for creating a outlet
provides functionality to create a bevergae using BeverageFactory

BeverageFactory is a factory class to return the Beverage type based on the request

concrete bevrage classes implemts separate beverages using ingridients

# Cases Considered

1. not all outlets are used at the same time
2. all outlets used simultaneously 
3. ingridient is not available in sufficient  quantity
4. refilling ingiridient

# sample output

in file Output
