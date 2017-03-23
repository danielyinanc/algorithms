# Algorithms
While preparing for programming interviews, I discovered the wonderful world of algorithms. 
This is my attempt at adding material to a topic of great interest to all computer 
scientists and engineers.

What exactly is an Algorithm sounds like a philosophical one of little interest but actually
very critical in understanding how to approach algorithms. Algorithms are according to Wikipedia
"In mathematics and computer science, an algorithm is a self-contained sequence of actions to be performed" [1]
However that description sheds very little light as to why we use algorithms in the first place.
 
An algorithm is a mental construct designed to solve a well understood problem in a particular
way. An optimized algorithm in corollary is a type of mental construct that attempts to 
solve a well understood problem in the most efficient way in terms of space and time complxity.

Space and time complexity are the boundaries with which we will be comparing and contrasting
alternating solutions to well known problems.

Please not that all space complexity analysis below ignore inputs. 

## Algorithm Types
### Divide and Conquer (Recursive)
- Coin Change: An exponential time complexity O(2^N) with O(1) space complexity
### Greedy 
- Coin Change: A linear time and space complexity of O(n) where n is unique coin values. However note
 that greedy algorithm does NOT result in optimal coin values for certain coin values such as 6 or 7. 
### Dynamic Programming
- Coin Change: A linear time complexity O(n) with several space complexity implementations.
    * dynamicCoinChange has time and space complexity of O(a*k) where a is the amount and k is the number of coins
    * dynamicCoinChangeMemoryImprov has time complexity of O(a*k) and space complexity of O(a) where a is the amount and k is the number of coins

## Additional References
* School of Informatics, University of Edinburgh CS 1 Computer Programming 

References 
1 - https://en.wikipedia.org/wiki/Algorithm