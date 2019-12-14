# Success in 0.04s
numbers = [2, 22, 222, 3, 33, 333, 4, 44, 444, 5, 55, 555, 6, 66, 666, 7, 77, 777, 7777, 8, 88, 888, 9, 99, 999, 9999]


def getNum(letter):
    if letter == ' ':
        return '0'
    else:
        return str(numbers[ord(letter) - ord('a')])


n = int(input())

for i in range(1, n + 1):
    word = input()
    out = 'Case #{}: '.format(i)

    for letter in word:
        num = getNum(letter)
        if num[0] == out[-1]:
            out += ' {}'.format(num)
        else:
            out += num

    print(out)
