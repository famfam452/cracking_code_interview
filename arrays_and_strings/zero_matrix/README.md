# Zero Matrix

##### Write an algorithm such that if an element in an MxN matrix is 0, its entire row and column are set to 0.


### Solution
 - Checking value in matrix O(NM) times
 - Mark number of column and row if its value is 0
 - Nullify value to 0 for all columns of the marked rows and all rows of the marked column
 - Mark columns and rows consume space O(N + M)
 - Using first row and first column as marker uses space 0(1) since the first row and first column that 0 value will always be marked as 0
 - Check 0 value of first row and column and flag it first and nullify later