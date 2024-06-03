# Rotate matrix
#### Given an image represented by an N matrix, where each pixel in the image is 4 bytes,write a method to rotate the image by 90 degrees. Can you do this in place?
## Solution
- Iterate by layers and within a layer iterate by offset saving top and rotating left -> top -> right -> bottom -> left
## Ideas
- N matrix size = n*n
- Number of layer (L) = number of matrix length (n) / 2
- OFSs = ?

4(n) * 4(n) = 16 (N)
6(n) * 6(n) = 36 (N)

    0,0 0,1 0,2 0,3 0,4 0,5 -> 5,0 4,0 3,0 2,0 1,0 0,0
    1,0 1,1 1,2 1,3 1,4 1,5 -> 5,1 4,1 3,1 2,1 1,1 0,1
    2,0 2,1 2,2 2,3 2,4 2,5 -> 5,2 4,2 3,2 2,2 1,2 0,2
    3,0 3,1 3,2 3,3 3,4 3,5 -> 5,3 4,3 3,3 2,3 1,3 0,3
    4,0 4,1 4,2 4,3 4,4 4,5 -> 5,4 4,4 3,4 2,4 1,4 0,4
    5,0 5,1 5,2 5,3 5,4 5,5 -> 5,5 4,5 3,5 2,5 1,5 0,5 

layer 0 => 5 Offsets
layer 1 => 3 offsets
layer 2 => 1 offsets

Ls = n/2
OFSs = n - 1 - 2L

    n = 6
    L => 0 , OFSs => 5:
        OFS = 0 => 0,0 -> 0,5 -> 5,5 -> 5,0 -> 0,0
        OFS = 1 => 0,1 -> 1,5 -> 5,4 -> 4,0 -> 0,1
        OFS = 2 => 0,2 -> 2,5 -> 5,3 -> 3,0 -> 0,2
        OFS = 3 => 0,3 -> 3,5 -> 5,2 -> 2,0 -> 0,3
        OFS = 4 => 0,4 -> 4,5 -> 5,1 -> 1,0 -> 0,4
    L => 1 , OFSs => 3:
        OFS = 0 => 1,1 -> 1,4 -> 4,4 -> 4,1 -> 1,1
        OFS = 1 => 1,2 -> 2,4 -> 4,3 -> 3,1 -> 1,2
        OFS = 2 => 1,3 -> 3,4 -> 4,2 -> 2,1 -> 1,3
    L => 2 , OFSs => 1:
        OFS = 0 => 2,2 -> 2,3 -> 3,3 -> 3,2 -> 2,2

(L, OFS + L) -> (DFS + L, OFSs + L) -> (OFSs + L, L) -> (L, OFS + L)