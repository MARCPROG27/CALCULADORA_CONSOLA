package com.example.calculadora_consola

fun main() {
 menu()

}


fun continuar() {
 print("¿DESEA CONTINUAR...? INGRESE 'S' PARA CONTINUAR  Y 'N' PARA SALIR:  ")
 var opcioncontinuar = readLine()!!.toString().uppercase()

 when (opcioncontinuar) {

  "S" -> menu()
  "N" -> println("USTED HA SALIDO DE LA CALCULADORA...ADIOS")
  else -> print("OPCION ERRONEA")

 }

}

fun menu() {
 var seleccion: Int
 var numero1: Int=0
 var numero2: Int=0
 var resultado: Int=0

 try {
  println("================================================")
  println("========CALCULADORA POR CONSOLA DE NUMEROS ENTEROS EN KOTLIN========")
  println("          1-SUMAR")
  println("          2-RESTAR")
  println("          3-MULTIPLICAR")
  println("          4-DIVIDIR")
  print("INGRESE NUMERO 1 PARA HACER LA OPERACION: ")
  numero1 = readLine()?.toInt() as Int
  print("INGRESE NUMERO 2 PARA HACER LA OPERACION: ")
  numero2 = readLine()?.toInt() as Int
  print("INGRESE NUMER0 DE OPERACION A REALIZAR: ")
  seleccion = readLine()?.toInt() as Int
  if (seleccion == 1) {
   resultado = numero1 + numero2
   println("LA SUMA ES: $resultado")
  } else if (seleccion == 2) {
   resultado = numero1 - numero2
   println("LA RESTA ES: $resultado")
  } else if (seleccion == 3) {
   resultado = numero1 * numero2
   println("LA MULTIPLICACION ES: $resultado")
  } else if (seleccion == 4) {

   try {
    resultado = numero1 / numero2
    println("LA DIVISION ES: $resultado")
   } catch (e: Exception) {
    println("ERROR EN LA DIVISION POR CERO.")
   }


  } else {
   println("LA OPCION INGRESADA NO ES VALIDA")
  }

 } catch (e: Exception) {
  println("ERROR EN VALOR INGRESADO O CARACTER INGRESADO ES ERRONEO.")
 }

 println("=========================================================================")
 continuar()

}


