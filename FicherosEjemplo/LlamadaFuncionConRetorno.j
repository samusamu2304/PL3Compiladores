.class public LlamadaFuncionConRetorno
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 4

    ; Parámetros para la función sumar
    ldc 5
    istore_1

    ldc 7
    istore_2

    ; Llamada a la función sumar y almacenar el resultado
    iload_1
    iload_2
    invokestatic LlamadaFuncionConRetorno/sumar(II)I
    istore_3

    ; Mostrar el resultado por pantalla
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_3
    invokevirtual java/io/PrintStream/print(I)V

    ; Salto de línea
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "\n"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    return
.end method
.method public static sumar(II)I
    .limit stack 2
    .limit locals 2

    ; Parámetros de la función
    iload_0
    iload_1

    ; Operación de suma
    iadd

    ; Devolver el resultado
    ireturn
.end method
