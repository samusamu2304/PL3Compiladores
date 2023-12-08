.class public BucleFor
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila
   .limit stack 4

   ; Inicializamos la variable de control del bucle
   ldc 1
   istore_1

   ; Comenzamos el bucle
   start_for:
      ; Cuerpo del bucle: mostramos el valor de la variable de control
      getstatic java/lang/System/out Ljava/io/PrintStream;
      iload_1
      invokevirtual java/io/PrintStream/println(I)

      ; Incrementamos la variable de control
      iinc 1 1

      ; Condición de salida del bucle
      ldc 5
      if_icmpge end_for

      ; Salto al inicio del bucle
      goto start_for

   ; Etiqueta de finalización del bucle
   end_for:

   ; cerramos el main
   return
.end method
