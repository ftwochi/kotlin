fun main () {
  print("What are you classified as with your current age? ")
  val age= readln().toString()
  when(age) {
   "teen" -> {
       print("The movies you can watch are classified; PG, PG-13 and G. Some of this movie classification examples would be Willy Wonka and the chocolate factory(G), Shrek (PG), and Godzilla vs Kong (PG-13) ")
   }
      "Teen" -> {
          print("The movies you can watch are classified; PG, PG-13 and G. Some of this movie classification examples would be Willy Wonka and the chocolate factory(G), Shrek (PG), and Godzilla vs Kong (PG-13) ")
      }
   "teenager" -> {
       print("The movies you can watch are classified; PG, PG-13, G, and R(with and adult companion). Some of this movie classification examples would be Willy Wonka and the chocolate factory(G), Shrek(PG), Godzilla vs KOng(PG-13) and Deadpool(R) with a supervisor. ")
   }
      "Teenager" -> {
          print("The movies you can watch are classified; PG, PG-13, G, and R(with and adult companion). Some of this movie classification examples would be Willy Wonka and the chocolate factory(G), Shrek(PG), Godzilla vs KOng(PG-13) and Deadpool(R) with a supervisor. ")
      }
   "adult" -> {
       print("The movies you can watch are classified; PG, PG-13, G, and R. Some of this movie classification examples are Willy Wonka and the chocolate factory(G), Shrek(PG), Godzilla vs Kong(PG-13), and Deadpool(R).")
   }
      "Adult" -> {
          print("The movies you can watch are classified; PG, PG-13, G, and R. Some of this movie classification examples are Willy Wonka and the chocolate factory(G), Shrek(PG), Godzilla vs Kong(PG-13), and Deadpool(R).")
      }
   else -> {
       print("I don't know anything about it")
   }
  }
 }