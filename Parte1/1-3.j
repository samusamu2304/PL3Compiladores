.class public Multiplicacion
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila
   .limit stack 3

   ; cargamos el primer número en la pila
   ldc 5

   ; cargamos el segundo número en la pila
   ldc 7

   ; multiplicamos los dos números
   imul

   ; ponemos a java.lang.System.out (type PrintStream) en la pila
   getstatic java/lang/System/out Ljava/io/PrintStream;

   ; invocamos la función println para mostrar el resultado
   invokevirtual java/io/PrintStream/println(I)V

   ; cerramos el main
   return
.end method
