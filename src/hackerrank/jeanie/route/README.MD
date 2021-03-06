## Jeanie's Route

Byteland has N cities (numbered from 1 to N) and N-1 bidirectional roads. It is guaranteed that there is a route from any city to any other city.

Jeanie is a postal worker who must deliver K letters to various cities in Byteland. She can start and end her delivery route in any city. Given the destination cities for K letters and the definition of each road in Byteland, find and print the minimum distance Jeanie must travel to deliver all K letters.

Note: The letters can be delivered in any order.

##### Input Format
The first line contains two space-separated integers, N (the number of cities) and K (the number of letters), respectively.
The second line contains K space-separated integers describing the delivery city for each letter.
Each line i of the N-1 subsequent lines contains 3 space-separated integers describing a road as u<sub>i</sub> v<sub>i</sub> d<sub>i</sub>, where d<sub>i</sub> is the distance (length) of the bidirectional road between cities u<sub>i</sub> and v<sub>i</sub>.

##### Output format
Print the minimum distance Jeanie must travel to deliver all K letters.

##### Sample Input 0
```
5 3
1 3 4
1 2 1
2 3 2
2 4 2
3 5 3
```

##### Sample Output 0
```
6
```

##### Explanation 0
Jeanie has 3 letters she must deliver to cities 1, 3, and 4 in the following map of Byteland:

![jeanies-route.png](jeanies-route.png)

One of Jeanie's optimal routes is 3 -> 2 -> 1 -> 2 -> 4, for a total distanced traveled of 2 + 1 + 1 + 2 = 6. Thus, we print 6 on a new line.