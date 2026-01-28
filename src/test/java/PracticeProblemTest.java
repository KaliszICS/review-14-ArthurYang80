import java.lang.reflect.Method;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class PracticeProblemTest {

   @Test
   @DisplayName("")
   void calculateTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 2, 3, '+');
         assertEquals(5, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void calculateTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 5, 8, '-');
         assertEquals(-3, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void calculateTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 2, 3, '*');
         assertEquals(6, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void calculateTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 10, 4, '/');
         assertEquals(2, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void calculateTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 10, 3, '%');
         assertEquals(1, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void calculateTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { int.class, int.class, char.class };
         Method method = testClass.getDeclaredMethod("calculate", cArg);
         // Enter code here
         int result = (int)method.invoke(null, 2, 3, '^');
         assertEquals(8, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "");
         assertEquals(true, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello a b c d e f g h i");
         assertEquals(true, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello a b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello,a,b,c,d,e,f,g,a,i,j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello/a b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello;a b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello'a b c d e f g h i j");
         assertEquals(true, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest8() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello(a) b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest9() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello[a] b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest10() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello{a} b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest11() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello<a> b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest12() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello() b c d e f g h i j");
         assertEquals(true, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest13() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello-a b c d e f g h i j");
         assertEquals(false, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest14() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class };
         Method method = testClass.getDeclaredMethod("totalWordsChecker", cArg);
         // Enter code here
         boolean result = (boolean)method.invoke(null, "Hello_a b c d e f g h i j");
         assertEquals(true, result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void totalWordsCheckerTest15() {
      Class<?> testClass = PracticeProblem.class;
      String constantName = "MAXIMUM";
      try {
         Field field = testClass.getDeclaredField(constantName);
            
            // Check if it's actually a constant (public static final)
            int modifiers = field.getModifiers();
            boolean isConstant = Modifier.isStatic(modifiers) 
                              && Modifier.isFinal(modifiers);
            
            assertTrue(isConstant, "Field exists but is not a constant");
      }
      catch (NoSuchFieldException e) {
         fail("Constant does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest1() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "a", "b", "c");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest2() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "a", "c", "b");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest3() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "b", "a", "c");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest4() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "c", "a", "b");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest5() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "b", "c", "a");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest6() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "c", "b", "a");
         assertEquals("a", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest7() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "az", "ba", "cd");
         assertEquals(result, "az");
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }

   @Test
   @DisplayName("")
   void minStringTest8() {
      Class<?> testClass = PracticeProblem.class;
      try {
         Class[] cArg = { String.class, String.class, String.class };
         Method method = testClass.getDeclaredMethod("minString", cArg);
         // Enter code here
         String result = (String)method.invoke(null, "Zoo", "bear", "cat");
         assertEquals("bear", result);
      }
      catch (NoSuchMethodException e) {
         fail("Method does not exist");
      } 
      catch (Exception e) {
         fail("Something weird happened");
      }
   }
   
}
