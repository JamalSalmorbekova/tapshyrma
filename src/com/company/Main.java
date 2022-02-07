package com.company;

public class Main {

    public static void main(String[] args) {
//

        Balyk balyk = new Balyk(); // Вызов класса  Balyk
        balyk.setBdlina(45);
        balyk.setBparoda("Ласось");
        balyk.setWeight(3);
        balyk.setBadres("Ыссык кол");

         System.out.println("Балыктын узундугу -" + balyk.getBdlina()+ "см.; Пародасы - "+ balyk.getBparoda()+";   Салмагы - " + balyk.getWeight()+"кг.;  Жашаган  жери "+ balyk.getBadres()+";");

        Myschyk myschyk = new Myschyk(); // Вызов класса  Myschyk
        myschyk.setMdlina(25);
        myschyk.setMparoda("Мейн Кун");
        myschyk.setMweight(2);
        myschyk.setMadres("Уйдо");

        System.out.println("Мышыктын  бою -   "+myschyk.getMdlina()+"см.;  Пародасы - " + myschyk.getMparoda() + ";  Салмагы  "+ myschyk.getMweight()+"кг. ; Жашаган  жери -" + myschyk.getMadres()+";");

            Popugai popugai = new Popugai(); // Вызов класса  Popugai
            popugai.setPdlina(34);
            popugai.setPparoda("Какаду");
            popugai.setPweight(3);
            popugai.setPadres("Кошунанын  уйундо ");

                System.out.println("Попугайдын бою  -  " + popugai.getPdlina()+ "см.; Пародасы - "+ popugai.getPparoda()+";   Салмагы - " + popugai.getPweight()+"кг.;  Жашаган  жери - "+ popugai.getPadres()+(";"));



            }
}
