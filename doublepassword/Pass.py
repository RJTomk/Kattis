# Success in 0.04s

pass_1, pass_2 = input(), input()

combs = 1

for i in range(4):
    if pass_1[i] != pass_2[i]:
        combs *= 2

print(combs)