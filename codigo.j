.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100


ldc 1
ldc 8
ldc 2
isub
ldc 3
idiv
iadd
ldc 2
imul
ldc 2
iadd

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 1
ldc 8
ldc 2
isub
ldc 3
idiv
iadd
ldc 2
imul
ldc 2
isub
invokevirtual java/io/PrintStream/println(I)V


ldc 3
ldc 2
imul
ldc 2
imul

ldc 3

getstatic java/lang/System/out Ljava/io/PrintStream;
ldc 3
ldc 4
ldc 2
isub
if_icmplt L0
ldc 0
goto L1
L0:
ldc 1
L1:
invokevirtual java/io/PrintStream/println(I)V


ldc 3
ldc 2
if_icmpgt L3
ldc 0
goto L4
L3:
ldc 1
L4:
ldc 1
if_icmpne L5
ldc 2
istore_2
goto L6
L5:
ldc 3
istore_2
L6:

getstatic java/lang/System/out Ljava/io/PrintStream;
iload_2
invokevirtual java/io/PrintStream/println(I)V

return

.end method