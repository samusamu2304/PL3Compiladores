.class public Concatenacion
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 4
    .limit locals 4

    ; Cadena de texto (puedes cambiar el valor aquí)
    ldc "El número es: "
    astore_1

    ; Número a concatenar (puedes cambiar el valor aquí)
    ldc 42
    invokestatic java/lang/Integer/toString(I)Ljava/lang/String;
    astore_2

    ; Concatenar las dos cadenas
    aload_1
    aload_2
    invokevirtual java/lang/String/concat(Ljava/lang/String;)Ljava/lang/String;
    astore_3

    ; Mostrar el resultado por pantalla
    getstatic java/lang/System/out Ljava/io/PrintStream;
    aload_3
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    ; Salto de línea
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "\n"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

    return
.end method
