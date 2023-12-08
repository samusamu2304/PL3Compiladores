.class public IfAnidado
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 4 sitios en la pila
   .limit stack 4

   ; cargamos un valor en la pila (por ejemplo, 10)
   ldc 10

   ; realizamos una comparación para ver si es menor que 5
   ldc 5
   if_icmpge else_label1

   ; Si es menor que 5, mostramos "Menor que 5"
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Menor que 5"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)
   goto end_label1

   ; Etiqueta para el caso contrario
   else_label1:

   ; realizamos otra comparación para ver si es menor que 15
   ldc 15
   if_icmpge else_label2

   ; Si es menor que 15, mostramos "Entre 5 y 15"
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Entre 5 y 15"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)
   goto end_label2

   ; Etiqueta para el caso contrario
   else_label2:

   ; Si no cumple ninguna de las condiciones anteriores, mostramos "Mayor que 15"
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Mayor que 15"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)

   ; Etiqueta de finalización
   end_label2:

   ; cerramos el main
   return
.end method