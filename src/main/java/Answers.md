## Answers

### Question: Discuss the differences among the results. Does the starting point make a difference?

The starting point does matter.

- `BreadthFirstIterator` and `DepthFirstIterator` will print the same results when starting at the same vertex.

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
- The results are different because Bolivia only has one edge. So when using Paraguay starts and `DepthFirstIterator` is used it will go Brazil second vs. Bolivia. <br>
| `BreadthFirstIterator`| `DepthFirstIterator` |
| -------- | -------    |
| Paraguay | Paraguay   |
| Bolivia  | Brazil     |
| Brazil   | Peru       |
| Peru     | Chile      |
| Chile    | Argentina  |
| Argentina| Bolivia    |


- `ClosestFirstIterator` will print the same result as `BreadthFirstIterator`.

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
- `RandomWalkIterator` will print the country names randomly without taking into consideration the starting point.


### Question: Give two or three examples of how/why a real-world map might require more than four colors.

If several countries share the same corner, then more than four colors need to be used. In addition, for visual purposes
different countries are shown in different colors not only in 4 colors.
