package sg.edu.np.mad22.p02.practicalapp;

public class User{
    String Name;
    String Description;
    int Id;
    boolean Followed;
    public User(){} // wait why do we still need this?

    public User(String n, String desc, int id, boolean follow){
        Name = n;
        Description = desc;
        Id = id;
        Followed = follow;
    }
}