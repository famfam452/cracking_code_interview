# Check Permutation

## Given two strings, write a method ot decide if one is a permutation of the other.

### Solution
- Sort and compare O(nlogn) -> t
- Flag list of characters and counting O(n) -> t , + O(1) -> s 

### Ideas
- Example : abcd -> it's permutations are acbd, acdb, abdc, adcd, adbc, badc, bacd, bcad, bcda, bdac, bdca, cadb, cabd, cbda, cdba, cbad, cdab, dacb, dabc, dbac, dbca, dcab, dcba
- Is case sensitive and space significant?
