# One way

### There are three types of edits that can be performed on strings: insert a characet, remove a character, or replace a character. Given two strings, write a function to check if they are one edit (or zero edits) away.
## Example
- #### pale, ple -> true
- #### pales, pale -> true
- #### pale, bale -> true
- #### pale, bae -> false

## Solution
- Check, length for considering to check a editing
- Merge Insert and Replace logic

## Ideas
- If length is equal it can be no edit or one replacement
- If lenghth is difference one length it can be one removal or one insertion
