string = input("Enter the string: ")

upper_count = 0
lower_count = 0
digit_count = 0
other_count = 0

for char in string:
    if char.isupper():
        upper_count+=1
    elif char.islower():
        lower_count+=1
    elif char.isdigit():
        digit_count+=1
    else:
        other_count+=1

print("Uppercase characters count: ",upper_count)
print("Lowercase characters count: ",lower_count)
print("Digit count: ",digit_count)
print("Other characters count: ",other_count)