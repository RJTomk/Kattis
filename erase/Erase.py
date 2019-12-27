def stringSwapper(l):
    ret_string = ''
    for i in range(len(l)):
        if l[i] == '0':
            ret_string += '1'
        else:
            ret_string += '0'
    return ret_string


n = int(input())

l1 = input()
l2 = input()

if n % 2 == 0:  # Same string
    if l1 == l2:
        print('Deletion succeeded')
    else:
        print('Deletion failed')
else:
    if stringSwapper(l1) == l2:
        print('Deletion succeeded')
    else:
        print('Deletion failed')
