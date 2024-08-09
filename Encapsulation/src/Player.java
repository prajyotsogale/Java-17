public class Player {
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        health -= damage;
        if(health<0){
            health = 0;
            System.out.println("0 hp You lost!!");
            return;
        }
        //System.out.println("Remaining Health: "+health);

    }
    public void restoreHealth(int extraHealth){
        health += extraHealth;
        if(health>100){
            health = 100;

        }
        //System.out.println("Total health: "+health);
    }
    public int healthRemaining(){
        return health;
    }
}
