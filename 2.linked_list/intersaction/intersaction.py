class MyLinkedList:
    def __init__(self, value, nextnode):
        self.value = value
        self.nextnode = nextnode
        
    def append(self, value):
        self.nextnode = MyLinkedList(value, self.nextnode)
        return self

def print_linked_list(node: MyLinkedList):
    while node != None:
        print(node.value)
        node = node.nextnode
        
def create_linked_list_from_array_list(array_list:[int]):
    if len(array_list) == 0:
        return MyLinkedList(None, None)
    head = MyLinkedList(array_list[0], None)
    pointer = head
    for v in array_list:
        pointer.append(v)
        pointer = pointer.nextnode
    head = head.nextnode
    return head

def build_intersact(head_linked_1: MyLinkedList, head_linked_2: MyLinkedList, duplicated_linked: MyLinkedList):
    p_linked_1 = head_linked_1
    p_linked_2 = head_linked_2
    while p_linked_1.nextnode != None:
        p_linked_1 = p_linked_1.nextnode
    while p_linked_2.nextnode != None:
        p_linked_2 = p_linked_2.nextnode
    p_linked_1.nextnode = duplicated_linked
    p_linked_2.nextnode = duplicated_linked
    
    return head_linked_1, head_linked_2
        
def find_intersaction(linked_1: MyLinkedList, linked_2: MyLinkedList):
    linked1_len = 0
    linked2_len = 0
    tail_1 = linked_1
    tail_2 = linked_2
    while tail_1.nextnode != None:
        tail_1 = tail_1.nextnode
        linked1_len += 1
    while tail_2.nextnode != None:
        tail_2 = tail_2.nextnode
        linked2_len += 1
    if tail_1 != tail_2:
        return None
    if linked1_len > linked2_len:
        i = linked1_len - linked2_len
        while i > 0:
            linked_1 = linked_1.nextnode
            i -= 1
    else:
        i = linked2_len - linked1_len
        while i > 0:
            linked_2 = linked_2.nextnode
            i -= 1
    
    while linked_1 != linked_2:
        linked_1 = linked_1.nextnode
        linked_2 = linked_2.nextnode
    return linked_1

if __name__ == '__main__':
    linked1 = create_linked_list_from_array_list([1, 2, 3])
    linked2 = create_linked_list_from_array_list([-1, -2, -3])
    linked3 = create_linked_list_from_array_list([4, 5, 6])
    linked1, linked2 = build_intersact(linked1, linked2, linked3)
    print_linked_list(linked1)
    print_linked_list(linked2)
    intersact = find_intersaction(linked1, linked2)
    print_linked_list(intersact)