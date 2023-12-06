.class public OperacionLogica
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 4

    ; Primer número para la operación lógica (puedes cambiar los valores aquí)
    ldc 0
    istore_1

    ; Segundo número para la operación lógica (puedes cambiar los valores aquí)
    ldc 1
    istore_2

    ; Realizar la operación lógica AND
    iload_1
    iload_2
    iand
    istore_3  ; Almacenar el resultado en la variable local 3

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

