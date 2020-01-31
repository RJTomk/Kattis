# Time Limit Exceeded

N = int(input())

letters = 'A'
for i in range(N):
    newStr = ''
    for j in range(len(letters)):
        newStr += 'B' if letters[j] == 'A' else 'BA'
    letters = newStr

a_count, b_count = 0, 0

for i in range(len(letters)):
    if letters[i] == 'A':
        a_count += 1
    else:
        b_count += 1

print('{} {}'.format(a_count, b_count))
