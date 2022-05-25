
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) throws IOException {




       DetectionAndCreateAlives  detectionAndCreateAlives=new DetectionAndCreateAlives("C:\\Users\\PC\\Desktop\\Yeni Metin Belgesi (3).txt");



        ArrayList<Alive> enemies=detectionAndCreateAlives.readScenario();

        Hero hero=null;

        Iterator<Alive> iterator=enemies.iterator();



        ArrayList<Enemy> enemies2=new ArrayList<Enemy>();

        while (iterator.hasNext()) {
            Alive alive = iterator.next();

            if (alive instanceof Hero) {
                hero = (Hero) alive;
                iterator.remove();


            }
            else
                enemies2.add((Enemy) alive);
        }


              //Enemy sorted by distance
               enemies2.sort((o1, o2) ->o1.getEnemyPosition().compareTo(o2.getEnemyPosition()) );
               hero.startJourney(enemies2);

         





    }
}
