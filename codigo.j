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

ldc 0
istore 11
L9:
iload 11
ldc 10
if_icmplt L12
ldc 0
goto L13
L12:
ldc 1
L13:
ldc 1
if_icmpne L10
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 11
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "hola"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 16
L14:
iload 16
ldc 10
if_icmplt L17
ldc 0
goto L18
L17:
ldc 1
L18:
ldc 1
if_icmpne L15
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 16
invokevirtual java/io/PrintStream/println(I)V
iload 16
ldc 1
iadd
istore 16
goto L14
L15:
iload 11
ldc 1
iadd
istore 11
goto L9
L10:

return

.end method