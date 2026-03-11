class week31 {

    public static void main(String[] args) {

        int[] age = new int[10];

        // Take input for 10 students
        for (int i = 0; i < age.length; i++) {

            System.out.print("Enter age of student " + (i + 1) + ": ");

            age[i] = Integer.parseInt(System.console().readLine());
        }

        // Check voting eligibility
        for (int i = 0; i < age.length; i++) {

            if (age[i] < 0) {
                System.out.println("Invalid age");
            } 
            else if (age[i] >= 18) {
                System.out.println("The student with the age " + age[i] + " can vote");
            } 
            else {
                System.out.println("The student with the age " + age[i] + " cannot vote");
            }
        }
    }
}