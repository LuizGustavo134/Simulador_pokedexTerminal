package controller;
import model.pokemon;
//Classe que simula a região de kanto
public class RegiaoKanto {
    String[] pokemonsKanto = {
            "001Bulbassauro", "002Ivysaur", "003Venusaur", "004Charmander", "005Charmeleon", "006Charizard",
            "007Squirtle", "008Wartortle", "009Blastoise", "010Caterpie", "011Metapod", "012Butterfree",
            "013Weedle", "014Kakuna", "015Beedrill", "016Pidgey", "017Pidgeotto", "018Pidgeot", "019Rattata",
            "020Raticate", "021Spearow", "022Fearow", "023Ekans", "024Arbok", "025Pikachu", "026Raichu",
            "027Sandshrew", "028Sandslash", "029Nidoran♀", "030Nidorina", "031Nidoqueen", "032Nidoran♂",
            "033Nidorino", "034Nidoking", "035Clefairy", "036Clefable", "037Vulpix", "038Ninetales",
            "039Jigglypuff", "040Wigglytuff", "041Zubat", "042Golbat", "043Oddish", "044Gloom", "045Vileplume",
            "046Paras", "047Parasect", "048Venonat", "049Venomoth", "050Diglett", "051Dugtrio", "052Meowth",
            "053Persian", "054Psyduck", "055Golduck", "056Mankey", "057Primeape", "058Growlithe", "059Arcanine",
            "060Poliwag", "061Poliwhirl", "062Poliwrath", "063Abra", "064Kadabra", "065Alakazam", "066Machop",
            "067Machoke", "068Machamp", "069Bellsprout", "070Weepinbell", "071Victreebel", "072Tentacool",
            "073Tentacruel", "074Geodude", "075Graveler", "076Golem", "077Ponyta", "078Rapidash", "079Slowpoke",
            "080Slowbro", "081Magnemite", "082Magneton", "083Farfetch’d", "084Doduo", "085Dodrio", "086Seel",
            "087Dewgong", "088Grimer", "089Muk", "090Shellder", "091Cloyster", "092Gastly", "093Haunter",
            "094Gengar", "095Onix", "096Drowzee", "097Hypno", "098Krabby", "099Kingler", "100Voltorb", "101Electrode",
            "102Exeggcute", "103Exeggutor", "104Cubone", "105Marowak", "106Hitmonlee", "107Hitmonchan",
            "108Lickitung", "109Koffing", "110Weezing", "111Rhyhorn", "112Rhydon", "113Chansey", "114Tangela",
            "115Kangaskhan", "116Horsea", "117Seadra", "118Goldeen", "119Seaking", "120Staryu", "121Starmie",
            "122Mr. Mime", "123Scyther", "124Jynx", "125Electabuzz", "126Magmar", "127Pinsir", "128Tauros",
            "129Magikarp", "130Gyarados", "131Lapras", "132Ditto", "133Eevee", "134Vaporeon", "135Jolteon",
            "136Flareon", "137Porygon", "138Omanyte", "139Omastar", "140Kabuto", "141Kabutops", "142Aerodactyl",
            "143Snorlax", "144Articuno", "145Zapdos", "146Moltres", "147Dratini", "148Dragonair", "149Dragonite",
            "150Mewtwo", "151Mew"
    };
    //gera um pokemon automaticamente com todos atributos
    public void GerarPokemon(){
        int id =0 ;
        String nome =" ";
        String tipo =" ";
        String regiao = "Kanto";
        for (int i = 0; i< pokemonsKanto.length; i++){
            //Usei os chars junto ao for para pesquisar no vetor o pokemon certo
            char id1 = pokemonsKanto[i].charAt(0);
            char id2 = pokemonsKanto[i].charAt(1);
            char id3 = pokemonsKanto[i].charAt(2);
            String idTemp = id1+""+id2+id3;
            id = Integer.parseInt(idTemp);
            //formata o texto nome e remover a numeração
            nome = pokemonsKanto[i].substring(3 );
            // usei o switch para evitar os If's infinitos
            switch (id) {
                case 1, 2, 3, 43, 44, 45, 46, 47, 69, 70, 71, 102, 103, 114:
                    tipo = "Planta";
                    break;

                case 4, 5, 6, 37, 38, 58, 59, 77, 78, 126, 146:
                    tipo = "Fogo";
                    break;

                case 7, 8, 9, 54, 55, 60, 61, 62, 72, 73, 79, 80, 86, 87, 90, 91, 98, 99, 116, 117, 118, 119, 120, 121, 129, 130, 131, 134, 138, 139, 140, 141:
                    tipo = "Água";
                    break;

                case 25, 26, 81, 82, 100, 101, 125, 145:
                    tipo = "Elétrico";
                    break;

                case 10, 11, 12, 13, 14, 15, 48, 49, 123, 127:
                    tipo = "Inseto";
                    break;

                case 23, 24, 29, 30, 31, 32, 33, 34, 41, 42, 88, 89, 109, 110:
                    tipo = "Venenoso";
                    break;

                case 27, 28, 50, 51, 74, 75, 76, 95, 104, 105, 111, 112, 142:
                    tipo = "Terrestre/Rocha";
                    break;

                case 56, 57, 66, 67, 68, 106, 107:
                    tipo = "Lutador";
                    break;

                case 63, 64, 65, 96, 97, 122, 124, 150, 151:
                    tipo = "Psíquico";
                    break;

                case 92, 93, 94:
                    tipo = "Fantasma";
                    break;

                case 147, 148, 149:
                    tipo = "Dragão";
                    break;

                default:
                    tipo = "Normal";
                    break;
            }
            // objeto a ser enviado
            pokemon PP = new pokemon(id,nome,tipo,regiao);
            //instância e metodo da lista desejada
            ListaOficial gg = new ListaOficial();
            gg.GerarLista(PP);
        }

       // teste System.out.println("ID: "+id+" nome: "+nome+" tipo: "+tipo +" região: "+regiao);
        }
}
