# Success in 0.06
wc, hc, ws, hs = tuple([int(i) for i in input().split()])

if wc - ws < 2:
    print(0)
    exit()
if hc - hs < 2:
    print(0)
    exit()

print(1)
