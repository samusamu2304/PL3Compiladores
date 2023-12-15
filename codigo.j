.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc 0
istore 1

ldc 1
istore 2

L3:
iload 2
ldc 1
if_icmpne L4
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V
iload 1
ldc 1
iadd
istore 1
iload 1
ldc 10
if_icmpgt L5
ldc 0
goto L6
L5:
ldc 1
L6:
ifeq L7
ldc 0
istore 2
goto L8
L7:
L8:
goto L3
L4:

ldc "hola"
astore 9

ldc 0
istore 12
L10:
iload 12
ldc 10
if_icmplt L13
ldc 0
goto L14
L13:
ldc 1
L14:
ldc 1
if_icmpne L11
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 12
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 9
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 17
L15:
iload 17
ldc 5
if_icmplt L18
ldc 0
goto L19
L18:
ldc 1
L19:
ldc 1
if_icmpne L16
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 17
invokevirtual java/io/PrintStream/println(I)V
iload 17
ldc 1
iadd
istore 17
goto L15
L16:
iload 12
ldc 1
iadd
istore 12
goto L10
L11:

return

.end method