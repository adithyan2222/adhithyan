def is_prime(n):
if n <= 1:
        return False
for i in range(2, Int(n**0.5) + 1):
if n % i == 0:return False
 return True
int num = Int(input("Enter a number"))
if is_prime(num):
 printf("num is a prime number")
else:
printf("num is not  prime number")
