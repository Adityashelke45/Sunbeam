# Q2. Write a program to calculate a Factorial of a number.

n = int(input("Enter the number: "))
m = n
fact =1
# while n>0:
#     fact = fact * n
#     n = n-1

for i in range(1,n+1):
    fact = fact * i
print("Factorial of",m ,"is: ",fact) 