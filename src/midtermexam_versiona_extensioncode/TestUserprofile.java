/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package midtermexam_versiona_extensioncode;

/**
 *
 * @author Sharif
 */
import java.util.*;

public class TestUserprofile {

    public static void main(String[] args) {
        createProfile();
    }

    public static void createProfile() {
        System.out.println("Enter your name: ");
        Scanner scan = new Scanner(System.in);
        String userName = scan.nextLine();

        UserProfile profile = new UserProfile();
        System.out.println("Choose you favourite Genre ");
        String selectedGenre = scan.nextLine();
        for (int i = 0; i < profile.getGenres().length; i++) {
            String[] favGen = new String[4];
            favGen = profile.getGenres();
            System.out.println(favGen[i]);
            if (selectedGenre.equals(favGen[i])) {
                System.out.println(userName + " your profile is created");
                break;
            } else if (!selectedGenre.equals(favGen[i])) {
                System.out.println(userName + " you did not choose a listed genre ");
                break;
            } else {
                continue;
            }

        }

    }

}

