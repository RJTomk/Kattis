# Success in 0.19s
N = int(input())
TB, LR = 0, 0

for i in range(N):
    line = [int(i) for i in input()]

    TB += (1 if line[0] == 0 else 0) + (1 if line[1] == 0 else 0)
    LR += (1 if line[2] == 0 else 0) + (1 if line[3] == 0 else 0)


N = int((TB if TB < LR else LR) / 2)

TB -= N * 2
LR -= N * 2

print("{} {} {}".format(N, TB, LR))
