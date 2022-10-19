package lab2;

import lab2.mypokemons.*;
import lab2.mypokemons.Zekrom;
import ru.ifmo.se.pokemon.Battle;


public class Program{

    //https://pokemondb.net/pokedex/zekrom
    //https://pokemondb.net/pokedex/tangela
    //https://pokemondb.net/pokedex/tangrowth
    //https://pokemondb.net/pokedex/poliwag
    //https://pokemondb.net/pokedex/poliwhirl
    //https://pokemondb.net/pokedex/poliwrath


    public static void main(String[] args){

        Battle b = new Battle();
        Tangela Tangela = new Tangela("Ван дарк холм", 1);
        Zekrom Zekrom = new Zekrom("Билли Хэрингтон", 1);
        Tangrowth Tangrowth = new Tangrowth("ВАН ДАРК ХОЛМ В ЛАТЕКСЕ", 2);
        Poliwag Poliwag = new Poliwag("Марк волк", 1);
        Poliwhirl Poliwhirl = new Poliwhirl("Марк WOLLF", 2);
        Poliwrath Poliwrath = new Poliwrath("ГИГАЧАД МАРК WOLF", 3);
        b.addAlly(Zekrom);
        b.addAlly(Tangela);
        b.addAlly(Tangrowth);

        b.addFoe(Poliwag);
        b.addFoe(Poliwhirl);
        b.addFoe(Poliwrath);

        b.go();

    }
    public static boolean chance(double d){
        return d > Math.random();
    }
}
