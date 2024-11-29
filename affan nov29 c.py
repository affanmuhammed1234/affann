num=int(input("Enter a number"))
def recursive_factorial(num):
    if num==1:
        return 1
    else:
        return num*recursive_factorial(num-1)
print(recursive_factorial(num))