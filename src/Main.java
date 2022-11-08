public class Main {
    public static void main(String[] args) {

        // Boy деген класс тузунуз поляларын бериниз маанилерин сеттер менен киргизип геттер аркылуу алыныз .
        // Main класста 1 метод тузушунуз керек .Эгерде баланын жашы 18 ден чон болсо жана универде окубаса
        // армияга барышын керек деп чыгыш керек эгер окуп жаткан болсо бул окуп жатат деген билдируу чыгышы керек.
        // 18ден кичине болсо армияга жашын жетелек деп чыксын.

        checkAge();

    }
    public static void checkAge(){
        Boy boy = new Boy();
        boy.setName("Amangeldi");
        boy.setAge((byte) 17);
        boy.setStudy(false);
        if (boy.getAge() >= 18 && boy.getStudy() == false){
            System.out.println(boy.getName()+" Армияга барышын керек.");
        }else if (boy.getAge() >= 18 && boy.getStudy() == true){
            System.out.println(boy.getName()+" Окуп жатат.");
        }else if (boy.getAge() < 18 && boy.getAge() > 0){
            System.out.println(boy.getName()+" Армияга жашын жете элек.");
        }else {
            System.out.println("Туура эмес маалымат киргизилди.");
        }
    }

}