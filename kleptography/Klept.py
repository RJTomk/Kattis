input()
a_string = input()
b_string = input()

s = len(b_string) - len(a_string)
cor_list = []
a = ord('a')

for i in range(0, len(a_string)):
    n = (ord(b_string[s+i]) - a) - (ord(a_string[i]) - a)
    n += 26 if n < 0 else 0
    cor_list.append(n)

j = len(a_string) - 1
cor_str = [None for i in range(len(b_string))]

for i in range(len(b_string) - 1, -1, -1):
    n = (ord(b_string[i]) - a) - cor_list[j]
    n += 26 if n < 0 else 0
    cor_str[i] = chr(n)

    if j == 0:
        j = len(a_string) - 1
    else:
        j -= 1

print(str(cor_str))
