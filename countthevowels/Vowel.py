# Success in 0.05s
vowels = ['a', 'e', 'i', 'o', 'u']

line = input().lower()
count = 0

for i in range(len(line)):
    count += 1 if line[i] in vowels else 0

print(count)
