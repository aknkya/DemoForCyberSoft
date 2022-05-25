public class Enemy extends Alive{

    private boolean isEnemy=true;

    private Integer enemyPosition;


    public Enemy(String name, Integer health, Integer damagePower, Integer enemyPosition) {
        super(name, health, damagePower);

        this.enemyPosition = enemyPosition;
    }


    public Integer getEnemyPosition() {
        return enemyPosition;
    }

    public void setEnemyPosition(Integer enemyPosition) {
        this.enemyPosition = enemyPosition;
    }

    public boolean isEnemy() {
        return isEnemy;
    }

    public void setEnemy(boolean enemy) {
        isEnemy = enemy;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "isEnemy=" + isEnemy +
                ", enemyPosition=" + enemyPosition +
                '}';
    }
}
