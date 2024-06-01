# URLify

## Write a method to replace all spaces in a string with %20: You may assume that the string has sufficient space at the end to hold the additional characters, and that you are given the "true" length of the string. (Note: if implementing in Java, please use a character array so that you can perform this operation in place.)

### Solution
- To find the final length the result index_final = number of charactors + space + 2*space = true length + 2*space
- To find number of space find by count space in true length
- Move charators start with the end of true length to end of index_final