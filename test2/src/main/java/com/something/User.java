package com.something;

public class User {
    private int Id;
    String Username;
    String FirstName;
    String LastName;
    int Age;

    public User(int id, String username, String firstName, String lastName, int age) {
        Id = id;
        Username = username;
        FirstName = firstName;
        LastName = lastName;
        Age = age;
    }

    public void greet() {
        System.out.println("Welcome from " + this.Username + "!");
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "User [Id=" + Id + ", Username=" + Username + ", FirstName=" + FirstName + ", LastName=" + LastName
                + ", Age=" + Age + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Id;
        result = prime * result + ((Username == null) ? 0 : Username.hashCode());
        result = prime * result + ((FirstName == null) ? 0 : FirstName.hashCode());
        result = prime * result + ((LastName == null) ? 0 : LastName.hashCode());
        result = prime * result + Age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (Id != other.Id)
            return false;
        if (Username == null) {
            if (other.Username != null)
                return false;
        } else if (!Username.equals(other.Username))
            return false;
        if (FirstName == null) {
            if (other.FirstName != null)
                return false;
        } else if (!FirstName.equals(other.FirstName))
            return false;
        if (LastName == null) {
            if (other.LastName != null)
                return false;
        } else if (!LastName.equals(other.LastName))
            return false;
        if (Age != other.Age)
            return false;
        return true;
    }

}
