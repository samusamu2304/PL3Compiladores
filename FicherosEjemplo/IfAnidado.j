.class public IfAnidado
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 2

    ; Primer número (puedes cambiar el valor aquí)
    ldc 5
    istore_0

    ; Segundo número (puedes cambiar el valor aquí)
    ldc 7
    istore_1

    ; Realizar comparaciones y mostrar mensajes
    iload_0
    iload_1
    if_icmpne noSonIguales

    ; Si los números son iguales
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Los números son iguales"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin

noSonIguales:
    ; Si los números no son iguales
    iload_0
    iload_1
    if_icmpgt primeroEsMayor

    ; Si el primer número es menor que el segundo
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El primer número es menor que el segundo"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
    goto fin

primeroEsMayor:
    ; Si el primer número es mayor que el segundo
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "El primer número es mayor que el segundo"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

fin:
    return
.end method
