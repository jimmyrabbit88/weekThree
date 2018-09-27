public class Animal {
    private String type;
    private String[] continents;
    private float weight;
    private int age;


    public Animal(String type, String[] continents, float weight, int age){
        this.type = type;
        this.continents = continents;
        this.weight = weight;
        this.age = age;
    }

    public Animal(){
      this.type = "No";
      this.age = 0;
      this.continents = null;
        //this ("No Type Specified",null, 0.0f, 0);
    }

    public String toString(){
        String str = "";

        str = ("Type: " + type + "\nContinents: \n");
        if (continents == null){
            str += "no continents\n";
        }
        else {
            for (int i = 0; i < continents.length; i++) {
                str += ("      " + continents[i] + "\n");
            }
        }
        str +=("Weight: " + weight +"\nAge: " + age);
        return str;
    }

    public String getType() {
        return type;
    }

    public String[] getContinents() {
        return continents;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setContinents(String[] continents) {
        this.continents = continents;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

