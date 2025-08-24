string = input("Enter the string: ").lower()

occur = {}

for char in string:
    if char in occur:
        occur[char]+=1
    else:
        occur[char]=1

sorted_by_char = dict(sorted(occur.items(), key=lambda item: item[1]))
print("Occurence of characters: ")
for char, count in sorted_by_char.items():
    print(char,":",count)