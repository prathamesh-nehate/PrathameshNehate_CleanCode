package subtask2;

class Material {
    private String name;
    private int costPerSqaureFeet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCostPerSqaureFeet() {
        return costPerSqaureFeet;
    }

    public void setCostPerSqaureFeet(int costPerSqaureFeet) {
        this.costPerSqaureFeet = costPerSqaureFeet;
    }

    public Material(String name, int costPerSqaureFeet) {
        this.name = name;
        this.costPerSqaureFeet = costPerSqaureFeet;
    }
}
