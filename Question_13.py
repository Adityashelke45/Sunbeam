n = int(input("Enter the size of list: "))
list = []
for i in range(n):
    str = input("Enter the string: ")
    list.append(str)

duplicate = []
for name in list:
    if list.count(name)>1 and name not in duplicate:
        duplicate.append(name)

print("Duplicate strings are: ",duplicate)