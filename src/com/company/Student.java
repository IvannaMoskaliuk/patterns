/*
 * Classname Student
 *
 * @version 15/06/2020
 *
 * @author Moskaliuk Ivanna KNUTE
 *
 * Module 2 task 4
 *
 * Programming patterns. Factory, Builder.
    Develop for your class
    1. Factory.
    2. Abstract factory.
    3. Create a class Student  - 25 fields.
    4.  Create a builder for the class Student/
 */
package com.company;

public class Student {

    private String lastName;    // String last name of Student
    private String firstName;   // String first name of Student
    private String patronymic;  // String patronymic of Student
    private int age; // Date birthday of Student
    private String education;   // Education of the Student

    private String gender;
    private boolean isMilitary;
    private long phoneNumber;
    private String homeAdress;
    private String university;

    private String faculty;
    private Speciality speciality;
    private int course;
    private int group;
    private int averageScore;

    private boolean isScholarship;
    private String lastNameGroupCaptain;
    private String firstNameGroupCaptain;
    private String nationality;
    private MaritalStatus maritalStatus;

    private boolean isDriver;
    private String hobby;
    private String firstNameTeaсher;
    private String lastNameTeacher;
    private String diplomaTopic;

    public Student() {
    }

    public Student(String lastName,
                   String firstName,
                   String patronymic,
                   int age,
                   String education,
                   String gender,
                   boolean isMilitary,
                   long phoneNumber,
                   String homeAdress,
                   String university,
                   String faculty,
                   Speciality speciality,
                   int course,
                   int group,
                   int averageScore,
                   boolean isScholarship,
                   String lastNameGroupCaptain,
                   String firstNameGroupCaptain,
                   String nationality,
                   MaritalStatus maritalStatus,
                   boolean isDriver,
                   String hobby,
                   String firstNameTeaсher,
                   String lastNameTeacher,
                   String diplomaTopic) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.age = age;
        this.education = education;
        this.gender = gender;
        this.isMilitary = isMilitary;
        this.phoneNumber = phoneNumber;
        this.homeAdress = homeAdress;
        this.university = university;
        this.faculty = faculty;
        this.speciality = speciality;
        this.course = course;
        this.group = group;
        this.averageScore = averageScore;
        this.isScholarship = isScholarship;
        this.lastNameGroupCaptain = lastNameGroupCaptain;
        this.firstNameGroupCaptain = firstNameGroupCaptain;
        this.nationality = nationality;
        this.maritalStatus = maritalStatus;
        this.isDriver = isDriver;
        this.hobby = hobby;
        this.firstNameTeaсher = firstNameTeaсher;
        this.lastNameTeacher = lastNameTeacher;
        this.diplomaTopic = diplomaTopic;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int birthday) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHomeAdress() {
        return homeAdress;
    }

    public void setHomeAdress(String homeAdress) {
        this.homeAdress = homeAdress;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(int averageScore) {
        this.averageScore = averageScore;
    }

    public boolean isScholarship() {
        return isScholarship;
    }

    public void setScholarship(boolean scholarship) {
        isScholarship = scholarship;
    }

    public String getLastNameGroupCaptain() {
        return lastNameGroupCaptain;
    }

    public void setLastNameGroupCaptain(String lastNameGroupCaptain) {
        this.lastNameGroupCaptain = lastNameGroupCaptain;
    }

    public String getFirstNameGroupCaptain() {
        return firstNameGroupCaptain;
    }

    public void setFirstNameGroupCaptain(String firstNameGroupCaptain) {
        this.firstNameGroupCaptain = firstNameGroupCaptain;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public boolean isDriver() {
        return isDriver;
    }

    public void setDriver(boolean driver) {
        isDriver = driver;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getFirstNameTeaсher() {
        return firstNameTeaсher;
    }

    public void setFirstNameTeaсher(String firstNameTeaсher) {
        this.firstNameTeaсher = firstNameTeaсher;
    }

    public String getLastNameTeacher() {
        return lastNameTeacher;
    }

    public void setLastNameTeacher(String lastNameTeacher) {
        this.lastNameTeacher = lastNameTeacher;
    }

    public String getDiplomaTopic() {
        return diplomaTopic;
    }

    public void setDiplomaTopic(String diplomaTopic) {
        this.diplomaTopic = diplomaTopic;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                ", gender='" + gender + '\'' +
                ", isMilitary=" + isMilitary +
                ", phoneNumber=" + phoneNumber +
                ", homeAdress='" + homeAdress + '\'' +
                ", university='" + university + '\'' +
                ", faculty='" + faculty + '\'' +
                ", speciality=" + speciality +
                ", course=" + course +
                ", group=" + group +
                ", averageScore=" + averageScore +
                ", isScholarship=" + isScholarship +
                ", lastNameGroupCaptain='" + lastNameGroupCaptain + '\'' +
                ", firstNameGroupCaptain='" + firstNameGroupCaptain + '\'' +
                ", nationality='" + nationality + '\'' +
                ", maritalStatus=" + maritalStatus +
                ", isDriver=" + isDriver +
                ", hobby='" + hobby + '\'' +
                ", firstNameTeaсher='" + firstNameTeaсher + '\'' +
                ", lastNameTeacher='" + lastNameTeacher + '\'' +
                ", diplomaTopic='" + diplomaTopic + '\'' +
                '}';
    }

    /*
     * Pattern Builder take basic Student
     * with all setters for StudentToBuild
     */
    public static class Builder {
        private Student studentToBuild;

        public Builder() {
            this.studentToBuild = new Student();
        }

        /*
         * Method setSimilarTo complements new object example
         * StudentToBuild with the first example in basis
         * @param student is an object from which all parameters are taken
         */
        public Builder setSimilarTo(Student student) {
            this.studentToBuild.firstName = student.firstName;
            this.studentToBuild.lastName = student.lastName;
            this.studentToBuild.patronymic = student.patronymic;
            this.studentToBuild.age = student.age;
            this.studentToBuild.education = student.education;
            this.studentToBuild.gender = student.gender;
            this.studentToBuild.isMilitary = student.isMilitary;
            this.studentToBuild.phoneNumber = student.phoneNumber;
            this.studentToBuild.homeAdress = student.homeAdress;
            this.studentToBuild.university = student.university;
            this.studentToBuild.faculty = student.faculty;
            this.studentToBuild.speciality = student.speciality;
            this.studentToBuild.course = student.course;
            this.studentToBuild.group = student.group;
            this.studentToBuild.averageScore = student.averageScore;
            this.studentToBuild.isScholarship = student.isScholarship;
            this.studentToBuild.lastNameGroupCaptain = student.lastNameGroupCaptain;
            this.studentToBuild.firstNameGroupCaptain = student.firstNameGroupCaptain;
            this.studentToBuild.nationality = student.nationality;
            this.studentToBuild.maritalStatus = student.maritalStatus;
            this.studentToBuild.isDriver = student.isDriver;
            this.studentToBuild.hobby = student.hobby;
            this.studentToBuild.firstNameTeaсher = student.firstNameTeaсher;
            this.studentToBuild.lastNameTeacher = student.lastNameTeacher;
            this.studentToBuild.diplomaTopic = student.diplomaTopic;
            return this;
        }

        /*
         * Setter for StudentToBuild of Student object firstName field
         * @param firstName Sets first name of StudentToBuild object
         */
        public Builder setFirstName(String firstName) {
            studentToBuild.setFirstName(firstName);
            return this;
        }
        // the same situation for all 24 fields with each own parameters

        public Builder setLastName(String lastName) {
            studentToBuild.setLastName(lastName);
            return this;
        }
        public Builder setPatronimic(String patronymic) {
            studentToBuild.setPatronymic(patronymic);
            return this;
        }
        public Builder setAge(int age) {
            studentToBuild.setAge(age);
            return this;
        }
        public Builder setEducation(String education) {
            studentToBuild.setEducation(education);
            return this;
        }
        public Builder setGender(String gender) {
            studentToBuild.setGender(gender);
            return this;
        }
        public Builder setIsMilitary(boolean isMilitary) {
            studentToBuild.setMilitary(isMilitary);
            return this;
        }
        public Builder setPhoneNumber(long phoneNumber) {
            studentToBuild.setPhoneNumber(phoneNumber);
            return this;
        }
        public Builder setHomeAdress(String homeAdress) {
            studentToBuild.setHomeAdress(homeAdress);
            return this;
        }
        public Builder setUniversity(String university) {
            studentToBuild.setUniversity(university);
            return this;
        }
        public Builder setFaculty(String faculty) {
            studentToBuild.setFaculty(faculty);
            return this;
        }
        public Builder setSpeciality(Speciality speciality) {
            studentToBuild.setSpeciality(speciality);
            return this;
        }
        public Builder setCourse(int course) {
            studentToBuild.setCourse(course);
            return this;
        }
        public Builder setGroup(int group) {
            studentToBuild.setGroup(group);
            return this;
        }
        public Builder setAverageScore(int averageScore) {
            studentToBuild.setAverageScore(averageScore);
            return this;
        }
        public Builder setIsScholarship(boolean isScholarship) {
            studentToBuild.setScholarship(isScholarship);
            return this;
        }
        public Builder setLastNameGroupCaptain(String lastNameGroupCaptain) {
            studentToBuild.setLastNameGroupCaptain(lastNameGroupCaptain);
            return this;
        }
        public Builder setFirstNameGroupCaptain(String firstNameGroupCaptain) {
            studentToBuild.setFirstNameGroupCaptain(firstNameGroupCaptain);
            return this;
        }
        public Builder setNationality(String nationality) {
            studentToBuild.setNationality(nationality);
            return this;
        }
        public Builder setMaritalStatus(MaritalStatus maritalStatus) {
            studentToBuild.setMaritalStatus(maritalStatus);
            return this;
        }
        public Builder setIsDriver(boolean isDriver) {
            studentToBuild.setDriver(isDriver);
            return this;
        }
        public Builder setHobby(String hobby) {
            studentToBuild.setHobby(hobby);
            return this;
        }
        public Builder setFirstNameTeaсher(String firstNameTeaсher) {
            studentToBuild.setFirstNameTeaсher(firstNameTeaсher);
            return this;
        }
        public Builder setLastNameTeacher(String lastNameTeacher) {
            studentToBuild.setLastNameTeacher(lastNameTeacher);
            return this;
        }
        public Builder setDiplomaTopic(String diplomaTopic) {
            studentToBuild.setDiplomaTopic(diplomaTopic);
            return this;
        }

        // Method returns a built Student object with all parameters
        public Student build() {
            return studentToBuild;
        }


    }
}
