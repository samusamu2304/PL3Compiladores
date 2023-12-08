.class public OperacionLogica
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila
   .limit stack 3

   ; cargamos un valor en la pila (por ejemplo, 1 para true)
   ldc 1

   ; cargamos otro valor en la pila (por ejemplo, 0 para false)
   ldc 0

   ; realizamos la operación lógica (AND en este caso)
   iand

   ; ponemos a java.lang.System.out (type PrintStream) en la pila
   getstatic java/lang/System/out Ljava/io/PrintStream;

   ; invocamos la función println para mostrar el resultado
   invokevirtual java/io/PrintStream/println(I)V

   ; cerramos el main
   return
.end method
