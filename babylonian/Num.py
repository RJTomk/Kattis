# Success in 0.02s

def toInt(s):
    return 0 if s == '' else int(s)


n = int(input())
for k in range(n):
    vals = input().split(',')

    i = 0
    num = 0
    for j in range(len(vals) - 1,  - 1, -1):
        num += toInt(vals[j]) * (60 ** i)
        i += 1

    print(num)
