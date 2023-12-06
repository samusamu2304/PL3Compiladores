.class public LlamadaFuncionConParametro
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 3

    ; Parámetro para la función duplicar
    ldc 5
    istore_1

    ; Llamada a la función duplicar y almacenar el resultado
    iload_1
    invokestatic LlamadaFuncionConParametro/duplicar(I)I
    istore_2

    ; Mostrar el resultado por pantalla
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload_2
    invokevirtual java/io/PrintStream/print(I)V

    ; Salto de línea
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "\n"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    return
.end method
.method public static duplicar(I)I
    .limit stack 2
    .limit locals 1

    ; Parámetro de la función
    iload_0

    ; Duplicar el valor
    iconst_2
    imul

    ; Devolver el resultado
    ireturn
.end method
