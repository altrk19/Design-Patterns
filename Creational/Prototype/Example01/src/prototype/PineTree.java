package prototype;

public class PineTree extends Tree {
    private String mass;
    private String height;
    private String position;

    public PineTree(String mass, String height) {
        this.mass = mass;
        this.height = height;
    }

    public String getMass() {
        return mass;
    }

    public void setMass(String mass) {
        this.mass = mass;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(getMass(), getHeight());
        pineTreeClone.setPosition(getPosition());
        return pineTreeClone;
    }

    @Override
    public String toString() {
        return "PineTree{" +
                "mass='" + mass + '\'' +
                ", height='" + height + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}