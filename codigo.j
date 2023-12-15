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
if_icmpgt L9
ldc 0
goto L10
L9:
ldc 1
L10:
ldc 1
if_icmpne L7
ldc 0
istore 2
goto L5
L7:
iload 1
ldc 6
if_icmpgt L11
ldc 0
goto L12
L11:
ldc 1
L12:
ldc 1
if_icmpne L8
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "bucle medio"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L5
L8:
iload 1
ldc 3
if_icmpgt L13
ldc 0
goto L14
L13:
ldc 1
L14:
ldc 1
if_icmpne L6
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "bucle medio medio"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
goto L5
L6:
getstatic java/lang/System/out Ljava/io/PrintStream;
ldc "bucle sigue"
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
L5:
goto L3
L4:

ldc "hola"
astore 15

ldc 0
istore 18
L16:
iload 18
ldc 10
if_icmplt L19
ldc 0
goto L20
L19:
ldc 1
L20:
ldc 1
if_icmpne L17
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 18
invokevirtual java/io/PrintStream/println(I)V
getstatic java/lang/System/out Ljava/io/PrintStream;
aload 15
invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
ldc 0
istore 23
L21:
iload 23
ldc 5
if_icmplt L24
ldc 0
goto L25
L24:
ldc 1
L25:
ldc 1
if_icmpne L22
getstatic java/lang/System/out Ljava/io/PrintStream;
iload 23
invokevirtual java/io/PrintStream/println(I)V
iload 23
ldc 1
iadd
istore 23
goto L21
L22:
iload 18
ldc 1
iadd
istore 18
goto L16
L17:

ldc 0
istore 1

ldc 0
istore 26

iload 1
ldc 0
if_icmpgt L29
ldc 0
goto L30
L29:
ldc 1
L30:
ldc 1
if_icmpne L28
ldc 1
goto L27
L28:
ldc 2
L27:
istore 26

getstatic java/lang/System/out Ljava/io/PrintStream;
iload 26
invokevirtual java/io/PrintStream/println(I)V

ldc 2
istore 1

L33:
iload 1
ldc 1
if_icmpne L34
ldc "One"
goto L31
L34:
iload 1
ldc 2
if_icmpne L35
ldc "Two"
goto L31
L35:
ldc "Other"
L31:
istore 1

getstatic java/lang/System/out Ljava/io/PrintStream;
iload 1
invokevirtual java/io/PrintStream/println(I)V

return

.end method