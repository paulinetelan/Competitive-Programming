# Kattis id: plantingtrees

num_trees = input()
# convert string list into int list
trees = map(int, input().split(" "))
# sort list in descending order
trees = sorted(trees, key=int, reverse=True)

prev = trees[0] + 2

if (len(trees) > 1):

    # start with second largest tree
    for x in range(1, len(trees)):
        current = trees[x]
        if (current + 2 + x) > prev:
            prev += (current + 2 + x) - prev
        

print(prev)