package exercise_2;

public class Main {
    public static void main(String[] args) {

        String identifyArrayStep1 = "_qwertyuioplkjhgfdsamnbvcxzQWERTYUIOPASDFGHJKLZXCVBNM";
        String identifyArrayStep2 = "_qwertyuioplkjhgfdsamnbvcxzQWERTYUIOPASDFGHJKLZXCVBNM0123456789";

        String enteredString = "0_090KJhkhdfjjdsdddf909090est";

        boolean totalVerification = false;
        boolean idVerificationStep1 = false;
        boolean idVerificationStep2 = false;

        int stepper = 1;

        char[] identityFirstStep = identifyArrayStep1.toCharArray();
        char[] identitySecondStep = identifyArrayStep2.toCharArray();

        while (!totalVerification) {

            for (char t : identityFirstStep) {
                if (enteredString.charAt(0) == t) {
                    System.out.println("First step verification - DONE! ");
                    System.out.println("...");
                    idVerificationStep1 = true;
                    break;
                }
            }

            // попробовать break заменить на totalVerification = true; // работает.
            if (!idVerificationStep1) {
                System.out.println("Your String is 'NOT' an identifier.");
                break;
            }

            for (int j = 0; j < identitySecondStep.length; j++) {

                if (enteredString.charAt(stepper) == identitySecondStep[j]) {

                    stepper++;
                    j = 0;

                } else if (stepper == enteredString.length() - 1) {

                    idVerificationStep2 = true;
                    break;

                }
            }

            System.out.println((idVerificationStep2) ?
                    "Your String is an identifier." :
                    "Your String is 'NOT' an identifier.");

            totalVerification = !false; // or just break;

        }
    }
}