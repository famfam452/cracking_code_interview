# String compression

### Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabccccaaa would become a2b1c5a3. if the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z).

## Solution
- iterate to count duplicated characters and check if the next of current one is not the same then re-count and build new result
## Ideas
- Using springBuilder instead of adding immutable string
- SpringBuilder with fixing declared capacity illuminates size expansion process

