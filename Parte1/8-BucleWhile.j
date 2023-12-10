.class public BucleWhile
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 2
    .limit locals 1

    ; Inicialización de la variable de control del bucle
    ldc 1
    istore_0

    ; Inicio del bucle
    while_loop:
        ; Comparación: si i > 5, salir del bucle
        iload_0
        ldc 6
        if_icmpgt end_loop

        ; Cuerpo del bucle: imprimir el valor de i
        getstatic java/lang/System/out Ljava/io/PrintStream;
        iload_0
        invokevirtual java/io/PrintStream/print(I)V

        ; Salto de línea
        getstatic java/lang/System/out Ljava/io/PrintStream;
        ldc "\n"
        invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

        ; Incremento de la variable de control
        iinc 0 1

        ; Salto de nuevo al inicio del bucle
        goto while_loop

    end_loop:
    return
.end method
