.class public LlamadaSinParametros
.super java/lang/Object

.method public static main([Ljava/lang/String;)V
   ; reservamos 1 sitio en la pila
   .limit stack 1

   ; Llamada a la función sin parámetros ni devolución
   invokestatic LlamadaSinParametros/funcionSinParametros()V

   ; cerramos el main
   return

.method public static funcionSinParametros()V
   ; Cuerpo de la función
   getstatic java/lang/System/out Ljava/io/PrintStream;
   ldc "Función sin parámetros ni devolución"
   invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V
   return
.end method
