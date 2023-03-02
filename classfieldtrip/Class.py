# Success in 0.05

l1 = [*input()]
l2 = [*input()]

res = ''

while len(l1) != 0 and len(l2) != 0:
    if l1[0] < l2[0]:
        res = '{}{}'.format(res, l1.pop(0))
    else:
        res = '{}{}'.format(res, l2.pop(0))

print('{}{}{}'.format(res, ''.join(l1), ''.join(l2)))