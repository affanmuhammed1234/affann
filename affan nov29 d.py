def add(num1,num2):
    if num1==0:
        return num2
    elif num2==0:
        return num1
    else:
        return add(num1+1,num2-1)
num1=int(input("Enter fist number:"))
num2=int(input("Enter second number:"))
result=add(num1,num2)
print("The addition of two numbers is:",result)