public class Alive {
    private String name;
    private Integer healt;
    private Integer damagePower;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHealt() {
        return healt;
    }

    public void setHealt(Integer healt) {
        this.healt = healt;
    }

    public Integer getDamagePower() {
        return damagePower;
    }

    public void setDamagePower(Integer damagePower) {
        this.damagePower = damagePower;
    }

    public Alive(String name, Integer healt, Integer damagePower) {
        this.name = name;
        this.healt = healt;
        this.damagePower = damagePower;
    }

    @Override
    public String toString() {
        return "Alive{" +
                "name='" + name + '\'' +
                ", healt=" + healt +
                ", damagePower=" + damagePower +
                '}';
    }
}
