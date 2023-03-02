# Success in 0.07s

N = int(input())

mat = [[int(i) for i in input().split()] for j in range(N)]
res = []

for i in range(N):
    for j in range(N):
        if mat[i][j] != -1:
            res.append("{} {} {}".format(i + 1, j + 1, mat[i][j]))

print(len(res))
for l in res:
    print(l)