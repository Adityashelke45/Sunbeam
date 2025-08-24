# Q1. Write a program to input n numbers on command line argument and calculate maximum of them.

n = int(input("Enter the length: "))
list = []
for i in range(n):
    a = int(input("Enter the numbers: "))
    list.append(a)

#list.sort(reverse = True)
list.sort()
print("Maximum number is: ",list[-1])