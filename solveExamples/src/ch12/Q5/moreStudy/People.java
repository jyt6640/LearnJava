package ch12.Q5.moreStudy;

public class People {
    private String name;
    private int id;

    public People(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        return id + name.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof People target) {
            if (id == target.id && name == target.name) {
                return true;
            }
        }
        return false;
    }
}
