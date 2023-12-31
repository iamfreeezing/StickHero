package com.project.stickhero;

import javafx.animation.Transition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.util.Duration;

public class Data {

    private static int highScore;
    private static int permanentHeartScore;
    public static int heartScore=0;
    public static int prevRoundScore=0;
    public static int heartCounter=0;


    public static ImageView generateHeart(){

            StickHero.setHeart(new ImageView(new Image("file:./heart.png")));;
            StickHero.getHeart().setLayoutX((StickHero.getSecondPillar().getLayoutX()+StickHero.getFirstPillar().getWidth())/2 - 20);
            StickHero.getHeart().setLayoutY(StickHero.getFirstPillar().getLayoutY()+10);
            StickHero.getHeart().setFitHeight(70);
            StickHero.getHeart().setFitWidth(70);
            StickHero.getHeart().toFront();
            TranslateTransition heartMove = new TranslateTransition(Duration.seconds(0.5), StickHero.getHeart());
            heartMove.setByY(-10);
            heartMove.setCycleCount(Transition.INDEFINITE);
            heartMove.setAutoReverse(true);
            heartMove.play();
            return StickHero.getHeart();

    }

    public static int getHighScore() {
        return highScore;
    }

    public static void setHighScore(int highScore) {
        Data.highScore = highScore;
    }

    public static int getpermanentHeartScore() {
        return permanentHeartScore;
    }
    public static void setpermanentHeartScore(int permanentHeartScore) {
        Data.permanentHeartScore = permanentHeartScore;
    }

    public static void purchaseCherries() {

    }



}
