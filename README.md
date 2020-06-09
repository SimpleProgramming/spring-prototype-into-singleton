# Injecting a Prototype Bean into a Singleton Bean and How to solve the problem

What happens when you inject a prototype bean inside a singleton bean? and how to solve the problem

Now if you ask question like can you tell me about the different scopes in spring, everyone will tell singleton, prototype, request, session, application, websocket  etc and thy will even given definitions of these scope

but you slightly tweak the question and ask them what exactly happens when you have that scenario… And being an interviewer myself, 9 in 10 candidates will not give the right answer. In some cases if the candidate is able to tell guess the answer, they will not be able to give a solution to the problem. 

alright, so  we all know the default scope in spring in singleton. that is the container creates a single instance of that bean, and for any number of requests spring is going to give the same object, which is actually cached in the container.

and what is prototype - every time it is requested, a different instance is returned from the container.

so what exactly happens when you inject two different scopes together. i.e prototype into singleton

both beans will be initialized only once, at the startup.. prototype will loose its actual behavioral property.

lets take a look at this using an example and what we will do also address this problem using different methodologies.

We will be fixing this problem with,
1. ApplicationContext
2. Method Injection (@Lookup)
3. Provider (JSR component)
4. ObjectFactory
