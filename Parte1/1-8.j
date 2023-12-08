.class public BucleWhile
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila
   .limit stack 3

   ; Inicializamos la variable de control del bucle
   ldc 1
   istore_1

   ; Etiqueta de inicio del bucle
   start_while:

      ; Condición de salida del bucle
      ldc 5
      if_icmpge end_while

      ; Cuerpo del bucle: mostramos el valor de la variable de control
      getstatic java/lang/System/out Ljava/io/PrintStream;
      iload_1
      invokevirtual java/io/PrintStream/println(I)

      ; Incrementamos la variable de control
      iinc 1 1

      ; Salto al inicio del bucle
      goto start_while

   ; Etiqueta de finalización del bucle
   end_while:

   ; cerramos el main
   return
.end method
