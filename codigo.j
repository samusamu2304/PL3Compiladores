.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 0
istore 3
L1:
iload 3
ldc 10
if_icmplt L4
ldc 0
goto L5
L4:
ldc 1
L5:
ldc 1
if_icmpne L2
ldc 0
istore 8
L6:
iload 8
ldc 10
if_icmplt L9
ldc 0
goto L10
L9:
ldc 1
L10:
ldc 1
if_icmpne L7
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 3
iload 8
iadd
invokevirtual java/io/PrintStream/println(I)V
iload 8
ldc 1
iadd
istore 8
goto L6
L7:
iload 3
ldc 1
iadd
istore 3
goto L1
L2:

return

.end method