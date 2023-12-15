.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 6
invokestatic Linguine/fib(I)I
istore 1

return

.end method
.method public static fib(I)I
.limit stack 100
.limit locals 100
L3:
iload 0
ldc 0
if_icmpne L4
ldc 0
goto L1
L4:
iload 0
ldc 1
if_icmpne L5
ldc 1
goto L1
L5:
iload 0
ldc 1
isub
invokestatic Linguine/fib(I)I
iload 0
ldc 2
isub
invokestatic Linguine/fib(I)I
iadd
L1:
ireturn
.end method
