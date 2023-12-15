.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 0
istore 2


ldc 3
invokestatic Linguine/factorial(I)I
istore 2

getstatic java/lang/System/out Ljava/io/PrintStream;
iload 2
invokevirtual java/io/PrintStream/println(I)V

return

.end method
.method public static factorial(I)I
.limit stack 100
.limit locals 100
iload 0
ldc 0
if_icmpeq L4
ldc 0
goto L5
L4:
ldc 1
L5:
ldc 1
if_icmpne L2
ldc 1
goto L1
L2:
iload 0
iload 0
ldc 1
isub
invokestatic Linguine/factorial(I)I
imul
L1:
ireturn
.end method
