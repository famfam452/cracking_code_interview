def permutation_of_palindrome_table_end_check(inpt: str) -> bool:
    table_flag = [0] * 26
    for s in inpt:
        index: int = get_index_of_character(s)
        if index != -1:
            table_flag[index] += 1 
    return check_one_or_zero_odd_number(table_flag)

def permutation_of_palindrome_table_no_end_check(inpt: str) -> bool:
    table_flag = [0] * 26
    odd_count = 0
    for s in inpt:
        index: int = get_index_of_character(s)
        if index != -1:
            table_flag[index] += 1
            if table_flag[index] % 2 != 0:
                odd_count += 1
            else:
                if odd_count > 0:
                    odd_count -= 1
    return odd_count <= 1

def permutation_of_palindrome_bit_vector(inpt: str) -> bool:
    bit_vector = 0
    for s in inpt:
        index: int = get_index_of_character(s)
        bit_vector = toggle_bit(bit_vector, index)
    return check_one_bit_set(bit_vector)
        
def toggle_bit(bit_vector:int, index: int) -> int:
    if index != -1:
        mask = 1 << index
        if bit_vector & mask == 0:
            bit_vector |= mask
        else:
            bit_vector &= ~mask
    return bit_vector
    
def check_one_bit_set(bit_vector: int) -> bool:
    return bit_vector & (bit_vector - 1) == 0
def get_index_of_character(c:chr) -> int:
    if ord('Z') >= ord(c) >= ord('A'):
        return ord(c) - ord('A')
    elif ord('z') >= ord(c) >= ord('a'):
        return ord(c) - ord('a')
    return -1

def check_one_or_zero_odd_number(table: [int]) -> bool:
    has_odd = False
    for i in table:
        if i % 2 != 0 and has_odd:
            return False
        elif i % 2 != 0:
            has_odd = True
    return True
            
            


if __name__ == '__main__':
    print(permutation_of_palindrome_table_end_check("aabbcc"))
    print(permutation_of_palindrome_table_end_check("aabbcco"))
    print(permutation_of_palindrome_table_end_check("aabbccod"))
    print(permutation_of_palindrome_table_no_end_check("aabbcc"))
    print(permutation_of_palindrome_table_no_end_check("aabbcco"))
    print(permutation_of_palindrome_table_no_end_check("aabbccod"))
    print(permutation_of_palindrome_bit_vector("aabbcc"))
    print(permutation_of_palindrome_bit_vector("aabbcco"))
    print(permutation_of_palindrome_bit_vector("aabbccod"))