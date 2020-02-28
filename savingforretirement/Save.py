# Success in 0.05s

from math import floor

nums = [int(i) for i in input().split(' ')]
bval = (nums[1] - nums[0]) * nums[2]
length = floor(bval / nums[4]) + 1

print(nums[3] + length)
