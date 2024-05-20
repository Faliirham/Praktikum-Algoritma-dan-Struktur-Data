package Kuis2;

public class LLVoliMain {
    public static void main(String[] args) {
        LinkedListVoli league = new LinkedListVoli();

        
        league.addTeam("JAKARTA STIN BIN");
        league.addTeam("PALEMBANG BANK SUMSEL BABEL");
        league.addTeam("JAKARTA LAVANI ALLO BANK");
        league.addTeam("JAKARTA BHAYANGKARA PRESISI");
        league.addTeam("JAKARTA PERTAMINA PERTAMAX");
        league.addTeam("KUDUS SUKUN BADAK");
        league.addTeam("JAKARTA BNI 46");
        league.addTeam("SURABAYA BIN SAMATOR");
        league.addTeam("JAKARTA GARUDA JAYA");

        //WEEK1
        league.updateMatch("Jakarta BNI 46", 0, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Surabaya BIN Samator", 2, "Palembang Bank Sumsel Babel", 3);
        league.updateMatch("Jakarta STIN BIN", 3, "Kudus Sukun Badak", 1);
        league.updateMatch("Jakarta Pertamina Pertamax", 0, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Palembang Bank Sumsel Babel", 0);
        league.updateMatch("Kudus Sukun Badak", 1, "Surabaya BIN Samator", 3);
        league.updateMatch("Jakarta STIN BIN", 3, "Jakarta BNI 46", 0);
        league.updateMatch("Surabaya BIN Samator", 3, "Jakarta Pertamina Pertamax", 0);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Jakarta BNI 46", 0);
        league.updateMatch("Jakarta STIN BIN", 2, "Jakarta LavAni Allo Bank", 3);
        //WEEK2
        league.updateMatch("Kudus Sukun Badak", 0, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Jakarta BNI 46", 2, "Jakarta Pertamina Pertamax", 3);
        league.updateMatch("Jakarta STIN BIN", 3, "Palembang Bank Sumsel Babel", 0);
        league.updateMatch("Kudus Sukun Badak", 0, "Jakarta BNI 46", 3);
        league.updateMatch("Surabaya BIN Samator", 3, "Jakarta Bhayangkara Presisi", 1);
        league.updateMatch("Jakarta STIN BIN", 3, "Jakarta Pertamina Pertamax", 1);
        league.updateMatch("Surabaya BIN Samator", 1, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Kudus Sukun Badak", 1, "Jakarta Bhayangkara Presisi", 3);
        league.updateMatch("Palembang Bank Sumsel Babel", 0, "Jakarta Pertamina Pertamax", 3);
        
        league.updateMatch("Jakarta STIN BIN", 1, "Jakarta Bhayangkara Presisi", 3);
        league.updateMatch("Palembang Bank Sumsel Babel", 2, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Kudus Sukun Badak", 3, "Jakarta Pertamina Pertamax", 0);
        league.updateMatch("Surabaya BIN Samator", 1, "Jakarta BNI 46", 3);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Jakarta LavAni Allo Bank", 2);
        league.updateMatch("Kudus Sukun Badak", 1, "Palembang Bank Sumsel Babel", 3);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Jakarta Pertamina Pertamax", 0);
        league.updateMatch("Jakarta STIN BIN", 3, "Surabaya BIN Samator", 0);
        league.updateMatch("Jakarta BNI 46", 3, "Palembang Bank Sumsel Babel", 1);

        league.updateMatch("Jakarta STIN BIN", 3, "Surabaya BIN Samator", 0);
        league.updateMatch("Kudus Sukun Badak", 0, "Jakarta Bhayangkara Presisi", 3);
        league.updateMatch("Palembang Bank Sumsel Babel", 0, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Jakarta BNI 46", 0, "Surabaya BIN Samator", 3);
        league.updateMatch("Jakarta Pertamina Pertamax", 1, "Jakarta Bhayangkara Presisi", 3);
        league.updateMatch("Jakarta LavAni Allo Bank", 3, "Kudus Sukun Badak", 0);
        league.updateMatch("Palembang Bank Sumsel Babel", 0, "Jakarta STIN BIN", 3);
        league.updateMatch("Kudus Sukun Badak", 0, "Jakarta BNI 46", 3);
        league.updateMatch("Jakarta Pertamina Pertamax", 2, "Jakarta STIN BIN", 3);
        league.updateMatch("Palembang Bank Sumsel Babel", 1, "Surabaya BIN Samator", 3);

        league.updateMatch("Jakarta LavAni Allo Bank", 3, "Surabaya BIN Samator", 1);
        league.updateMatch("Jakarta STIN BIN", 3, "Jakarta BNI 46", 1);
        league.updateMatch("Palembang Bank Sumsel Babel", 0, "Jakarta Bhayangkara Presisi", 3);
        league.updateMatch("Jakarta LavAni Allo Bank", 3, "Jakarta STIN BIN", 0);
        league.updateMatch("Kudus Sukun Badak", 0, "Jakarta Pertamina Pertamax", 3);
        league.updateMatch("Palembang Bank Sumsel Babel", 0, "Jakarta BNI 46", 3);
        league.updateMatch("Kudus Sukun Badak", 0, "Surabaya BIN Samator", 3);
        league.updateMatch("Jakarta LavAni Allo Bank", 3, "Jakarta Pertamina Pertamax", 0);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Jakarta BNI 46", 2);

        league.updateMatch("Palembang Bank Sumsel Babel", 2, "Jakarta LavAni Allo Bank", 3);
        league.updateMatch("Jakarta Bhayangkara Presisi", 3, "Jakarta Pertamina Pertamax", 1);
        league.updateMatch("Surabaya BIN Samator", 3, "Jakarta BNI 46", 0);
        league.updateMatch("Kudus Sukun Badak", 3, "Jakarta STIN BIN", 1);
        league.updateMatch("Jakarta Pertamina Pertamax", 0, "Surabaya BIN Samator", 3);
        league.updateMatch("Jakarta LavAni Allo Bank", 3, "Jakarta Bhayangkara Presisi", 0);
        league.updateMatch("Jakarta Pertamina Pertamax", 3, "Jakarta BNI 46", 1);
        league.updateMatch("Palembang Bank Sumsel Babel", 3, "Kudus Sukun Badak", 2);
        league.updateMatch("Jakarta STIN BIN", 3, "Jakarta Bhayangkara Presisi", 0);
        
        league.sortTeams();
        league.printStandings();
    }
}
