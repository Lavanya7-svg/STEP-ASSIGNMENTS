public class Q2 {
   public Q2() {
   }

   public static void checkTypingAccuracy(String var0, String var1) {
      int var2 = 0;
      int var3 = -1;

      for(int var4 = 0; var4 < var0.length(); ++var4) {
         if (var0.charAt(var4) == var1.charAt(var4)) {
            ++var2;
         } else if (var3 == -1) {
            var3 = var4 + 1;
         }
      }

      double var6 = (double)var2 * (double)100.0F / (double)var0.length();
      System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | ", var2, var0.length(), var6);
      if (var3 == -1) {
         System.out.println("No Mismatches");
      } else {
         System.out.println("First Mismatch at position " + var3 + " ('" + var0.charAt(var3 - 1) + "' vs '" + var1.charAt(var3 - 1) + "')");
      }

   }

   public static void main(String[] var0) {
      checkTypingAccuracy("hello world", "hello worlt");
      checkTypingAccuracy("coding", "coding");
   }
}