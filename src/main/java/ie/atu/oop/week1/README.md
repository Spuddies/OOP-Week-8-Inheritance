## In your own words: which constructor initialises the common fields, and which initialises studentId?

The Ticket superclass constructor initialises the common fields (eventName, holderName and basePrice). The StudentTicket subclass constructor calls the superclass constructor using super() and then initialises its own studentId field using this.studentId.

This allows the subclass to reuse the existing constructor rather than repeating code.


## A student wants a VIP ticket and qualifies for the student discount. Does the current hierarchy support both behaviours easily? What limitation does this reveal about inheritance?
No, the current hierarchy does not easily support both behaviours because StudentTicket and VIPTicket are separate subclasses of Ticket. Java only allows a class to directly extend one superclass, meaning a new class cannot inherit directly from both StudentTicket and VIPTicket.