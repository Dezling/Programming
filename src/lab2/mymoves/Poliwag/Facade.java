package lab2.mymoves.Poliwag;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade(){
        super(Type.NORMAL, 70, 100);
    }
    private boolean flag;
    @Override
    protected void applyOppDamage(Pokemon poc, double damage){
        Status cond = poc.getCondition();
        flag = true;
        if (cond.equals(Status.POISON) || cond.equals(Status.BURN) || cond.equals(Status.PARALYZE)) {
            poc.setMod(Stat.HP, -2*(int)Math.round(damage));
        }
    }
    @Override
    protected String describe(){
        if(flag) return "Использует Facade, нанося двойной урон";
        else return "Использует Facade";
    }
}
