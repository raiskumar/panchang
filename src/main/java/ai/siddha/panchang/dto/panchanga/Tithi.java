package ai.siddha.panchang.dto.panchanga;

/**
 * This is the time during which the difference of the increment of longitude of the Sun and the Moon amounts to 12°.
 */
public class Tithi {
    private String aka = "Lunar Day";
    private String lunarMonth = "29.53 days";

    //Lunar Days
    // Calculator - https://www.birthastro.com/astrology/tithi-finder-birth-tithi-calculator
    private String[] values = {
            "Prathma", "Dwitiya", "Trithiya", "Chaturthi", "Panchami", "Shashti", "Saptmi", "Ashtami", "Navami", "Dakshami", "Ekadashi", "Dwadashi", "Trayodashi", "Chaturdashi", "Purnima", // Shukla Paksha
            "Prathma", "Dwitiya", "Trithiya", "Chaturthi", "Panchami", "Shashti", "Saptmi", "Ashtami", "Navami", "Dakshami", "Ekadashi", "Dwadashi", "Trayodashi", "Chaturdashi", "Amavasya"  // Krishna Paksha
    };
    private String pakshas[] = {"Sukla Paksha", "Krishna Paksha"};

    private String[]
            vaara = {"Ravivar", "Somvar", "Mangalwar", "Budhawar", "Guruwar","Shukrawar", "Shaniwar"};

}
