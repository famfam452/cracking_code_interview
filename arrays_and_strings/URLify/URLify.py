from typing import List


def URLify(inpt :str, true_length: int) -> str:
    text_list = str_to_array(inpt)
    space = 0
    for cou in range(true_length):
        if text_list[cou] == ' ':
            space+=1
    final_len = true_length + 2*space
    for id in reversed(range(true_length)):
        if text_list[id] == ' ':
            text_list[final_len - 1] = '0'
            text_list[final_len - 2] = '2'
            text_list[final_len - 3] = '%'
            final_len -= 3
        else:
            text_list[final_len - 1] = text_list[id]
            final_len -= 1
    return array_to_str(text_list)

def str_to_array(inpt: str) -> List[chr]:
    return [s for s in inpt]
def array_to_str(inpt: List[chr]) -> str:
    output = ""
    for i in inpt:
        output += i
    return output
         
if __name__ == "__main__":
    real_inp = "my name is tanakrit karaket        "
    print("URLify : ", URLify(real_inp, 26))