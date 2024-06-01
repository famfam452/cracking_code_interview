def check_permutation_sorting(string_1: str, string_2: str):
    if len(string_1) != len(string_2):
        return False
    sorted_string_1 = sorted(string_1)
    sorted_string_2 = sorted(string_2)
    for current_indx in range(len(sorted_string_1)):
        if sorted_string_1[current_indx] != sorted_string_2[current_indx]:
            return False
    return True

def check_permutation_char_flag(string_1: str, string_2: str):
    if len(string_1) != len(string_2):
        return False
    char_flags = [0] * 128
    for s1 in string_1:
        char_flags[ord(s1)] += 1
    for s2 in string_2:
        char_flags[ord(s2)] -= 1
        if char_flags[ord(s2)] < 0:
            return False
    return True
    
        

if __name__ == "__main__":
    test_val_1 = "abcs"
    test_val_2 = "bcass"
    print("check_permutation_sorting is ", check_permutation_sorting(test_val_1, test_val_2))
    print("check_permutation_char_flag is ", check_permutation_char_flag(test_val_1, test_val_2))