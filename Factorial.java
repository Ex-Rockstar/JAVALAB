class Factorial {
    public static void main(String[] arg) {
        int[] num = new int[10];

        if (arg.length == 0) {
            System.out.println("No command line argument passed.");
            return;
        }

        for (int i = 0; i < arg.length; i++) {
            num[i] = Integer.parseInt(arg[i]);
        }

        for (int i = 0; i < arg.length; i++) {
            int fact = 1;

            for (int j = 1; j <= num[i]; j++) {
                fact *= j;
            }

            System.out.println("The factorial of " + arg[i] + " is: " + fact);
        }
    }
}
