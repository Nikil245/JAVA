
class Cricket {
    public String formatName;

    public Cricket(String formatName) {
        this.formatName = formatName;
    }

    public String rule() {
        return "Cricket is an outdoor sport played between two teams of 11 players each.";
    }
}

class TestMatch extends Cricket {

    public TestMatch() {
        super("Test Match");
    }

    @Override
    public String rule() {
        return "Played for 5 days, no fixed number of overs per team.";
    }
}

class OneDay extends Cricket {

    public OneDay() {
        super("One Day International");
    }

    @Override
    public String rule() {
        return "Played for 1 day, 50 overs per team.";
    }
}

class T20 extends Cricket {

    public T20() {
        super("T20 International");
    }

    @Override
    public String rule() {
        return "Played for 1 day, 20 overs per team.";
    }
}

class IPL extends Cricket {

    public IPL() {
        super("IPL");
    }

    @Override
    public String rule() {
        return "Played for 1 day, 20 overs per team, but it is not an international tournament.";
    }
}

class Gully extends Cricket {

    public Gully() {
        super("Gully Cricket");
    }

    // Inherits the default rule()
}

public class Cricket_polymorphism {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            Cricket cricket = randomMatch();

            System.out.println(
                    "Format Type " + i +
                    " is " + cricket.formatName +
                    ". The Rule is: " + cricket.rule());

            System.out.println();
        }
    }

    public static Cricket randomMatch() {

        int randomNumber = (int) (Math.random() * 5) + 1;

        System.out.println("Random Number: " + randomNumber);

        switch (randomNumber) {

            case 1:
                return new TestMatch();

            case 2:
                return new OneDay();

            case 3:
                return new T20();

            case 4:
                return new IPL();

            case 5:
                return new Gully();

            default:
                return null;
        }
    }
}