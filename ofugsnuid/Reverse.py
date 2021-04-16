# Success in 0.18s

n = int(input())

l = []
for i in range(n):
    l.append(input())

l2 = l[::-1]
for i in range(n):
    print(l2[i])
