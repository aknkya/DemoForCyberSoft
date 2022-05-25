import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Hero extends Alive implements FightWithEnemy {

    public Hero(String name,Integer health,Integer damagePower) {
        super(name,health,damagePower);
    }


    @Override
    public Integer startJourney(ArrayList<Enemy> enemies) throws IOException {
        FileWriter fileWriter = new FileWriter("Yeni Metin Belgesi putput.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);

                 System.out.println("Hero started journey with " +getHealt()+" HP !");

                 printWriter.printf("Hero started journey with " +getHealt()+" HP !"+ "\n");
                 Integer position=0;

      for (Enemy enemy:enemies) {



             Integer getDmgCount=enemy.getHealt()/getDamagePower();

             setHealt(getHealt()-(getDmgCount*enemy.getDamagePower()));

          if(getHealt()<0){
              position=enemy.getEnemyPosition();
              System.out.println(enemy.getName()+" defated Hero with " + enemy.getHealt() + " HP  remaining ");
              printWriter.printf(enemy.getName()+" defated Hero with " + enemy.getHealt() + " HP  remaining "+ "\n");
              break;
          }

              System.out.println("Hero defated "+enemy.getName()+" with "+getHealt()+" remaining");
              printWriter.printf("Hero defated "+enemy.getName()+" with "+getHealt()+" remaining"+ "\n");


        }

       if(getHealt()>0){
           System.out.println("Hero Survived!");
           printWriter.printf("Hero Survived!");
       }
       else {
           System.out.println("Hero is Dead !! Last seen at position " + position);
           printWriter.printf("Hero is Dead !! Last seen at position " + position+ "\n");

       }
       printWriter.close();
        return null;
    }
}
