.class public LlamadaConVariosParametros
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila
   .limit stack 3

   ; Cargamos dos valores en la pila (por ejemplo, 3 y 5)
   ldc 3
   ldc 5

   ; Llamada a la función pasando varios parámetros
   invokestatic LlamadaConVariosParametros/funcionConVariosParametros(II)V

   ; cerramos el main
   return

.method public static funcionConVariosParametros(II)V
   ; Cuerpo de la función: muestra la suma de los dos parámetros por pantalla
   getstatic java/lang/System/out Ljava/io/PrintStream;
   iload_1
   iload_2
   iadd
   invokevirtual java/io/PrintStream/println(I)
   return
.end method
