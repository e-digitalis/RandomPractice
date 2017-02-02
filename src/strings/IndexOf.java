/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author User
 */
public class IndexOf {

    private String myName;

    public String getFirstName() {
        int spacePosition = myName.indexOf(" ");
        return myName.substring(0, spacePosition);
    }

    public String getLastName() {
        int spacePosition = myName.indexOf(" ");
        return myName.substring(spacePosition + 1);
    }

    public void setName(String newName) {
        myName = newName;

    }

}
