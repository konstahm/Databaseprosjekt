/**
 * Created by Halvor on 14.03.2017.
 */
//import noe som kobler til sql-server

public class Jdbcfil {
    void updateEkstraInfo(int ID, int tid, int lengdegrad, int breddegrad, int høydeOverHavet,int treningsøktID){
        SQL> INSERT INTO Ekstrainfo VALUES (ID, tid, lengdegrad, breddegrad, høydeOverHavet, treningsøktID);
    }

    public static void main(String[] args) {
        System.out.print("hei");
    }
}
