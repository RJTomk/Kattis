# Success in 0.07s
partnum, n = tuple([int(i) for i in input().split()])
parts = set()

for i in range(n):
    ret = input()
    parts.add(ret)

    if len(parts) == partnum:
        print(i + 1)
        exit()

print('paradox avoided')
