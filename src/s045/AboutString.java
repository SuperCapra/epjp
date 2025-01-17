package s045;

public class AboutString {
    public static void main(String[] args) {
        String s = "hello";
        String t = "world";
        String u = "or";
        System.out.println("char a: "+ (int) 'a'); //stampa il codice di a
        System.out.println("char a: "+ (int) 'A'); //stampa il codice di A
        int diff = 'a'-'A'; //calcola la differenza tra upper e lower
        System.out.println("Gap Lower-Upper: "+ diff);
        System.out.println("s, t, u: " + s + ", " + t + ", " + u);

        System.out.println("char at position 1 in s: " + s.charAt(1));

        System.out.println("s < t: " + s.compareTo(t)); //paragona 
        System.out.println("t > s: " + t.compareTo(s));

        System.out.println("concat s and t: " + s.concat(t));

        System.out.println("t contains u? " + t.contains(u));

        String u2 = t.substring(1, 3);
        System.out.println("u2 = t.substring(1, 3): " + u2);
        System.out.println("t.substring(3): " + t.substring(3));

        System.out.println("u equals u2? " + u.equals(u2));
        System.out.println("u == u2? " + (u == u2));

        System.out.println("First index of 'l' is s: " + s.indexOf('l'));
        System.out.println("First index of 'l' is s: " + u.indexOf('l'));
        System.out.println("Last index of 'l' is s: " + s.lastIndexOf('l'));
        System.out.println("there is no 'x' in s: " + s.indexOf('x'));
        System.out.println("in s \"ll\" starts at " + s.indexOf("ll"));
        System.out.println("there is no \"lx\" in s: " + s.indexOf("lx"));

        System.out.println("check if an empty string is empty: " + "".isEmpty());

        System.out.println("s length: " + s.length());

        String s2 = s.replace('l', 'p');
        System.out.println("Replacing 'l' with 'p': " + s + " -> " + s2);
        s2 = s2.replace('e', 'y');
        System.out.println("Replacing 'l' with 'p' and 'e' with 'y': " + s + " -> " + s2);
        
        String[] splits = "one for me, one for you".split(" "); //per split bisogna mettere il doppio indice
        System.out.println("Splitting: ");
        for (String token : splits) {
            System.out.println(token);
        }
        String joined = String.join(" ", splits); //� un metodo statico
        System.out.println("Joining back [" + joined + "]");

        System.out.println("upper: " + s.toUpperCase());
        System.out.println("lower: " + "SHUT UP!".toLowerCase());

        System.out.println("trim [" + " la la la ".trim() + "]"); //elimina gli spazi bianchi
        
        String x = null; //il 'null' � un valore scomodo si sta cercando di eliminarlo
        System.out.println("Sort of safe toString(): " + String.valueOf(x));
        
        System.out.println("To string s: " + s.toString()); 
        
        
    }
}
