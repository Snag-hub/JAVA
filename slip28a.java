class slip28b{
  public static void main(String[] args) {
    int cnt = 0;
    for (int i=0; i<args.length; i++) {
      System.out.println(args[i]);
      cnt=cnt+1;
    }
    System.out.println("Total number of arguments are: " + cnt);
  }
}