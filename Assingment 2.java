
package U4ProgrammingA2;

import java.util.Iterator;

public class Player implements Actions {

    protected String firstName;

    protected String lastName;

    protected String teamName;

    int count = 0;

    public void player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamName = firstName + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeamName() {
        return teamName;
    }

    @Override
    public void setFirstName() {
        System.out.println("Enter first name");
        this.firstName = InputFactory.SC.next();
    }

    @Override
    public void setLastName() {
        System.out.println("Enter last name");
        this.lastName = InputFactory.SC.next();
    }

    @Override
    public void setTeam() {
        this.teamName = firstName + lastName;
    }

    @Override
    public void addToArrayList() {
        String deats = (firstName + "\t" + lastName + "\t" + teamName);
        ShortStore.listPlayer.add(deats);
    }

    @Override
    public void add() {
        while (ShortStore.listPlayer.size() <= 20) {
            setFirstName();
            setLastName();
            setTeam();
            addToArrayList();
        }
        Menu menu = new Menu();
    }

    @Override
    public void view() {
        if (ShortStore.listPlayer.isEmpty()) {
            System.out.println("Add players first");
        }
        System.out.println("list" + ShortStore.listPlayer);
        Iterator itr = ShortStore.listPlayer.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

    @Override
    public void remove() {
        ShortStore.listPlayer.clear();
    }
}
