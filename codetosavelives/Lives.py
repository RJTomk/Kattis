# Success in 0.04s
n = int(input())

def ptn(l):
    v = 0
    for i in range(len(l)):
        v += l[len(l) - i - 1] * (10 ** i)
    return v

for i in range(n):
    n1 = ptn([int(i) for i in input().split()])
    n2 = ptn([int(i) for i in input().split()])

    sol = n1 + n2
    ans = ''

    while sol > 0:
        dif = sol % 10
        ans = f'{int(dif)} {ans}'
        sol -= dif
        sol /= 10
    print(ans)

