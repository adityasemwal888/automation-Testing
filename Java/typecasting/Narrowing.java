/*
 Narrowing typecasting
 lets simply explain this by a simple example if we have two bucket and we are
 trying to fill an small bucket into an smaller one well this is simply known as narrowing typecating
 one Note in narrowing typecating we/dev. have to explicitly define the value
 */
 package typecasting;

  public class Narrowing {

    public static void main(String[] args) {
            double d = 9.78f;
            int i = (int) d;
            System.out.println("Integer value: " + i);
        }
    }

