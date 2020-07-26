package lesson10;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Basketballer basketballer = new Basketballer();
        basketballer.setName("Stephen");
        basketballer.setSurname("Curry");
        basketballer.setGender("man");
        basketballer.setAge(32);
        basketballer.setCountry("America");
        basketballer.setSalary(150.000);
        basketballer.setBasketballClub("Golden State Warriors ");
        basketballer.setGrowth(200);

        System.out.println("Name:" + basketballer.getName());
        System.out.println("Surname:" + basketballer.getSurname());
        System.out.println("Gender:" + basketballer.getGender());
        System.out.println("Age:" + basketballer.getAge());
        System.out.println("Country:" + basketballer.getCountry());
        System.out.println("Salary:" + basketballer.getSalary());
        System.out.println("Basketball Club:" + basketballer.getBasketballClub());
        System.out.println("Growth:" + basketballer.getGrowth());

        basketballer.profession();
        basketballer.motto();
        basketballer.basketballerSay();
        basketballer.relaxDays();
        basketballer.relaxDays(2);
        basketballer.training(4);
        basketballer.trainingHours(4);
        basketballer.trainingType("running");
        basketballer.trainingPlace("gym");

        Footballer footballer = new Footballer();
        footballer.setName("Lionel");
        footballer.setSurname("Messi");
        footballer.setGender("man");
        footballer.setAge(33);
        footballer.setCountry("Argentina");
        footballer.setSalary(250.500);
        footballer.setFootballClub("Barcelona");
        footballer.setSquadNumber(10);

        System.out.println("Name:" + footballer.getName());
        System.out.println("Surname:" + footballer.getSurname());
        System.out.println("Gender:" + footballer.getGender());
        System.out.println("Age:" + footballer.getAge());
        System.out.println("Country:" + footballer.getCountry());
        System.out.println("Salary:" + footballer.getSalary());
        System.out.println("Football Club:" + footballer.getFootballClub());
        System.out.println("Squad number:" + footballer.getSquadNumber());

        footballer.profession();
        footballer.motto();
        footballer.footballerCan();
        footballer.relaxDays();
        footballer.relaxDays(1);
        footballer.training(5);
        footballer.trainingHours(4);
        footballer.trainingType("running");
        footballer.trainingPlace("stadium");

        TennisPlayer tennisPlayer = new TennisPlayer();
        tennisPlayer.setName("Serena Jameka");
        tennisPlayer.setSurname("Williams");
        tennisPlayer.setGender("women");
        tennisPlayer.setAge(38);
        tennisPlayer.setCountry("America");
        tennisPlayer.setSalary(200.500);
        tennisPlayer.setAward(true);
        tennisPlayer.setSingles(true);

        System.out.println("Name:" + tennisPlayer.getName());
        System.out.println("Surname:" + tennisPlayer.getSurname());
        System.out.println("Gender:" + tennisPlayer.getGender());
        System.out.println("Age:" + tennisPlayer.getAge());
        System.out.println("Country:" + tennisPlayer.getCountry());
        System.out.println("Salary:" + tennisPlayer.getSalary());
        System.out.println("Awards:" + tennisPlayer.isAward());
        System.out.println("Singles:" + tennisPlayer.isSingles());

        tennisPlayer.profession();
        tennisPlayer.motto();
        tennisPlayer.tennisPlayerAim();
        tennisPlayer.relaxDays();
        tennisPlayer.relaxDays(0);
        tennisPlayer.training(7);
        tennisPlayer.trainingHours(4);
        tennisPlayer.trainingType("physical exercises");
        tennisPlayer.trainingPlace("tennis court");

        Coat coat = new Coat();
        coat.setSize(42);
        coat.setSeason("autumn");
        coat.setGender("for women");
        coat.setStyle("Classic");
        coat.setColor("black");
        coat.setPrice(1679.70);
        coat.setHood(false);
        coat.setWaterproof(false);

        System.out.println("Size:" + coat.getSize());
        System.out.println("Season:" + coat.getSeason());
        System.out.println("Gender:" + coat.getGender());
        System.out.println("Style:" + coat.getStyle());
        System.out.println("Color:" + coat.getColor());
        System.out.println("Price:" + coat.getPrice());
        System.out.println("Hood:" + coat.isHood());
        System.out.println("Waterproof:" + coat.isWaterproof());

        coat.clothesAre();
        coat.outerwearChoice();
        coat.coatDefinition();
        coat.styleRecommendation();
        coat.sizeRecommendation();
        coat.weekendDiscount();
        coat.cardDiscount();

        Jacket jacket = new Jacket();
        jacket.setSize(46);
        jacket.setSeason("Spring");
        jacket.setGender("women");
        jacket.setStyle("Evening");
        jacket.setColor("white");
        jacket.setPrice(350.0);
        jacket.setMaterial("costume fabric");
        jacket.setPrints(false);

        System.out.println("Size:" + jacket.getSize());
        System.out.println("Season:" + jacket.getSeason());
        System.out.println("Gender:" + jacket.getGender());
        System.out.println("Style:" + jacket.getStyle());
        System.out.println("Color:" + jacket.getColor());
        System.out.println("Price:" + jacket.getPrice());
        System.out.println("Material:" + jacket.getMaterial());
        System.out.println("Prints:" + jacket.isPrints());

        jacket.clothesAre();
        jacket.outerwearChoice();
        jacket.jacketDefinition();
        jacket.styleRecommendation();
        jacket.sizeRecommendation();
        jacket.weekendDiscount();
        jacket.cardDiscount();

        FurCoat furCoat = new FurCoat();
        furCoat.setSize(44);
        furCoat.setSeason("Winter");
        furCoat.setGender("women");
        furCoat.setStyle("Casual");
        furCoat.setColor("brown");
        furCoat.setPrice(12000.0);
        furCoat.setNaturalFur(false);
        furCoat.setClasp("buttons");

        System.out.println("Size:" + furCoat.getSize());
        System.out.println("Season:" + furCoat.getSeason());
        System.out.println("Gender:" + furCoat.getGender());
        System.out.println("Style:" + furCoat.getStyle());
        System.out.println("Color:" + furCoat.getColor());
        System.out.println("Price:" + furCoat.getPrice());
        System.out.println("Natural Fur:" + furCoat.isNaturalFur());
        System.out.println("Claps:" + furCoat.getClasp());

        furCoat.clothesAre();
        furCoat.outerwearChoice();
        furCoat.furDefinition();
        furCoat.styleRecommendation();
        furCoat.sizeRecommendation();
        furCoat.weekendDiscount();
        furCoat.cardDiscount();
    }
}
