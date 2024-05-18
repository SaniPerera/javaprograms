public class Examples {


    public void Alphabet() {
        char c;
        for (c = 'a'; c <= 'z'; c++) {
            System.out.print(c + " ");
        }
    }
    public void ReversNumbers(){
      for (int i = 5; i >= 0; i--) {
          System.out.println(i);
      }
    }
    public static void main(String[] args) {
        Examples Examples = new Examples();
        Examples.Alphabet();

         Examples.ReversNumbers();

    }


}
