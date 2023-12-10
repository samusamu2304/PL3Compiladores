.class public LlamadaFuncion
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
    .limit stack 1
    .limit locals 1

    ; Llamada a la función sin parámetros ni devolución
    invokestatic LlamadaFuncion/funcionSinParametros()V

    return
.end method

.method public static funcionSinParametros()V
    .limit stack 2
    .limit locals 1

    ; Cuerpo de la función
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "Hola, esta es una función sin parámetros ni devolución"
    invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

    return
.end method
