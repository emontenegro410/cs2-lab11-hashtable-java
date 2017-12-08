## Answers

### Question: Discuss the differences among the results. Does the starting point make a difference?

- `BreadthFirstIterator` and `DepthFirstIterator` will print the same results when starting at the same vertex.

- Start with "Bolivia" <br>

| `BreadthFirstIterator`| `DepthFirstIterator` |
| -------- | ------- |
| Bolivia  | Bolivia |
| Paraguay | Paraguay|
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|


- Starting with "Paraguay" <br>

| `BreadthFirstIterator`| `DepthFirstIterator` |
| -------- | -------    |
| Paraguay | Paraguay   |
| Bolivia  | Brazil     |
| Brazil   | Peru       |
| Peru     | Chile      |
| Chile    | Argentina  |
| Argentina| Bolivia    |


2. `ClosestFirstIterator` will print the same result with `BreadthFirstIterator`.<br>

- Starting with "Bolivia" <br>

| `BreadthFirstIterator`| `ClosestFirstIterator` |
| -------- | ------- |
| Bolivia  | Bolivia |
| Paraguay | Paraguay|
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|


- Starting with "Paraguay" <br>

| `BreadthFirstIterator`| `ClosestFirstIterator` |
| -------- | ------- |
| Paraguay | Paraguay|
| Bolivia  | Bolivia |
| Brazil   | Brazil  |
| Peru     | Peru    |
| Chile    | Chile   |
| Argentina|Argentina|

3. `RandomWalkIterator` will print the country names randomly without taking into consideration the starting point.




### Question: Give two or three examples of how/why a real-world map might require more than four colors.

