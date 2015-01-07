Intention-revealing interfaces [Evans03] to access common Java system properties,
such as current working directory, user name and home directory or
system file encoding.

While just a simple, typed wrapper I found that these classes make
it easier to write *nix style tools or desktop applications correctly
*from the beginning* instead of quickly hard-coding directories like 
"/home/johnboy/temp".

Q&A

Q: Why are the services stateful? Everything is supposed to be stateless
   because of performance and because it is easier to use and state is
   generally evil.
A: See [Meyer98], chapter 23 "Principles of Class Design". I found it
   useful this way.

References:

[Meyer98]       Meyer, Bertrand: "Object-Oriented Software Construction", 
                2nd edition, Prentice Hall, 1998.
[Evans03]		Evans, Eric: "Domain-Driven Design. Tackling complexity
                in the heart of software", Addison Wesley, 2003
