package prototype;

public class PlasticTree extends Tree {
    private String mass;
    private String height;
    private String position;

    public PlasticTree(String mass) {
        this.mass = mass;
    }

    public PlasticTree(String mass, String height) {
        this.mass = mass;
        this.height = height;
    }

    public PlasticTree(String mass, String height, String position) {
        this.mass = mass;
        this.height = height;
        this.position = position;
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
        PlasticTree plasticTreeClone = new PlasticTree(getMass(), getHeight());
        plasticTreeClone.setPosition(getPosition());
        return plasticTreeClone;
    }

    @Override
    public String toString() {
        return "PlasticTree{" +
                "mass='" + mass + '\'' +
                ", height='" + height + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}