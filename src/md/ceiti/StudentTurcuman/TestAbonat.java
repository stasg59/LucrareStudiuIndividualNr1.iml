package md.ceiti.StudentTurcuman;

import java.util.Scanner;

public class TestAbonat {
    public static void main(String[] args){
        int idTest;
        String numeTest;
        String prenumeTest;
        String patronimicTest;
        String orasTest;
        String stradaTest;
        int numarTellTest;
        int pretAbonamentTest;
        float minInternTest;
        float minExternTest;

        Abonat[] abn = new Abonat[25]; // declar un vector de elemente de tip Abonat
        Scanner sc = new Scanner(System.in); // declar scannerul pentru
        System.out.print("Introduceti numarul de abonati: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            abn[i] = new Abonat(); // crearea abonatilor
            System.out.println("Abonatul " + i + ": ");

            System.out.print("ID: ");
            idTest = sc.nextInt();
            abn[i].setId(idTest);

            System.out.print("Nume: ");
            numeTest = sc.nextLine() + sc.nextLine();
            abn[i].setNume(numeTest);

            System.out.print("Prenume: ");
            prenumeTest = sc.nextLine();
            abn[i].setPrenume(prenumeTest);

            System.out.print("Patronimic: ");
            patronimicTest = sc.nextLine();
            abn[i].setPatronimic(patronimicTest);

            System.out.print("Orasul: ");
            orasTest = sc.nextLine();
            abn[i].setOras(orasTest);

            System.out.print("Strada: ");
            stradaTest = sc.nextLine();
            abn[i].setStrada(stradaTest);

            System.out.print("Telefon: ");
            numarTellTest = sc.nextInt();
            abn[i].setNumarTell(numarTellTest);

            System.out.print("Pret Abonament: ");
            pretAbonamentTest = sc.nextInt();
            abn[i].setPretAbonament(pretAbonamentTest);

            System.out.print("Minute interne vorbite: ");
            minInternTest = sc.nextFloat();
            abn[i].setMinIntern(minInternTest);

            System.out.print("Minute externe (internationale) vorbite: ");
            minExternTest = sc.nextFloat();
            abn[i].setMinExtern(minExternTest);

            System.out.println("===========================================");
        }

        for(int i = 1; i <= n; i++){ // afisarea datelor
            System.out.println("===============DATE ABONAT" + " " + i + "===============");
            abn[i].getDate();
        }

        System.out.println("===============================================");
        System.out.println("Verificarea datelor abonatilor al unui abonament");
        System.out.print("Introduceti pretul abonamentului: ");
        int auxPret = sc.nextInt();
        System.out.println("Datele Abonamentului:");
        int k = 0;
        for(int i = 1; i <= n; i++) {
            if (abn[i].getPretAbonament() == auxPret) { //verificarea pretului conform conditiei
                System.out.println("===========================================");
                abn[i].getDate();
                k++; // se foloseste pentru a verifica daca s-a efectuat iterarea pentru a cauta cazurile ”else”
            }
        }
        if(k == 0) // se cauta cazurile else
            System.out.println("ERROR!VALOARE GRESITA!");

        System.out.println("===============================================");
        System.out.println("Abonatii care au vorbit >=30 minute internationale:");
        for(int i = 1; i <= n; i++){
            if(abn[i].getMinExtern() >= 30){ //caut abonatii care au vorbit >=30 minute internationale
                System.out.println("===========================================");
                abn[i].getDate();
            }
        }

        System.out.println("===============================================");
        System.out.println("Verificarea datelor al unui abonat conform Id-ului");
        System.out.print("Introduceti Id-ul Abonatului: ");
        int auxId = sc.nextInt();
        k = 0;
        for(int i = 1; i <= n; i++){
            if(abn[i].getId() == auxId) { //verificarea id-ului conform conditiei
                System.out.println("===========================================");
                abn[i].getDate();
                k++; // se foloseste pentru a verifica daca s-a efectuat iterarea pentru a cauta cazurile ”else”
            }
        }
        if(k == 0) // se cauta cazurile else
            System.out.println("ERROR!VALOARE GRESITA!");

        System.out.println("===============================================");
        System.out.println("Verificarea datelor al unui abonat conform numarului de telefon");
        System.out.print("Introduceti numarul Abonatului: ");
        int auxNr = sc.nextInt();
        k = 0;
        for(int i = 1; i <= n; i++){
            if(abn[i].getNumarTell() == auxNr){ //verificarea numarului de telefon conform conditiei
                System.out.println("===========================================");
                abn[i].getDate();
                k++; // se foloseste pentru a verifica daca s-a efectuat iterarea pentru a cauta cazurile ”else”
            }
        }
        if(k == 0) // se cauta cazurile else
            System.out.println("ERROR!VALOARE GRESITA!");

        System.out.println("===============================================");
        System.out.println("Abonatii din Chisinau care au vorbit intern (national) intre 30 si 60 minute:");
        k = 0;
        String auxOras = "Chisinau";
        for(int i = 1; i <= n; i++) {
            if (abn[i].getOras().equals(auxOras)) { // verific daca orasul este Chisinau
                if ((abn[i].getMinIntern() >= 30) && (abn[i].getMinIntern() <= 60)) { //verific daca abonatul a vorbit intre 30 si 60 minute interne
                    System.out.println("===========================================");
                    abn[i].getDate();
                    k++; // se foloseste pentru a verifica daca s-a efectuat iterarea pentru a cauta cazurile ”else”
                }
            }
        }
        if(k == 0) // se cauta cazurile else
            System.out.println("ERROR!VALOARE GRESITA!");

    }
}
