public class AllTypeCastings
{
    public static void main(String[] args) 
{
        char ch = 'A';    
        byte b = 10;
        short s = 1283;
        int i = 53374;
        long l = 100000L;
        float f = 123.45f;
        double d = 123456.789;
  	
	System.out.println("---All Type Castings---");

        //char conversions
	//in this byte&short are explict and remaining all are implict type casting

        System.out.println("\n--- char conversions ---");
        System.out.println("char: " + ch);
        byte cb = (byte) ch;
        short cs = (short) ch;
        int ci = ch;
        long cl = ch;
        float cf = ch;
        double cd = ch;
        System.out.println("char to byte: " + cb);
        System.out.println("char to short: " + cs);
        System.out.println("char to int: " + ci);
        System.out.println("char to long: " + cl);
        System.out.println("char to float: " + cf);
        System.out.println("char to double: " + cd);

        //byte conversions
	//in this all are implict type casting except char

        System.out.println("--- byte conversions ---");
        System.out.println("byte: " + b);
        short bs = b;
        int bi = b;
        long bl = b;
        float bf = b;
        double bd = b;
        char bc = (char) b;
        System.out.println("byte to short: " + bs);
        System.out.println("byte to int: " + bi);
        System.out.println("byte to long: " + bl);
        System.out.println("byte to float: " + bf);
        System.out.println("byte to double: " + bd);
        System.out.println("byte to char: " + bc);

        //short conversions
	//in this byte&char is explicit and remaining all implict type casting

        System.out.println("\n--- short conversions ---");
        System.out.println("short: " + s);
	char sc = (char) s;
        byte sb = (byte) s;
        int si = s;
        long sl = s;
        float sf = s;
        double sd = s;
        System.out.println("short to byte: " + sb);
        System.out.println("short to int: " + si);
        System.out.println("short to long: " + sl);
        System.out.println("short to float: " + sf);
        System.out.println("short to double: " + sd);
        System.out.println("short to char: " + sc);

        // int conversions 
	//in this char,byte,short are explict and remaini9ng all are implict type casting

        System.out.println("\n--- int conversions ---");
        System.out.println("int: " + i);
	char ic = (char) i;
        byte ib = (byte) i;
        short is = (short) i;
        long il = i;
        float iF = i;
        double id = i;
        System.out.println("int to byte: " + ib);
        System.out.println("int to short: " + is);
        System.out.println("int to char: " + ic);
        System.out.println("int to long: " + il);
        System.out.println("int to float: " + iF);
        System.out.println("int to double: " + id);

        // long conversions
	//in this char,byte,short,int are explict and float,double are implict type casting
	
        System.out.println("\n--- long conversions ---");
        System.out.println("long: " + l);
	char lc = (char)l;
        byte lb = (byte)l;
        short ls = (short)l;
        int li = (int)l;
        float lf = l;
        double ld = l;
        System.out.println("long to byte: " + lb);
        System.out.println("long to short: " + ls);
        System.out.println("long to char: " + lc);
        System.out.println("long to int: " + li);
        System.out.println("long to float: " + lf);
        System.out.println("long to double: " + ld);

        //float conversions
 	//in this except double remaining all explicit type casting

        System.out.println("\n--- float conversions ---");
        System.out.println("float: " + f);
	char fc = (char)f;
        byte fb = (byte)f;
        short fs = (short)f;
        int fi = (int)f;
        long fl = (long)f;
        double fd = f;
	System.out.println("float to char: " + fc);
        System.out.println("float to byte: " + fb);
        System.out.println("float to short: " + fs);
        System.out.println("float to int: " + fi);
        System.out.println("float to long: " + fl);
        System.out.println("float to double: " + fd);

        // double conversions
	//in this all are explicit type casting

        System.out.println("\n--- double conversions ---");
        System.out.println("double: " + d);
	char dc = (char)d;
        byte db = (byte)d;
        short ds = (short)d;
        int di = (int)d;
        long dl = (long)d;
        float df = (float)d;
        System.out.println("double to byte: " + db);
        System.out.println("double to short: " + ds);
        System.out.println("double to char: " + dc);
        System.out.println("double to int: " + di);
        System.out.println("double to long: " + dl);
        System.out.println("double to float: " + df);

       }
}
