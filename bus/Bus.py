# Sucess in 0.05s
n = int(input())

for i in range(n):
    stop = int(input())
    npax = 1

    for j in range(stop - 1):
        npax += 0.5
        npax *= 2
    print(int(npax))