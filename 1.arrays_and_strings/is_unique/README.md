# Is Unique

## Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

### Solution

Use list of character boolean check flag (for ASCII characters)
- Time complexity = O(n) => Can be O(1) since it is ASCII
- Space complexity = O(1) => list of constant characters (128)

### Ideas

- Assuming that, Is the string ASCII, extended ASCII or Unicode String
- ASCII has 128 characters (2^7), Extended ASCII has 256 characters (2^8)
- Unicode is for special characters and languages
- Reduce boolean check flag space by using bit vector for assumtion with all characters are a - z
- Brute force with zero addtional data has O(n^2) time complexity
- If we can edit input use sorting to sort characters of string and check near duplicate characters (O(nlogn))