# Palindrome

##### Implement a function to check if a linked list is a palindrome

## Solution
- Reverse and compare, reverse and clone then compare
- fast slow -> store slow to stack (having haft of linked list) -> pop stack compare with the rest of slow
- recersive => each recer pass head's next and length - 2 -> if meet 0,1 return result = true and end node ->
check result of each recur head data = result node data -> return corresponding node 