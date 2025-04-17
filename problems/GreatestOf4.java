class GreatestOf4 {
    public static void main (String args[]) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);

        if (a>b && a>c && a>d) 
            System.out.println(a +" is greatest.");
        else if (b>a && b>c && b>d) 
            System.out.println(b +" is greatest.");
        else if (c>a && c>b && c>d)
            System.out.println(c +" is greatest.");
        else 
            System.out.println(d +" is greatest.");

    }
}