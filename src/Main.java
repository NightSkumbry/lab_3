import entities.They;
import entities.humans.Button;
import entities.humans.Human;
import entities.humans.Motley;
import entities.humans.Small;
import entities.humans.Stupid;
import entities.humans.Wizard;
import enums.Areas;
import enums.Connections;
import enums.Modificators;
import enums.Moves;
import enums.Relatives;
import exceptions.HumanCantStop;
import places.Corner;
import places.Pavement;
import places.Place;


public class Main {
    public static void main(String[] args) {
        Connections normalConnections = new Connections("и ", ", ", ". ", ": ");

        // На следующем углу волшебник неожиданно остановился и тихо сказал
        Wizard wizard = new Wizard("Волшебник", Moves.WALKING);
        Place corner = new Corner("следующем углу", Relatives.ON);
        wizard.setLocation(corner);
        try {
            wizard.stop(Modificators.SUDDENLY);
        }
        catch (HumanCantStop e) {
            System.err.println(e);
        }
        System.out.print(normalConnections.and());
        wizard.say(Modificators.QUIETLY);
        System.out.print(normalConnections.colon());

        // Незнайка, Кнопочка и Пёстренький остановились
        Human[] thrio = {new Stupid("Незнайка", Moves.WALKING), new Button("Кнопочка", Moves.WALKING), new Motley("Пёстренький", Moves.WALKING)};
        String[] syms = {normalConnections.comma(), normalConnections.and(), normalConnections.dot()};
        for (int i = 0; i < thrio.length; i++) {
            try {
                thrio[i].stop();
            }
            catch (HumanCantStop e) {
                System.err.println(e);
            }
            try {
                System.out.print(syms[i]);
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.err.println(e);
            }
        }

        // Прямо перед ними посреди тротуара стояли малыш и малышка
        They onlyThrio = new They("ними");
        onlyThrio.setArea(Areas.RIGHT_IN_FRONT_OF);
        onlyThrio.selfArea();
        Small smallBoy = new Small("малыш", Moves.STAND);
        Small smallGirl = new Small("малышка", Moves.STAND);
        Place pavement = new Pavement("тротуар", Relatives.IN_THE_MIDDLE);
        smallBoy.setLocation(pavement);
        smallGirl.setLocation(pavement);
        smallBoy.move();
        System.out.print(normalConnections.and());
        smallGirl.move();
        System.out.print(normalConnections.dot());

        // Они крепко держались за руки
        They onlySmall = new They("они");
        onlySmall.holdHands(Modificators.STRONGLY);
        System.out.print(normalConnections.comma());

        // Смотрели друг на дружку, не спуская глаз
        onlySmall.lookAt(Modificators.EACH_OTHER);
        System.out.print(normalConnections.comma());
        onlySmall.lookAt(Modificators.STATIC_EYES);
        System.out.print(normalConnections.comma());
        System.out.print(normalConnections.and());

        // ничего и никого не замечали вокруг.
        onlySmall.notRecognizing(Modificators.NOTHING_AND_NOONE);
        onlySmall.setArea(Areas.NEAR);
        onlySmall.selfArea();
        System.out.print(normalConnections.dot());

    }
}
