class Main {
  public static void main(String[] args) {
    
    // 1.
    int num=10;
    if (num > 0) {
      System.out.println("hello");
    } 

    // 2.
    int x=5;
    int y=2;
    if (x > Math.pow(y, 2)){
        System.out.println("x is greater than y squared");
    }

    // 3.
    num=3;
    if (num == 3) {
        System.out.println("goodbye");
    }

    // 4.
    num=5;
    if (3 < num && num < 10) {
        System.out.println("over here");
    }

    // 5.
    num=10;
    if (num > 5 || num < 0) {
        System.out.println("up there");
    }

    // 6.
    int grade= 95;
    if (grade >= 80){
        if (grade >= 90) {
            System.out.println("Your grade is an A"); 
        } 
            else 
            System.out.println("Your grade is a C or less");   
    }
  
  }
}