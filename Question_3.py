# Q3. Write a program to calculate Fibonacci Series up to n numbers

n = int(input("Enter the number: "))
if(n==1):
    print(0)
else:
    print(0,"\n",1)
    i=2
    prev = 1
    curr = 1
    while i<n:
        curr = prev + curr
        prev = curr - prev
        print(curr)
        i = i + 1