# Wrong answer

def get_char_val(character):
    return ord(character) - ord('a')


def get_lex_val(s):
    value = 0
    for character in s:
        value += get_char_val(character)
    return value


line = input().split(' ')
r, c = int(line[0]), int(line[1])

crossword = []
for i in range(r):
    crossword.append(input())

words = []

for x in range(r):
    word_x = ''
    for y in range(c):
        # X direction
        if x <= r and y <= c:
            if crossword[x][y] == '#':
                if len(word_x) >= 2:
                    words.append(word_x)
                word_x = ''
            else:
                word_x += crossword[x][y]

    if len(word_x) >= 2:
        words.append(word_x)

# Y direction
for y in range(c):
    word_y = ''
    for x in range(r):
        if crossword[x][y] == '#':
            if len(word_y) >= 2:
                words.append(word_y)
            word_y = ''
        else:
            word_y += crossword[x][y]

    if len(word_y) >= 2:
        words.append(word_y)

shortest_word, shortest_val = words[0], get_lex_val(words[0])
for word in words:
    val = get_lex_val(word)
    if val < shortest_val:
        shortest_word = word
        shortest_val = val

print(shortest_word)
