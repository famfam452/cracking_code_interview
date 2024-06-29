class MyLinkedList:
    def __init__(self, value, nextnode):
        self.value = value
        self.nextnode = nextnode
        
    def append(self, value):
        self.nextnode = MyLinkedList(value, self.nextnode)
        return self

def delete_node(head: MyLinkedList, node: MyLinkedList):
    if head == None or node == None:
        return head
    
    pointer = head
    while pointer != None:
        if pointer.nextnode == node:
            pointer.nextnode = pointer.nextnode.nextnode
            return head
        pointer = pointer.nextnode
    return head

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
        
        
if __name__ == '__main__':
    print("start")
    my_linked = create_linked_list_from_array_list([1,2,3,4,5])
    print_linked_list(my_linked)
    my_linked = delete_node(my_linked, my_linked.nextnode.nextnode.nextnode)
    print_linked_list(my_linked)

    