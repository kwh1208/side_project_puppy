package walkway.project.dto;

public class Trail {
    private int number;
    private String name;
    private String location;

    public Trail() {}

    public Trail(int number, String name, String location) {
        this.number = number;
        this.name = name;
        this.location = location;
    }

    @Override
    public String toString() {
        return "Trail{" + "number=" + number + ", name='" + name + '\'' + ", location='" + location + '\'' + '}';
    }
}

