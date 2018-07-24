class EmptyCanException extends RuntimeException
{
 public EmptyCanException()
 {
  super();
  System.out.println("DRINK IT FIRST");
  System.exit(0);
 }
}
