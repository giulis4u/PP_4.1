public class GoodStudentDriver
{
    public static void main(String[] args)
    {
        GoodStudent hermione  = new GoodStudent ("Hermione", "Granger", 98234, 4.0, true);

        System.out.println(hermione.toString());

        GoodStudent AlanTuring = new GoodStudent ("Alan", "Turing", 191254, 3.56, true);
        System.out.println(AlanTuring.toString());


        GoodStudent FlorenceNightingale = new GoodStudent ("Florence", "Nightingale", 182310, 3.89, false);

        FlorenceNightingale.setNumber(95366);
        FlorenceNightingale.setGPA(3.92);

        System.out.println(FlorenceNightingale.toString());

        GoodStudent GraceHopper = new GoodStudent("Grace", "Hopper", 190692, 3.99, true);
        System.out.println(GraceHopper.toString());
        System.out.println("Grace's first name is " + GraceHopper.getFirstName());
        System.out.println("Grace's CS Status " + GraceHopper.getcsStudent());
    }
}

