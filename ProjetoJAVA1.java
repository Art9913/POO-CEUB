public class IncremDecrem
{
  private class Incrementa {
    private static void incrementa() {
        System.out.println("Vamos incrementar em 1 e 1");
        // Usando incremento ctd = ctd + 1
        for (int ctd = 1; ctd <= 10; ctd = ctd + 1) {
            System.out.println("ctd = ctd + 1: " + ctd);
        }
        // Usando incremento ctd += 1
        for (int ctd = 1; ctd <= 10; ctd += 1) {
            System.out.println("ctd += 1: " + ctd);
        }
        // Usando incremento ctd ++
        for (int ctd = 1; ctd <= 10; ctd ++) {
            System.out.println("ctd ++: " + ctd);
        } 
    }
  }

  private class Decrementa {
    private static void decrementa() {
        System.out.println("Vamos decrementar em 1 e 1");
        // Usando decremento ctd = ctd - 1
        for (int ctd = 10; ctd >= 1; ctd = ctd - 1)
        {
            System.out.println("ctd = ctd - 1: " + ctd);
        }
        // Usando decremento ctd -= 1
        for (int ctd = 10; ctd >= 1; ctd -= 1)
        {
            System.out.println("ctd -= 1: " + ctd);
        }
        // Usando decremento ctd --
        for (int ctd = 10; ctd >= 1; ctd --)
        {
            System.out.println("ctd --: " + ctd);
        }         
    }
  }

  public static void main(String[] args) 
  {
       Incrementa.incrementa();
       Decrementa.decrementa();
  }
}
