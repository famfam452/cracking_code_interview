# Loop detection

##### Given a circular likned list, implement an algorithm that returns the node at the beginning of the loop.
#### DEFINITION
##### Circular linked list: A (corrupt) linked list in which a node's next pointer points to an earlier node, so as to make a loop in the linked list.
#### Example
##### Input: A->B->C->D->E->C [the same C as earlier]
##### Output: C

## Solutuion
- Fast and slow 2p moves, when meet collision spot, restart slow node, when meet collsion again then return second collsion node

## Ideas
- slow takes k to loop portal spot (fast already taking 2k) => fast will take (LOOP_SIZE - k) to meet portal that is behind slow node => next (LOOP_SIZE - k) of slow move will be collision spot
- from collsion spot fast starts to move slow (1 step) will take k step to portal again
