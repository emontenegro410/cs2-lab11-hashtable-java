## Answers

## Try using a TreeMap and a HashMap instead of MyHashMap. Are the resulting word frequencies any different?

No, it is the same for TreeMap, Hashmap, and MyHashMap

## Is the time performance any different? If so, how would you rank the
three implementations (in increasing order of time complexity)?

Yes:
- MyHashMap (Fastest)
- HashMap
- TreeMap (Slowest)

## How are % and Math.floorMod different? Which works more reliably for computing a hash table index?

The difference is that % finds the exact mod without rounding.
Math.floorMod will round the number.
Math.floorMod is more reliable for a hashtable.

## What is the time complexity of MyHashMap.size(), and how could you make it much more efficient?

Time Complexity: O(n)
To make MyHashMap.size() more effective you could make the size an instance variable
and increment the value as you add items to the hashmap.

## How does this implementation compare to one where you would directly use your linked Node class from the earlier assignment? Answer briefly in terms of ease of implementation, correctness, reliability, and performance.

- Implementation: the linked Nodes are easier to implement
- Correctness: Both are the same correctness
- Reliability: They are both reliable
- Performance: MyHashMap is better