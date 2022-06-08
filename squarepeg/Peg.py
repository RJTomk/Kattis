# Success in 0.04s
L,R = tuple([int(i) for i in input().split()])

print('fits' if (R * R * 2) >= L * L else 'nope')