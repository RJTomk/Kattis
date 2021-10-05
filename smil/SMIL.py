# Success in 0.06s
small = [':)', ';)']
big = [':-)', ';-)']

line = input()

for i in range(len(line)):
    if line[i:i+2] in small or line[i:i+3] in big:
        print(i)