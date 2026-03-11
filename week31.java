class week31 {
    public static void main(String[] args) {

        int[] ages = new int[10];

        for (int i = 0; i < ages.length; i++) {
            ages[i] = Integer.parseInt(args[i]);
        }

        for (int i = 0; i < ages.length; i++) {

            if (ages[i] < 0) {
                System.out.println("Invalid age: " + ages[i]);
            }
            else if (ages[i] >= 18) {
                System.out.println("The student with the age " + ages[i] + " can vote.");
            }
            else {
                System.out.println("The student with the age " + ages[i] + " cannot vote.");
            }

        }
    }
}