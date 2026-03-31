package Assignment;

class AssignmentE4 {

    static int testMethod() {

        try {
            System.out.println("Inside try block");
            return 30;
        } 
        finally {
            System.out.println("Inside finally block");
           return 40;
        }
    }

    public static void main(String[] args) {
        int result = testMethod();
        System.out.println("Returned value: " + result);
    }
}
