public class Composition {

    public static void main(String[] args) {

        // Creating Student
        Student student1 = new Student("Manish", "#123");

        // Creating Session
        Sessions finalYear = new Sessions("2021", student1);

        // Creating Floor
        Floor thirdFloor = new Floor(3, 1000);

        // Creating Branch
        Branch ece = new Branch(
                "Electronics",
                new Sessions("Prefinal", new Student("Atulya", "#1234"))
        );

        // Creating Library
        Library apj = new Library("BestLibrary", "2019", 10000, thirdFloor);

        // Creating College
        College vitVellore = new College("VIT Vellore", apj, ece);

        // Creating University
        University vit = new University("VIT University", vitVellore);

        // Calling Methods
        vit.getCollege().OpeningDate();
        vit.getCollege().getLibrary().SearchaBook();
        vit.getCollege().getLibrary().getFloor().Cleanthefloor();

        System.out.println("\n========== DETAILS ==========");

        System.out.println("University : " + vit.getName());
        System.out.println("College    : " + vit.getCollege().getCollegeName());
        System.out.println("Library    : " + vit.getCollege().getLibrary().getName());
        System.out.println("Floor      : " + vit.getCollege().getLibrary().getFloor().getFloorNo());
        System.out.println("Branch     : " + vit.getCollege().getBranch().getBranchName());

        System.out.println("\nStudent Details");
        System.out.println("Session    : " + finalYear.getSessionName());
        System.out.println("Student    : " + finalYear.getStudent().getName());
        System.out.println("Roll No    : " + finalYear.getStudent().getRollNo());

        System.out.println("\nBranch Student");
        System.out.println("Session    : " +
                vit.getCollege().getBranch().getSession().getSessionName());

        System.out.println("Student    : " +
                vit.getCollege().getBranch().getSession().getStudent().getName());
    }
}

// ========================= Student =========================

class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }
}

// ========================= Sessions =========================

class Sessions {

    private String sessionName;
    private Student student;

    public Sessions(String sessionName, Student student) {
        this.sessionName = sessionName;
        this.student = student;
    }

    public String getSessionName() {
        return sessionName;
    }

    public Student getStudent() {
        return student;
    }
}

// ========================= Branch =========================

class Branch {

    private String branchName;
    private Sessions session;

    public Branch(String branchName, Sessions session) {
        this.branchName = branchName;
        this.session = session;
    }

    public String getBranchName() {
        return branchName;
    }

    public Sessions getSession() {
        return session;
    }
}

// ========================= Floor =========================

class Floor {

    private int floorNo;
    private double floorCapacity;

    public Floor(int floorNo, double floorCapacity) {
        this.floorNo = floorNo;
        this.floorCapacity = floorCapacity;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public double getFloorCapacity() {
        return floorCapacity;
    }

    public void Cleanthefloor() {
        System.out.println("Cleaning Process Initiated");
    }
}

// ========================= Library =========================

class Library {

    private String name;
    private String yearOfBuild;
    private int noOfBooks;
    private Floor floor;

    public Library(String name, String yearOfBuild, int noOfBooks, Floor floor) {
        this.name = name;
        this.yearOfBuild = yearOfBuild;
        this.noOfBooks = noOfBooks;
        this.floor = floor;
    }

    public String getName() {
        return name;
    }

    public String getYearOfBuild() {
        return yearOfBuild;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public Floor getFloor() {
        return floor;
    }

    public void SearchaBook() {
        System.out.println("Searching for Book...");
    }
}

// ========================= College =========================

class College {

    private String collegeName;
    private Library library;
    private Branch branch;

    public College(String collegeName, Library library, Branch branch) {
        this.collegeName = collegeName;
        this.library = library;
        this.branch = branch;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public Library getLibrary() {
        return library;
    }

    public Branch getBranch() {
        return branch;
    }

    public void OpeningDate() {
        System.out.println("The Opening Date is 20th JAN");
    }
}

// ========================= University =========================

class University {

    private String name;
    private College college;

    public University(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public College getCollege() {
        return college;
    }
}