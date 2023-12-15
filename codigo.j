.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

   ldc "hola"
   invokestatic Linguine/replaceChar(Ljava/lang/String;II)Ljava/lang/String;

return

.end method

.method public static replaceChar(Ljava/lang/String;II)Ljava/lang/String;
.limit locals 4
.limit stack 4

aload_0         ; Load reference to the string
iload_1         ; Load the index
iload_2         ; Load the character

invokestatic java/lang/String/valueOf(I)Ljava/lang/String;

invokevirtual java/lang/String.substring(I)Ljava/lang/String;
invokevirtual java/lang/String.concat(Ljava/lang/String;)Ljava/lang/String;

aload_0
iload_1
iconst_1
iadd
invokevirtual java/lang/String.substring(I)Ljava/lang/String;

invokevirtual java/lang/String.concat(Ljava/lang/String;)Ljava/lang/String;

areturn
.end method
