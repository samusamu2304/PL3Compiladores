.class public Concatenacion
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 3 sitios en la pila
   .limit stack 3

   ; cargamos la cadena de texto en la pila
   ldc "El número es: "

   ; cargamos el número en la pila
   ldc 42

   ; concatenamos la cadena y el número
   invokevirtual java/lang/StringBuilder/append(I)Ljava/lang/StringBuilder;
   invokevirtual java/lang/StringBuilder/toString()Ljava/lang/String;

   ; ponemos a java.lang.System.out (type PrintStream) en la pila
   getstatic java/lang/System/out Ljava/io/PrintStream;

   ; invocamos la función println para mostrar el resultado
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V

   ; cerramos el main
   return
.end method
