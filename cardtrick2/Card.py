# Success in 0.02s
n = int(input())

while n > 0:
    n -= 1
    size = int(input())
    deck = []

    for i in range(size, 0, -1):
        deck.insert(0, i)

        for j in range(0, i):
            deck.insert(0, deck.pop())

    out = ''
    for i in deck:
        out += '{} '.format(i)

    print(out)
