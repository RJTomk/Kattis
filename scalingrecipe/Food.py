from sre_constants import SUCCESS


# Success in 0.04s
n, ini, new = tuple(int(i) for i in input().split())
fac = new/ini

for i in range(n):
    print(round(fac * int(input())))