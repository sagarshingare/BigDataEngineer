package com.sagarshingare.scala.rtj.scala2advanced.lectures.part4implicits

// TYPE CLASS
trait MyTypeClassTemplate[T] {
  def action(value: T): String
}

object MyTypeClassTemplate {
  def apply[T](implicit instance: MyTypeClassTemplate[T]) = instance
}