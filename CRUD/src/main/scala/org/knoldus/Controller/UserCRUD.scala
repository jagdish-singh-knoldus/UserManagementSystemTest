package org.knoldus.Controller

import org.knoldus.Modal.User
import scala.collection.mutable.ListBuffer

trait UserCRUD {
  /**
   * mutable ListBuffer to store users
   */
  var users: ListBuffer[User] = new ListBuffer[User]

  /**
   * insert user in ListBuffer
   * @param user
   */
  def create(user: User): Unit ={
    users+=user
  }

  /**
   * function to print all available users
   */
  def listAllUsers: Unit = {
    for (user <- users)
      println(user)
  }

  /**
   * function to update username
   * @param index
   * @param userName
   */
  def updateUsername(index: Int, userName: String): Unit = {
    users.update(index, new User(users(index).getUserType, users(index).getName, userName))
  }

  /**
   * delete user from ListBuffer
   * @param index
   */
  def delete(index: Int): Unit = {
    users.remove(index)
  }
}