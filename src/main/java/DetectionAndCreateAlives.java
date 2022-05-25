import java.io.*;
import java.util.ArrayList;

public class DetectionAndCreateAlives {
   private String path;
     Integer bugDamage,
            bugHealth,
            zombieDamage,
            zombieHealth,
            lionDamage,
            lionHealth,
            zombieDogHealth,
              zombieDogDamage;


    public DetectionAndCreateAlives(String path) throws FileNotFoundException {
        this.path = path;
    }

    File scenario=new File("C:\\Users\\PC\\Desktop\\Yeni Metin Belgesi (3).txt");


    BufferedReader br
            = new BufferedReader(new FileReader(scenario));

  private  ArrayList<Alive> alives=new ArrayList<Alive>();


    Integer findNumbersInString(String string){
        char[] chars = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                sb.append(c);
            }
        }

        Integer x=Integer.valueOf(sb.toString());

        return x;
    }













    public ArrayList<Alive> readScenario() throws IOException {
    String st;
    Hero hero=new Hero("hero",0,0);


    while ((st = br.readLine()) != null) {

        st = st.replaceAll("\\s+","");

        if(st.startsWith("Herohas")){

            hero.setHealt(findNumbersInString(st));
        }

        if(st.startsWith("Heroattack")){
            hero.setDamagePower(findNumbersInString(st));

        }



        if(st.startsWith("Zombieattack")){
           zombieDamage=findNumbersInString(st);

        }

        if(st.startsWith("Zombiehas")){
           zombieHealth=findNumbersInString(st);
        }
        if(st.startsWith("Bugattack")){
            bugDamage=findNumbersInString(st);
        }

        if(st.startsWith("Bughas")){
            bugHealth=findNumbersInString(st);
        }

        if(st.startsWith("Lionattack")){
            lionDamage=findNumbersInString(st);
        }

        if(st.startsWith("Lionhas")){
            lionHealth=findNumbersInString(st);
        }

        if(st.startsWith("ZombieDogattack")){
           zombieDogDamage=findNumbersInString(st);

        }

        if(st.startsWith("ZombieDoghas")){
            zombieDogHealth=findNumbersInString(st);
        }




     if(st.startsWith("ThereisaBug")){
         alives.add(new Bug("bug",bugHealth,bugDamage,findNumbersInString(st)));
     }
     if(st.startsWith("ThereisaLion")){
            alives.add(new Lion("lion",lionHealth,lionDamage,findNumbersInString(st)));
        }
     if(st.startsWith("ThereisaZombie")){
            alives.add(new Zombie("zombie",zombieHealth,zombieDamage,findNumbersInString(st)));
        }
        if(st.startsWith("ThereisaZombieDog")){
        alives.add(new ZombieDog("zombiedog",zombieDogHealth,zombieDogDamage,findNumbersInString(st)));
        }







    }




        alives.add(hero);
      return alives;
    }




}
