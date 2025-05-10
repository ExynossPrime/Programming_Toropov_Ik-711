package lab_3;

public class Wrapper_Classes {
    public static void main(String[] args) {

        byte b = 10;
        Byte byte1 = new Byte(b);
        Byte byte2 = new Byte("20");

        short s = 100;
        Short short1 = new Short(s);
        Short short2 = new Short("200");

        int i = 1000;
        Integer int1 = new Integer(i);
        Integer int2 = new Integer("2000");

        long l = 10000L;
        Long long1 = new Long(l);
        Long long2 = new Long("20000");

        float f = 1.23f;
        Float float1 = new Float(f);
        Float float2 = new Float(4.56);
        Float float3 = new Float("7.89");

        double d = 12.34;
        Double double1 = new Double(d);
        Double double2 = new Double("56.78");

        char c = 'A';
        Character char1 = new Character(c);

        boolean bool = true;
        Boolean bool1 = new Boolean(bool);
        Boolean bool2 = new Boolean("true");
    }
}
