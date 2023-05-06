import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
import java.util.Scanner;

import java.io.PrintWriter;
import java.math.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

class Main {
    static void solve () {

            char[] a = nextCharArray();
                    int n = a.length;

                            int min = Integer.MAX_VALUE;
                                    for (int bi=0; bi<1<<n; bi++) {
                                                StringBuilder sb = new StringBuilder();
                                                            for (int i=0; i<n; i++) {
                                                                            if ((1&bi>>i) == 1) {

                                                                                                sb.append(a[i]);

                                                                                                                }
                                                                                                                            }
                                                                                                                                        if (sb.length() < 1) continue;
                                                                                                                                                    if (Long.parseLong(sb.toString())%3 == 0) {
                                                                                                                                                                    min = Math.min(min, n - sb.length());
                                                                                                                                                                                }

                                                                                                                                                                                        }

                                                                                                                                                                                                println(min==Integer.MAX_VALUE? -1 : min);

                                                                                                                                                                                                    }

                                                                                                                                                                                                        public static String yesno(boolean b) {return b?"Yes":"No";}
                                                                                                                                                                                                            public static void print(Object o) {out.print(o);}
                                                                                                                                                                                                                public static void println(Object o) {out.println(o);}

                                                                                                                                                                                                                    public static String next() {return in.next();}
                                                                                                                                                                                                                        public static char nextChar() {return next().charAt(0);}
                                                                                                                                                                                                                            public static int nextInt() {return in.nextInt();}
                                                                                                                                                                                                                                public static Double nextDouble() {return in.nextDouble();}
                                                                                                                                                                                                                                    public static Long nextLong() {return in.nextLong();}
                                                                                                                                                                                                                                        public static int[] nextIntArray(int n) {
                                                                                                                                                                                                                                                int[] a = new int[n];
                                                                                                                                                                                                                                                        for (int i=0; i<n; i++) a[i] = nextInt();
                                                                                                                                                                                                                                                                return a;
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                        public static String[] nextStringArray(int n) {
                                                                                                                                                                                                                                                                                String[] a = new String[n];
                                                                                                                                                                                                                                                                                        for (int i=0; i<n; i++) a[i] = next();
                                                                                                                                                                                                                                                                                                return a;
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                        public static char[] nextCharArray() {
                                                                                                                                                                                                                                                                                                                return next().toCharArray();
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                        public static char[][] nextCharTable(int h, int w) {
                                                                                                                                                                                                                                                                                                                                char[][] a = new char[h][w];
                                                                                                                                                                                                                                                                                                                                        for (int i=0; i<h; i++) {
                                                                                                                                                                                                                                                                                                                                                    a[i] = next().toCharArray();
                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                    return a;
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                            public static void printCharTable(char[][] a) {
                                                                                                                                                                                                                                                                                                                                                                                    for (int i=0; i<a.length; i++) {
                                                                                                                                                                                                                                                                                                                                                                                                for (int j=0; j<a[0].length; j++) {
                                                                                                                                                                                                                                                                                                                                                                                                                print(a[i][j]);
                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                        println("");
                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                        public static void printIntArray(int[] a) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                for (int i=0; i<a.length; i++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                            if (i != 0) print(" ");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        print(a[i]);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        println("");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                public static void printBooleanTable(boolean[][] b) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        for (int i=0; i<b.length; i++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    for (int j=0; j<b[0].length; j++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    print(b[i][j]? "o" : "x");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            println("");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            public static void printIntTable(int[][] a) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    for (int i=0; i<a.length; i++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                for (int j=0; j<a[0].length; j++) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                print(a[i][j]+" ");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        println("");
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        static Scanner in = new Scanner(System.in);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            static PrintWriter out = new PrintWriter(System.out);
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                public static void main(String[] args) {
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        solve();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                in.close();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        out.close();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            }