package com.vsprog.anitipick;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DOTA ANTI PICK Application
 */
public class Main extends Application {
    public static void main(String[] args) throws IOException {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        HeroesBuilder heroesBuilder = new HeroesBuilder();
        List<Hero> heroes = heroesBuilder.loadHeroesInfo();

        Pick pick = new Pick();
        pick.setFirstHero(heroesBuilder.getHeroByName(heroes, "Dazzle"));
        pick.setSecondHero(heroesBuilder.getHeroByName(heroes, "Tusk"));
        pick.setThirdHero(heroesBuilder.getHeroByName(heroes, "Puck"));
        pick.setFourthHero(heroesBuilder.getHeroByName(heroes, "Naga Siren"));
        pick.setFifthHero(heroesBuilder.getHeroByName(heroes, "Anti-Mage"));

        Pick anitiPick = new Pick();
        List<String> enemies = new ArrayList<String>();
        enemies.addAll(pick.getFirstHero().getEnemies());
        enemies.addAll(pick.getSecondHero().getEnemies());
        enemies.addAll(pick.getThirdHero().getEnemies());
        enemies.addAll(pick.getFourthHero().getEnemies());
        enemies.addAll(pick.getFifthHero().getEnemies());

        for (String enemy : enemies) {
            System.out.println(enemy);
        }

//        System.out.println(enemies);






//        List<Image> images = heroesBuilder.loadImageHeroes(heroesBuilder.loadHeroesInfo());

        /*String cssBordering = "-fx-border-color:darkblue ; \n" //#090a0c
                + "-fx-border-insets:3;\n"
                + "-fx-border-radius:7;\n"
                + "-fx-border-width:1.0";
        ImageView lft = new ImageView(images.get(0));

        HBox top = new HBox();
        top.getChildren().add(lft);
        top.setStyle(cssBordering);

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("context.fxml"));
        stage.setTitle("DOTA ANTI PICK v.1.0.0");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();*/
    }
}

/*
        HeroesBuilder heroesBuilder = new HeroesBuilder();
        List<Image> images = heroesBuilder.loadImageHeroes(heroesBuilder.loadHeroesInfo());

        StackPane stackPane = new StackPane();

        List<ImageView> imageView = new ArrayList<ImageView>();
        for (Image image : images) {
            imageView.add(new ImageView(image));
        }

        stackPane.getChildren().addAll(imageView);

        Scene scene = new Scene(stackPane);

        stage.setScene(scene);
        stage.setResizable(false);
 */