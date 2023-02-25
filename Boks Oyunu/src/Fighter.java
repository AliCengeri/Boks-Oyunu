public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    int dodge;

    Fighter(String name, int damage, int health, int weight, int dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
    }

    int hit(Fighter enemy) {
        System.out.println(this.name + " -> " + enemy.name + " " + this.damage + " hasar vurdu!");
        if (enemy.isDodge()) {
            System.out.println(enemy.name + " Gelen hasarı blokladı");
            return enemy.health;
        }
        if (enemy.health - this.damage < 0) {
            return 0;
        }
        return enemy.health - this.damage;
    }

    boolean isDodge() {
        double randomNumber = Math.random() * 100;
        return randomNumber <= this.dodge;
    }
}
