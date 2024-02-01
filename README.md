# Museum-Visit
You want to visit M museums of the city you live by following the N undirected roads connect these museums. However, you have a limited time to visit all the museums so you want to visit them in minimum time. You can pick any museum as the starting point of your journey.Let’s say your current position is C. Then you can move to any adjacent museum of C, but it costs your time equal to the weight of the museum. You will continue the above moves until you visit all the museums. Calculate the minimum time to visit all the museums in the city when you can choose any museum as your starting point.

In the input, the first line contains 2 space separated integers, M and N. M denotes the number of museums in the city and N denotes the number of roads connect these museums. Next N lines contains two space separated integers each, U and V denoting that there is an undirected road between museum U and museum V.

In the sample input, it is given that we have 4 museums and 3 undirected roads between them. The next lines give the connections between the museums.

Sample Input:

4 3

1 2 1

2 3 2

2 4 3

In the output, first line print an integer T, denoting the minimum time to visit all museums in the city. And the next line gives the track you need to follow to visit all museums. If you cannot visit all the museums in the city by starting any point, you need to print -1.

The output for the above input is as follows. Please check your program with this input as well as the others that you will create. Please note that we may use other input when grading your assignments.

Sample Output:

7

4 2 1 2 3
