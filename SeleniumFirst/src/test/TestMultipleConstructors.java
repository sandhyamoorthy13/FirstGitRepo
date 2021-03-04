package test;

class TestMultipleConstructors
{
    public static void main(String arg[])
    {
                Student yogesh = new Student("Yogesh", 67, 'B');
                Student narayan = new Student("Narayan", 72);
                Student mahesh = new Student("Mahesh");
                
                System.out.println(yogesh.name + " belongs to section " + yogesh.section + " and got " + yogesh.marks + " marks.");
                System.out.println(narayan.name + "  got " + narayan.marks + " marks.");
                System.out.println(mahesh.name + " belongs to nothing ");
    
    }
}

class Student
{
    String name;
    int marks;
    char section;
    
    // CONSTRUCTOR 1
    Student(String nameParam, int marksParam, char sectionParam)
    {
        name = nameParam;
        marks = marksParam;
        section = sectionParam;
    }

    // CONSTRUCTOR 2
    Student(String nameParam, int marksParam)
    {
        name = nameParam;
        marks = marksParam;
        //section = 'A';
    }
    
    // CONSTRUCTOR 3
    Student(String nameParam)
    {
        name = nameParam;
        marks = 0;
        section = 'A';
    }
    
}