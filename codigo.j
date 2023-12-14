.class public Linguine
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   .limit stack 2
   .limit locals 1

   ; Inicializar la variable de control en 1
   iconst_1
   istore_0

   ; Etiqueta de inicio del bucle
   while:
      ; Cargar el valor de la variable de control
      iload_0
      ; Comparar si es mayor que 5
      bipush 5
      if_icmple endWhile

      ; Imprimir el valor de la variable de control
      getstatic java/lang/System/out Ljava/io/PrintStream;
      iload_0
      invokevirtual java/io/PrintStream/println(I)V

      ; Incrementar la variable de control
      iinc 0 1
      ; Volver al inicio del bucle
      goto while

   ; Etiqueta de fin del bucle
   endWhile:
      return
.end method