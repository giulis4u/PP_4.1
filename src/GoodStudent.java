public class GoodStudent
{
    //1.) Class or instances variables
    private String firstname;
    private String lastName;
    private int number;
    private double gpa;
    private boolean csStudent;
    private static int numStudents;
    private String createID;
    //2) Constructors
    public GoodStudent(String myFirstName, String myLastName, int myNumber, double myGPA, boolean myCsStudent)
    {
        this.firstname = myFirstName;
        this.lastName = myLastName;
        this.number = myNumber;
        this.gpa = myGPA;
        this.csStudent = myCsStudent;
        numStudents++;
    } // End of a constructor.

    public GoodStudent (String myLastName, String myFirstName, double myGPA, int myNumber, boolean myCsStudent)
    {
        firstname = myFirstName;
        lastName = myLastName;
        number = myNumber;
        gpa = myGPA;
        csStudent = myCsStudent;
    }//end my constructor.
    /* public GoodStudent()
    {
      firstName = "";
      lastName = "";
      number = 0;
      gpa = 0.0;
      csStudent = false;
    }
     */ //this is my default contructor or empty one.

     //6.)Brain methods
    public String CreateID()
    {
        String loveFirstName = firstname.toLowerCase();
        return loveFirstName.substring(0,1) + lastName.toLowerCase() + number%1000;
    }
    public double CSAGPA()
    {
        if(csStudent == true)
        {
            return gpa * .15 + gpa;
        }
        return gpa;
    }
    //4.) Getters
    public String getFirstName()
    {
        return firstname;
    }
    public String getLastName()
    {
        return lastName;
    }
    public boolean getcsStudent()
    {
        return csStudent;
    }
   public int getNumber()
    {
        return number;
    }
    public double getGPA()
    {
        return gpa;
    }

    //5.) Setters // they are mutators
   public void setNumber (int myNumber)
   {
       number = myNumber;
   }
   public void setGPA (double myGPA)
   {
       gpa = myGPA;
   }

    //6.) ToString
    public String toString()
    {
        String output = "\n Students first name: " + firstname +
                "\n Last name: " + lastName + "\n Number: " + number +
                        "\n GPA " + gpa + "\n and their CSA gpa: " + CSAGPA() +  "\n CS STUDENT?: " + csStudent + "\n ID " + CreateID();
        return output;
    }



}

