class Node:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def constructLL(arr: [int]) -> Node:
    # Write your code here
    if not arr:
        return None
    head = cur = Node(val=arr[0])
    for element in arr[1:]:
        cur.next = Node(val=element)
        cur = cur.next
    return head

arr = [4, 2, 1, 5]
linked_list_head = constructLL(arr)
# Printing the linked list elements
current_node = linked_list_head
while current_node:
    print(current_node.val, end=" -> ")
    current_node = current_node.next
print("None")