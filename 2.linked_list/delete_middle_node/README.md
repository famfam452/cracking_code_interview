# Delete middle node

##### Implement an algorithm to delete a node in the middle (i.e, any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.
#### EXAMPLE
##### Input : the node c from linked list a->b->c->d->e->f
##### Result : nothing is returned, but new linked list looks like a->b->d->e->f

## Solution
- Assign node to next node (check is the node is last or null node)