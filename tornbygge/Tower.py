# Success in 0.07s

N = int(input())
nums = [int(i) for i in input().split()]
count = 1

for i in range(1, N):
    if nums[i] > nums[i-1]:
        count += 1

print(count)