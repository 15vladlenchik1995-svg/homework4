public class Main {
    public static void main(String[] args) {
        //Задача№1
        int age = 17;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ",то он достиг совершеннолетия  ");
        } else {
            System.out.println("Если возраст человека равен " + age + ",то он не достиг сове" +
                    "ршеннолетия ,нужно не много подождать");
        }

        //Задача №2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице холодно,нужно надеть шапку");
        } else {
            System.out.println("На улице тепло,можно идти без шапки");
        }
        //Задача №3
        int speed = 61;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " ,то придётся заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        //Задача №4
        int ageThreshold = 25;
        if (ageThreshold >= 2 && ageThreshold <= 6) {
            System.out.println("Если ребёнку " + ageThreshold + ",то ему нужно ходить в детский сад ");
        }

        if (ageThreshold >= 7 && ageThreshold <= 17) {
            System.out.println("Если человеку " + ageThreshold + " ,то ему нужно ходить в школу ");
        }
        if (ageThreshold >= 18 && ageThreshold <= 24) {
            System.out.println("Если возраст человека " + ageThreshold + " ,то его место в университете");


        }
        if (ageThreshold > 24) {
            System.out.println("Если человеку " + ageThreshold + " ,то он должнен ходить на работу");
        }

        //Задача №5
        int attractionAge = 14;
        if (attractionAge < 5) {
            System.out.println("Если возраст ребёнка " + attractionAge + ", то нельзя кататься на аттракционе");
        } else if (attractionAge >= 5 && attractionAge <=14) {
            System.out.println("Если возраст ребёнка " + attractionAge + ", то можно кататься на аттракционе в сопровождении взрослых");
        } else {
            System.out.println("Если возраст человека " + attractionAge + ", то можно кататься без сопровождения взрослых");
        }
        //Задача №6
        int isThereRoomOrNot = 100;
        int maximumCapacity = 102;
        int canYouSit = 60;
        int occupiedSeats = Math.min(isThereRoomOrNot, canYouSit);
        int availableStanding = maximumCapacity - isThereRoomOrNot;

        if (isThereRoomOrNot >= canYouSit && availableStanding > 0) {
            System.out.println("Мест сидя нет, но есть места стоя");
        } else if (isThereRoomOrNot < canYouSit) {
            System.out.println("В вагоне есть места сидя");
        } else {
            System.out.println("Мест в автобусе нет");
        }
        //Задача №7
        int one = 9;
        int two = 2;
        int three = 6;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число:" + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число:" + two);
        } else if (three >= one && three >= two) {
            System.out.println("Наибольшее число:" + three);
        }



    }
}