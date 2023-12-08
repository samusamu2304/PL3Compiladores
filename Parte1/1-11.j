.class public LlamadaConParametro
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 2 sitios en la pila
   .limit stack 2

   ; Cargamos un valor en la pila (por ejemplo, 7)
   ldc 7

   ; Llamada a la función pasando un parámetro
   invokestatic LlamadaConParametro/funcionConParametro(I)V

   ; cerramos el main
   return

.method public static funcionConParametro(I)V
   ; Cuerpo de la función: muestra el parámetro por pantalla
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   invokevirtual java/io/PrintStream/println(I)
   return
.end method
