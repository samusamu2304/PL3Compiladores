.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 0
istore 4
L1:
iload 4
ldc 10
if_icmplt L6
ldc 0
goto L7
L6:
ldc 1
L7:
ldc 1
if_icmpne L2
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 4
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "hola"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 11
L8:
iload 11
ldc 10
if_icmplt L13
ldc 0
goto L14
L13:
ldc 1
L14:
ldc 1
if_icmpne L9
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 11
invokevirtual java/io/PrintStream/println(I)V
iload 11
ldc 1
iadd
istore 11
goto L8
L9:
iload 4
ldc 1
iadd
istore 4
goto L1
L2:

return

.end method
