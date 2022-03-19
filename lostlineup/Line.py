# Success in 0.06s
n = int(input())
queue = [[] for i in range(1, n)]

line = [int(x) for x in input().split()]
for i in range(n-1):
    queue[line[i]] = i + 2

s = '1'
for n in queue:
    s += f' {n}'
print(s)
