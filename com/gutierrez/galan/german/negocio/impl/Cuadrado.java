package com.gutierrez.galan.german.negocio.impl;

import com.gutierrez.galan.german.negocio.Figura;

public class Cuadrado extends Figura
{
   public void imprime( )
   {
      for( int i = 0; i < linea; i++ )
      {
         for( int y = 0; y < linea; y++ )
         {
            System.out.print( "*" );
         }
         System.out.println( );
      }
   }
}
