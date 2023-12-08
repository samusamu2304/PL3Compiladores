.class public LlamadaConResultado
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 1 sitio en la pila
   .limit stack 1

   ; Llamada a la función devolviendo un resultado en un entero
   invokestatic LlamadaConResultado/funcionConResultado()I

   ; almacenamos el resultado en la variable local 1
   istore_1

   ; mostramos el resultado por pantalla
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   invokevirtual java/io/PrintStream/println(I)

   ; cerramos el main
   return

.method public static funcionConResultado()I
   ; Cuerpo de la función: devuelve el valor 42
   ldc 42
   ireturn
.end method
