package com.chainsys.strings;

public class StringBuilter {

        public static void testA() {
                String firdtString ="Hello how are you today.Is the weather hot are hold";
                StringBuilder stringBilder = new StringBuilder();
                stringBilder.ensureCapacity(250);
                System.out.println("length ="+stringBilder.length());
                System.out.println("capacity ="+stringBilder.capacity());
                stringBilder.append(firdtString);
                System.out.println("buffer ="+stringBilder);
                System.out.println("length ="+stringBilder.length());
                System.out.println("capacity ="+stringBilder.capacity());
                
                firdtString = "wish it rains this week";
                stringBilder.append(firdtString);
                System.out.println("buffer ="+stringBilder);
                System.out.println("length ="+stringBilder.length());
                System.out.println("capacity ="+stringBilder.capacity());
                
                stringBilder.trimToSize();
                System.out.println("\tlength ="+stringBilder.length());
                System.out.println("\tcapacity ="+stringBilder.capacity());
                
                stringBilder.replace(3,8,"This is a Test");
                System.out.println("replace ="+stringBilder);
                
                stringBilder.insert(10,"This is a aAugest");
                System.out.println("insert ="+stringBilder);
                System.out.println("\tlength ="+stringBilder.length());
                System.out.println("\tcapacity ="+stringBilder.capacity());
                
                stringBilder.delete(5,20);
                System.out.println("delete ="+stringBilder);
                System.out.println("\tlength ="+stringBilder.length());
                System.out.println("\tcapacity ="+stringBilder.capacity());
                
//                System.out.println("delete ="+stringBilder);
        }

}
