package org.knoldus.bootstrap

import org.knoldus.Controller.UserCRUD
import org.knoldus.Modal.User
import scala.io.StdIn.{readInt, readLine}

object Implementation extends UserCRUD {

  def inputString: String = {
    readLine()
  }

  def inputInt: Int = {
    readInt()
  }
  
  def insert: Unit ={
    create(new User("admin", "admin name", "username"))
    create(new User("customer", "customer1", "customerUser1"))
    create(new User("customer", "customer2", "customerUser2"))
    create(new User("customer", "customer3", "customerUser3"))
    create(new User("customer", "customer4", "customerUser4"))
    create(new User("customer", "customer5", "customerUser5"))
    listAllUsers
  }

  def deleteCustomer(deleteIndex:Int): Unit ={
    if (deleteIndex == 0)
      println("selected user is not customer!")
    else {
      delete(deleteIndex)
    listAllUsers
    }
  }

  def main(args: Array[String]): Unit = {
    insert
    print("Enter username to be updated for the admin : ")
    updateUsername(0, inputString)
    listAllUsers
    print("Enter index of customer to be deleted: ")
    val deleteIndex = inputInt
    deleteCustomer(deleteIndex)
  }
}
