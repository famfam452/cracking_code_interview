# Remove dups

##### Write code to remove duplications from an unsorted linked list.
##### Follow up : How would you solve this problem if a temporary buffer is not allowed?

## Solution
- First solution with temp buffer is using hash to collect existing value and each iteration needs to check within hash if it contain then remove the node.
- Without hashing buffer, use two pointer to run n^2 iteration current for main iteration and runner for sub iteration