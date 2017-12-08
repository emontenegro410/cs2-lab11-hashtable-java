## Answers

### Question: Discuss the differences among the results. Does the starting point make a difference?

- 1. `BreadthFirstIterator` and `DepthFirstIterator` will print the same results when starting at the same vertex.

### Starting with "Bolivia"
| `BreadthFirstIterator`| `DepthFirstIterator` |
| -------- | ------- |
| Bolivia  | Bolivia |
| Paraguay | Paraguay|
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|


### Starting with "Paraguay"
| `BreadthFirstIterator`| `DepthFirstIterator` |
| -------- | -------    |
| Paraguay | Paraguay   |
| Bolivia  | Brazil     |
| Brazil   | Peru       |
| Peru     | Chile      |
| Chile    | Argentina  |
| Argentina| Bolivia    |


- 2. `ClosestFirstIterator` will print the same result as `BreadthFirstIterator`.

### Starting with "Bolivia"
| `BreadthFirstIterator`| `ClosestFirstIterator` |
| -------- | ------- |
| Bolivia  | Bolivia |
| Paraguay | Paraguay|
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|


### Starting with "Paraguay"
| `BreadthFirstIterator`| `ClosestFirstIterator` |
| -------- | ------- |
| Paraguay | Paraguay|
| Bolivia  | Bolivia |
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|

<br>
3. `RandomWalkIterator` will print the country names randomly without taking into consideration the starting point.



### Question: Give two or three examples of how/why a real-world map might require more than four colors.

