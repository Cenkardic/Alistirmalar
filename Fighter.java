public class Fighter {

    String Name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String Name, int damage, int health, int weight, int dodge) {
        this.Name = Name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;

    }

    int hit(Fighter rakip) {
        System.out.println(this.Name + " " + rakip.Name + "'e " + this.damage + " kadar hasar vurdu");



        if (rakip.isDodge()){
            System.out.println(rakip.Name+" Yumruğu blokladı");
            return rakip.health;
        }

        if (rakip.health - this.damage < 0) {
            return 0;
        }
        return rakip.health - this.damage;

    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
