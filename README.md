# Strategy Pattern

### Definition
Strategy pattern, defines a family of algorithms, encapsulates each one, and makes them interchangeable. Strategy lets the algorithm vary independently from clients that use it.

### Description
Our character runs into an enemy and battles with it. Of course he is using weapons and he needs to change between them time to time. However, weapons may have their own hit behaviours. So if we just make some Sword, Dagger, Club classes for each weapons and write a hit function, even with a little change with their behaviour, we need to make a new class for each one. Like NormalSword, SwordWithCritical, SwordWithBleed... It doesn't seem much efficient, right?

So what if we encapsulate that hit functionality? We can assign that hit behaviour to another class' responsibility and leave our weapon classes alone. So if we need to add some critical strike, bleeding effect, stun effect etc... we just need to add or change its behaviour without changing actual weapon class. And with this composition, we can change its behaviour even at runtime. So our weapons behaviours become flexible and it decreases our maintenance burden.
