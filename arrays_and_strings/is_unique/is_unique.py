
# Bruteforce => Time complexit O(n^2)
def is_unique_string_bruteforce(input_string: str) -> bool:
    for current_index, current_val in enumerate(input_string):
        for indx in range(len(input_string) - current_index - 1):
            if current_val == input_string[current_index + indx + 1]:
                return False
    return True
        
def is_unique_ascii_regular(input_string: str) -> bool:
    if len(input_string) > 128:
        return False
    ascii_flag = [0] * 128
    for current in input_string:
        if ascii_flag[ord(current)] == 1:
            return False
        ascii_flag[ord(current)] = 1
    return True

def is_unique_ascii_extended(input_string: str) -> bool:
    if len(input_string) > 256:
        return False
    ascii_flag = [0] * 256
    for current in input_string:
        if ascii_flag[ord(current)] == 1:
            return False
        ascii_flag[ord(current)] = 1
    return True

def is_unique_ascii_vector_bit(input_string: str) -> bool:
    flag_checker = 0
    for current in input_string:
        val = ord(current) - ord('a')
        if (flag_checker & (1 << val)) > 0:
            return False
        flag_checker |= 1 << val
    return True
    
def is_unique_unicode(input_string: str) -> bool:
    sorted_inp_str = sorted(input_string)
    for i in range(len(sorted_inp_str) -1):
        if sorted_inp_str[i] == sorted_inp_str[i+1]:
            return False
    return True
    
if __name__ == '__main__':
    input_test = "ascs"
    print("is_unique_string_bruteforce is ", is_unique_string_bruteforce(input_test))
    print("is_unique_ascii_regular is ", is_unique_ascii_regular(input_test))
    print("is_unique_ascii_extended is ", is_unique_ascii_extended(input_test))
    print("is_unique_ascii_vector_bit is ", is_unique_ascii_vector_bit(input_test))
    print("is_unique_unicode is ", is_unique_unicode(input_test))
