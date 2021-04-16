# Success in 0.07s

n: int = int(input())

if n % 2 == 1:
    print('still running')

else:
    tot: int = 0
    for i in range(n // 2):
        start = int(input())
        stop = int(input())

        tot += stop - start

    print(tot)
