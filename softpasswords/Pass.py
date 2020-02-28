# Success in 0.05s

S = input()
P = input()


def pre():
    for i in range(10):
        if (str(i) + P) == S:
            return True
    return False


def app():
    for i in range(10):
        if (P + str(i)) == S:
            return True
    return False


works = (S == P) or pre() or app() or (S == P.swapcase())
print('Yes' if works else 'No')
