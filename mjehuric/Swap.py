# Succeeded in 0.05s


def properprint(nums):
    ret = ''
    for num in nums:
        ret += str(num) + ' '
    print(ret.strip())


nums = [int(i) for i in input().split(' ')]

while nums != [1, 2, 3, 4, 5]:
    for i in range(len(nums) - 1):
        if nums[i] > nums[i + 1]:
            temp = nums[i]
            nums[i] = nums[i + 1]
            nums[i + 1] = temp

            properprint(nums)
