# Palindrome Permutation

## Given a string, write a function to check if it is a permutation of a palindrome. A palindrome is a word or phrase that is the same forwards and backwards. A permutation is a rearrangement of letters. The palindrome does not need to be limited to just dictionary words.
##### EXAMPLE
Input: Tact Coa

Output: True (permutations: "taco cat", "atco cta", etc.)

### Solution
- Count number of characters to hash, and check that hash Does it has just one or zero of a character's number
- Add or substract just odd number of characters and check if odd has 0 or 1 then is true
- using bit vector : toggle in or out for the index, and check one bit set
### Ideas
- one bit set means a bit vector that has only 1 value in just 1 bit for example 0001, 0010, 0100 not 0110, 0011
- bit vector visualizes concept of storing data in binary 
- one bit set AND with it sub straction is alway 0

