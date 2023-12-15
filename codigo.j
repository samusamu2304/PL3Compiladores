.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 100
   .limit locals 100

ldc "Hola"
astore 1

ldc " mundo"
astore 2



return

.end method

.method public static concat(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
.limit stack 100
.limit locals 100
aload_0
aload_1
new java/lang/StringBuilder
dup
invokespecial java/lang/StringBuilder/<init>()V
aload_0
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
aload_1
invokevirtual java/lang/StringBuilder/append(Ljava/lang/String;)Ljava/lang/StringBuilder;
invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;
areturn
.end method
