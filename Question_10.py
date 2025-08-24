n = int(input("Enter the size of list: "))
n = min(n,10)

list = []
for i in range(n):
    name = input("Enter the name: ")
    list.append(name)

list.sort()
print(list)