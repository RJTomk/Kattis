# Success in 0.05s
def nums_from_input():
    return [int(i) for i in input().split()]


time, timemax, n = tuple(nums_from_input())
walks = nums_from_input()
rides = nums_from_input()
schedule = nums_from_input()

for i in range(n):
    time += walks[i]
    time += time % schedule[i]
    time += rides[i]

time += walks[-1]

print('yes' if time < timemax else 'no')