.class public Multiplicacion
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 3
    .limit locals 4

    ; Primer número a multiplicar (puedes cambiar los valores aquí)
    ldc 5
    istore_1

    ; Segundo número a multiplicar (puedes cambiar los valores aquí)
    ldc 7
    istore_2

    ; Multiplicar los dos números
    iload_1
    iload_2
    imul
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
