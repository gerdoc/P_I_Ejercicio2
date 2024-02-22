package com.gutierrez.galan.german.main;

import com.gutierrez.galan.german.negocio.impl.Cuadrado;

public class Principal
{
   public static void main( String argv[] )
   {
      Cuadrado cuadrado = new Cuadrado( );
      cuadrado.linea = 5;
      cuadrado.imprime( );
   }
}
