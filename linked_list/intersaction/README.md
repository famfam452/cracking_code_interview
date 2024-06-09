# Intersaction

##### Given two (singly) linked lists, determine if the two lists intersect. return the intersecting node. Note that the intersection is defined based on reference, not value. That is, if the kth node of the first linked list is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.

## Solution
- get length and tail of two linked list -> check tail if they are diff then return false -> find length diff and traverse the longer one (diff) times -> traverse util they are the same