# Success in 0.02s
hasOdd = False
hasEven = False

num = int(input())

for i in range(1, 101 - num):
    tot = sum([x for x in range(i, i + num)])

    if tot % 2 == 0:
        hasEven = True
    else:
        hasOdd = True

if hasEven and hasOdd:
    print('Either')
elif hasEven:
    print('Even')
else:
    print('Odd')
