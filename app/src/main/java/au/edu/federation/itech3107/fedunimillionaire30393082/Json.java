package au.edu.federation.itech3107.fedunimillionaire30393082;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import au.edu.federation.itech3107.fedunimillionaire30393082.Bean.Question;

public class Json {

    private  String Questions_easy= "[\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What does a funambulist walk on?\",\n" +
            "    \"correct_answer\": \"A Tight Rope\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Broken Glass\",\n" +
            "      \"Balls\",\n" +
            "      \"The Moon\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the largest organ of the human body?\",\n" +
            "    \"correct_answer\": \"Skin\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Heart\",\n" +
            "      \"large Intestine\",\n" +
            "      \"Liver\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Which sign of the zodiac is represented by the Crab?\",\n" +
            "    \"correct_answer\": \"Cancer\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Libra\",\n" +
            "      \"Virgo\",\n" +
            "      \"Sagittarius\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"On a dartboard, what number is directly opposite No. 1?\",\n" +
            "    \"correct_answer\": \"19\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"20\",\n" +
            "      \"12\",\n" +
            "      \"15\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What type of animal was Harambe, who was shot after a child fell into it's enclosure at the Cincinnati Zoo?\",\n" +
            "    \"correct_answer\": \"Gorilla\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Tiger\",\n" +
            "      \"Panda\",\n" +
            "      \"Crocodile\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the nickname of the US state of California?\",\n" +
            "    \"correct_answer\": \"Golden State\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Sunshine State\",\n" +
            "      \"Bay State\",\n" +
            "      \"Treasure State\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Which American-owned brewery led the country in sales by volume in 2015?\",\n" +
            "    \"correct_answer\": \"D. G. Yuengling and Son, Inc\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Anheuser Busch\",\n" +
            "      \"Boston Beer Company\",\n" +
            "      \"Miller Coors\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"According to Sherlock Holmes, 'If you eliminate the impossible, whatever remains, however improbable, must be the...'\",\n" +
            "    \"correct_answer\": \"Truth\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Answer\",\n" +
            "      \"Cause\",\n" +
            "      \"Source\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the name of Poland in Polish?\",\n" +
            "    \"correct_answer\": \"Polska\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Pupcia\",\n" +
            "      \"Polszka\",\n" +
            "      \"Polski\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"The New York Times slogan is, 'All the News That's Fit to...'\",\n" +
            "    \"correct_answer\": \"Print\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Digest\",\n" +
            "      \"Look\",\n" +
            "      \"Read\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What do the letters of the fast food chain KFC stand for?\",\n" +
            "    \"correct_answer\": \"Kentucky Fried Chicken\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Kentucky Fresh Cheese\",\n" +
            "      \"Kibbled Freaky Cow\",\n" +
            "      \"Kiwi Food Cut\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Which sign of the zodiac comes between Virgo and Scorpio?\",\n" +
            "    \"correct_answer\": \"Libra\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Gemini\",\n" +
            "      \"Taurus\",\n" +
            "      \"Capricorn\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is Tasmania?\",\n" +
            "    \"correct_answer\": \"An Australian State\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"A flavor of Ben and Jerry's ice-cream\",\n" +
            "      \"A Psychological Disorder\",\n" +
            "      \"The Name of a Warner Brothers Cartoon Character\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"In which fast food chain can you order a Big Mac?\",\n" +
            "    \"correct_answer\": \"McDonald's\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"KFC\",\n" +
            "      \"Subway\",\n" +
            "      \"Hungry Jack's\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Which of the following is the IATA code for Manchester Airport?\",\n" +
            "    \"correct_answer\": \"MAN\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"EGLL\",\n" +
            "      \"LHR\",\n" +
            "      \"EGCC\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the Zodiac symbol for Gemini?\",\n" +
            "    \"correct_answer\": \"Twins\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Fish\",\n" +
            "      \"Scales\",\n" +
            "      \"Maiden\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"The likeness of which president is featured on the rare $2 bill of USA currency?\",\n" +
            "    \"correct_answer\": \"Thomas Jefferson\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Martin Van Buren\",\n" +
            "      \"Ulysses Grant\",\n" +
            "      \"John Quincy Adams\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is Cynophobia the fear of?\",\n" +
            "    \"correct_answer\": \"Dogs\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Birds\",\n" +
            "      \"Flying\",\n" +
            "      \"Germs\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Terry Gilliam was an animator that worked with which British comedy group?\",\n" +
            "    \"correct_answer\": \"Monty Python\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"The Goodies\",\n" +
            "      \"The League of Gentlemen&lrm;\",\n" +
            "      \"The Penny Dreadfuls\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"When someone is inexperienced they are said to be what color?\",\n" +
            "    \"correct_answer\": \"Green\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Red\",\n" +
            "      \"Blue\",\n" +
            "      \"Yellow\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"How many furlongs are there in a mile?\",\n" +
            "    \"correct_answer\": \"Eight\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Two\",\n" +
            "      \"Four\",\n" +
            "      \"Six\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"When someone is cowardly, they are said to have what color belly?\",\n" +
            "    \"correct_answer\": \"Yellow\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Green\",\n" +
            "      \"Red\",\n" +
            "      \"Blue\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the name of NASA's most famous space telescope?\",\n" +
            "    \"correct_answer\": \"Hubble Space Telescope\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Big Eye\",\n" +
            "      \"Death Star\",\n" +
            "      \"Millenium Falcon\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Earth is located in which galaxy?\",\n" +
            "    \"correct_answer\": \"The Milky Way Galaxy\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"The Mars Galaxy\",\n" +
            "      \"The Galaxy Note\",\n" +
            "      \"The Black Hole\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"The Canadian $1 coin is colloquially known as a what?\",\n" +
            "    \"correct_answer\": \"Loonie\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Boolie\",\n" +
            "      \"Foolie\",\n" +
            "      \"Moodie\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Who is the author of Jurrasic Park?\",\n" +
            "    \"correct_answer\": \"Michael Crichton\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Peter Benchley\",\n" +
            "      \"Chuck Paluhniuk\",\n" +
            "      \"Irvine Welsh\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"Which of the following is not the host of a program on NPR?\",\n" +
            "    \"correct_answer\": \"Ben Shapiro\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Terry Gross\",\n" +
            "      \"Ira Glass\",\n" +
            "      \"Peter Sagal\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What is the French word for 'fish'?\",\n" +
            "    \"correct_answer\": \"poisson\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"fiche\",\n" +
            "      \"escargot\",\n" +
            "      \"mer\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"When was the Playstation 3 released?\",\n" +
            "    \"correct_answer\": \"November 11, 2006\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"January 8, 2007\",\n" +
            "      \"December 25, 2007\",\n" +
            "      \"July 16, 2006\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"easy\",\n" +
            "    \"question\": \"What kind of aircraft was developed by Igor Sikorsky in the United States in 1942?\",\n" +
            "    \"correct_answer\": \"Helicopter\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Stealth Blimp\",\n" +
            "      \"Jet\",\n" +
            "      \"Space Capsule\"\n" +
            "    ]\n" +
            "  }\n" +
            "]";
    private String Questions_medium="[\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What is the world's most expensive spice by weight?\",\n" +
            "    \"correct_answer\": \"Saffron\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Cinnamon\",\n" +
            "      \"Cardamom\",\n" +
            "      \"Vanilla\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which river flows through the Scottish city of Glasgow?\",\n" +
            "    \"correct_answer\": \"Clyde\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Tay\",\n" +
            "      \"Dee\",\n" +
            "      \"Tweed\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"When was the Declaration of Independence approved by the Second Continental Congress?\",\n" +
            "    \"correct_answer\": \"July 4, 1776\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"May 4, 1776\",\n" +
            "      \"June 4, 1776\",\n" +
            "      \"July 2, 1776\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Rolex is a company that specializes in what type of product?\",\n" +
            "    \"correct_answer\": \"Watches\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Cars\",\n" +
            "      \"Computers\",\n" +
            "      \"Sports equipment\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which essential condiment is also known as Japanese horseradish?\",\n" +
            "    \"correct_answer\": \"Wasabi \",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Mentsuyu\",\n" +
            "      \"Karashi\",\n" +
            "      \"Ponzu\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"In 2013 how much money was lost by Nigerian scams?\",\n" +
            "    \"correct_answer\": \"$12.7 Billion\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"$95 Million\",\n" +
            "      \"$956 Million\",\n" +
            "      \"$2.7 Billion\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which of the following buildings is example of a structure primarily built in the Art Deco architectural style?\",\n" +
            "    \"correct_answer\": \"Niagara Mohawk Building\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Taipei 101\",\n" +
            "      \"One Detroit Center\",\n" +
            "      \"Westendstrasse 1\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What alcoholic drink is mainly made from juniper berries?\",\n" +
            "    \"correct_answer\": \"Gin\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Vodka\",\n" +
            "      \"Rum\",\n" +
            "      \"Tequila\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What did the Spanish autonomous community of Catalonia ban in 2010, that took effect in 2012?\",\n" +
            "    \"correct_answer\": \"Bullfighting\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Fiestas\",\n" +
            "      \"Flamenco\",\n" +
            "      \"Mariachi\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which of these is the name of a Japanese system of alternative medicine, literally meaning 'finger pressure'?\",\n" +
            "    \"correct_answer\": \"Shiatsu\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Ukiyo\",\n" +
            "      \"Majime\",\n" +
            "      \"Ikigai\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"In the Morse code, which letter is indicated by 3 dots? \",\n" +
            "    \"correct_answer\": \"S\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"O\",\n" +
            "      \"A\",\n" +
            "      \"C\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What fast food chain has the most locations globally? \",\n" +
            "    \"correct_answer\": \"Subway\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Starbucks\",\n" +
            "      \"McDonalds\",\n" +
            "      \"KFC\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Who is the founder of 'The Lego Group'?\",\n" +
            "    \"correct_answer\": \"Ole Kirk Christiansen\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \" Jens Niels Christiansen\",\n" +
            "      \"Kirstine Christiansen\",\n" +
            "      \" Gerhardt Kirk Christiansen\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What is the last letter of the Greek alphabet?\",\n" +
            "    \"correct_answer\": \"Omega\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Mu\",\n" +
            "      \"Epsilon\",\n" +
            "      \"Kappa\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"When was Hubba Bubba first introduced?\",\n" +
            "    \"correct_answer\": \"1979\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"1984\",\n" +
            "      \"1972\",\n" +
            "      \"1980\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What was Mountain Dew's original slogan?\",\n" +
            "    \"correct_answer\": \"Yahoo! Mountain Dew... It'll tickle your innards!\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Give Me A Dew\",\n" +
            "      \"Do The Dew\",\n" +
            "      \"Get that barefoot feelin' drinkin' Mountain Dew\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What was the soft drink Pepsi originally introduced as?\",\n" +
            "    \"correct_answer\": \"Brad's Drink\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Pepsin Pop\",\n" +
            "      \"Carolina Cola\",\n" +
            "      \"Pepsin Syrup\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Who invented Pastafarianism?\",\n" +
            "    \"correct_answer\": \"Bobby Henderson\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Eric Tignor\",\n" +
            "      \"Bill Nye\",\n" +
            "      \"Zach Soldi\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"In a 1994 CBS interview, Microsoft co-founder Bill Gates performed what unusual trick on camera?\",\n" +
            "    \"correct_answer\": \"Jumping over an office chair\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Jumping backwards over a desk\",\n" +
            "      \"Standing on his head\",\n" +
            "      \"Typing on a keyboard during a handstand\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which slogan did the fast food company, McDonald's, use before their 'I'm Lovin' It' slogan?\",\n" +
            "    \"correct_answer\": \"We Love to See You Smile\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Why Pay More!?\",\n" +
            "      \"Have It Your Way\",\n" +
            "      \"Making People Happy Through Food\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What is real haggis made of?\",\n" +
            "    \"correct_answer\": \"Sheep's Heart, Liver and Lungs\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Sheep's Heart, Kidneys and Lungs\",\n" +
            "      \"Sheep's Liver, Kidneys and Eyes\",\n" +
            "      \"Whole Sheep\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Where did the pineapple plant originate?\",\n" +
            "    \"correct_answer\": \"South America\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Hawaii\",\n" +
            "      \"Europe\",\n" +
            "      \"Asia\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Whose greyscale face is on the kappa emoticon on Twitch?\",\n" +
            "    \"correct_answer\": \"Josh DeSeno\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Justin DeSeno\",\n" +
            "      \"John DeSeno\",\n" +
            "      \"Jimmy DeSeno\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which country has the most Trappist breweries?\",\n" +
            "    \"correct_answer\": \"Belgium\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Netherlands\",\n" +
            "      \"France\",\n" +
            "      \"USA\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What is the currency of Poland?\",\n" +
            "    \"correct_answer\": \"Złoty\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Ruble\",\n" +
            "      \"Euro\",\n" +
            "      \"Krone\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"What is the star sign of someone born on Valentines day?\",\n" +
            "    \"correct_answer\": \"Aquarius\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Pisces\",\n" +
            "      \"Capricorn\",\n" +
            "      \"Scorpio\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"In ancient Greece, if your job were a 'hippeus' which of these would you own?\",\n" +
            "    \"correct_answer\": \"Horse\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Weave\",\n" +
            "      \"Guitar\",\n" +
            "      \"Boat\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which American manufactured submachine gun was informally known by the American soldiers that used it as 'Grease Gun'?\",\n" +
            "    \"correct_answer\": \"M3\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Colt 9mm\",\n" +
            "      \"Thompson\",\n" +
            "      \"MAC-10\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Which logical fallacy means to attack the character of your opponent rather than their arguments?\",\n" +
            "    \"correct_answer\": \"Ad hominem\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Post hoc ergo propter hoc\",\n" +
            "      \"Tu quoque\",\n" +
            "      \"Argumentum ad populum\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"medium\",\n" +
            "    \"question\": \"Frank Lloyd Wright was the architect behind what famous building?\",\n" +
            "    \"correct_answer\": \"The Guggenheim\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Villa Savoye\",\n" +
            "      \"Sydney Opera House\",\n" +
            "      \"The Space Needle\"\n" +
            "    ]\n" +
            "  }\n" +
            "]";
    private String Questions_hard="[\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Electronic music producer Kygo's popularity skyrocketed after a certain remix. Which song did he remix?\",\n" +
            "    \"correct_answer\": \"Ed Sheeran - I See Fire\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Marvin Gaye - Sexual Healing\",\n" +
            "      \"Coldplay - Midnight\",\n" +
            "      \"a-ha - Take On Me\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"What type of dog is 'Handsome Dan', the mascot of Yale University?\",\n" +
            "    \"correct_answer\": \"Bulldog\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Yorkshire Terrier\",\n" +
            "      \"Boxer\",\n" +
            "      \"Pug\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"The words 'bungalow' and 'shampoo' originate from the languages of which country?\",\n" +
            "    \"correct_answer\": \"India\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Papua New Guinea\",\n" +
            "      \"Ethiopia\",\n" +
            "      \"China\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Before the 19th Century, the 'Living Room' was originally called the...\",\n" +
            "    \"correct_answer\": \"Parlor\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Open Room\",\n" +
            "      \"Sitting Room\",\n" +
            "      \"Loft\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"What year was Queen Elizabeth II born?\",\n" +
            "    \"correct_answer\": \"1926\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"1923\",\n" +
            "      \"1929\",\n" +
            "      \"1930\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which of the following chemicals are found in eggplant seeds?\",\n" +
            "    \"correct_answer\": \"Nicotine\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Mescaline\",\n" +
            "      \"Cyanide\",\n" +
            "      \"Psilocybin\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which of the following is an existing family in 'The Sims'?\",\n" +
            "    \"correct_answer\": \"The Goth Family\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"The Family\",\n" +
            "      \"The Simoleon Family\",\n" +
            "      \"The Proud Family\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which of these banks are NOT authorized to issue currency notes in Hong Kong?\",\n" +
            "    \"correct_answer\": \"OCBC\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"HSBC\",\n" +
            "      \"Standard Chartered\",\n" +
            "      \"Bank of China\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"What is the romanized Korean word for 'heart'?\",\n" +
            "    \"correct_answer\": \"Simjang\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Aejeong\",\n" +
            "      \"Jeongsin\",\n" +
            "      \"Segseu\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which musician has collaborated with American producer Porter Robinson and released the 2016 song 'Shelter'?\",\n" +
            "    \"correct_answer\": \"Madeon\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Mat Zo\",\n" +
            "      \"deadmau5\",\n" +
            "      \"Zedd\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Disney's Haunted Mansion is home to a trio of Hitchhiking Ghosts. Which of these is NOT one of them?\",\n" +
            "    \"correct_answer\": \"Harry\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Gus\",\n" +
            "      \"Phineas\",\n" +
            "      \"Ezra\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"How long did it take the motorized window washers of the original World Trade Center to clean the entire exterior of the building?\",\n" +
            "    \"correct_answer\": \"1 Month\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"3 Weeks\",\n" +
            "      \"1 Week\",\n" +
            "      \"2 Months\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which one of these Swedish companies was founded in 1943?\",\n" +
            "    \"correct_answer\": \"IKEA\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"H & M\",\n" +
            "      \"Lindex\",\n" +
            "      \"Clas Ohlson\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"How many calories are in a 355 ml can of Pepsi Cola?\",\n" +
            "    \"correct_answer\": \"150\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"200\",\n" +
            "      \"100\",\n" +
            "      \"155\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"What was Bank of America originally established as?\",\n" +
            "    \"correct_answer\": \"Bank of Italy\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Bank of Long Island\",\n" +
            "      \"Bank of Pennsylvania\",\n" +
            "      \"Bank of Charlotte\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Which product did Nokia, the telecommunications company, originally sell?\",\n" +
            "    \"correct_answer\": \"Paper\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Phones\",\n" +
            "      \"Computers\",\n" +
            "      \"Processors\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Who founded the Khan Academy?\",\n" +
            "    \"correct_answer\": \"Sal Khan\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Ben Khan\",\n" +
            "      \"Kitt Khan\",\n" +
            "      \"Adel Khan\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"In flight systems, what does the initialism 'TCAS' stand for?\",\n" +
            "    \"correct_answer\": \"Traffic Collision Avoidance System\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Traffic Communication Alert System\",\n" +
            "      \"Traffic Configuration Alignment System\",\n" +
            "      \"Traffic Call-sign Abbreviation System\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"If someone said 'you are olid', what would they mean?\",\n" +
            "    \"correct_answer\": \"You smell extremely unpleasant.\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"You are out of shape/weak.\",\n" +
            "      \"Your appearance is repulsive.\",\n" +
            "      \"You are incomprehensible/an idiot.\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Chartreuse is a color between yellow and what?\",\n" +
            "    \"correct_answer\": \"Green\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Red\",\n" +
            "      \"Black\",\n" +
            "      \"Purple\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Nephelococcygia is the practice of doing what?\",\n" +
            "    \"correct_answer\": \"Finding shapes in clouds\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Sleeping with your eyes open\",\n" +
            "      \"Breaking glass with your voice\",\n" +
            "      \"Swimming in freezing water\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Where is Apple Inc. headquartered?\",\n" +
            "    \"correct_answer\": \"Cupertino, California\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Redwood City, California\",\n" +
            "      \"Redmond, Washington\",\n" +
            "      \"Santa Monica, CA\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"If you planted the seeds of Quercus robur, what would grow?\",\n" +
            "    \"correct_answer\": \"Trees\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Grains\",\n" +
            "      \"Vegetables\",\n" +
            "      \"Flowers\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"Located in Chile, El Teniente is the world's largest underground mine for what metal?\",\n" +
            "    \"correct_answer\": \"Copper\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Iron\",\n" +
            "      \"Nickel\",\n" +
            "      \"Silver\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"In the MMO RPG 'Realm of the Mad God', what dungeon is widely considered to be the most difficult?\",\n" +
            "    \"correct_answer\": \"The Shatter's\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"Snake Pit\",\n" +
            "      \"The Tomb of the Acient's\",\n" +
            "      \"The Puppet Master's Theater\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"What is the weight of a Gold Bar in Fallout: New Vegas?\",\n" +
            "    \"correct_answer\": \"35 Pounds\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"30 Pounds\",\n" +
            "      \"40 Pounds\",\n" +
            "      \"32.50 Pounds\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"The Quadrangularis Reversum is best described as which of the following?\",\n" +
            "    \"correct_answer\": \"A percussion instrument\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"A building in Oxford University\",\n" +
            "      \"A chess move\",\n" +
            "      \"A geometric theorem\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"The word 'abulia' means which of the following?\",\n" +
            "    \"correct_answer\": \"The inability to make decisions\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"The inability to stand up\",\n" +
            "      \"The inability to concentrate on anything\",\n" +
            "      \"A feverish desire to rip one's clothes off\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"The word 'aprosexia' means which of the following?\",\n" +
            "    \"correct_answer\": \"The inability to concentrate on anything\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"The inability to make decisions\",\n" +
            "      \"A feverish desire to rip one's clothes off\",\n" +
            "      \"The inability to stand up\"\n" +
            "    ]\n" +
            "  },\n" +
            "  {\n" +
            "    \"category\": \"General Knowledge\",\n" +
            "    \"type\": \"multiple\",\n" +
            "    \"difficulty\": \"hard\",\n" +
            "    \"question\": \"In 'Resident Evil 3', how many inventory slots does Jill have at the start of the game?\",\n" +
            "    \"correct_answer\": \"10\",\n" +
            "    \"incorrect_answers\": [\n" +
            "      \"6\",\n" +
            "      \"8\",\n" +
            "      \"12\"\n" +
            "    ]\n" +
            "  }\n" +
            "]";
    public static String[] diff = new String[11];
    public static String[] question = new String[11];
    public static String[][] Answers = new String[11][4];
    public static String[] ans = new String[11];
    private List<String> list = new ArrayList<>();

    public void JsonQuestoString(){
        int random;
        Gson gson = new Gson();
        List<Question> questions_easy = gson.fromJson(Questions_easy, new TypeToken<List<Question>>() {}.getType());
        for(int i = 0;i<6;i++){
            random = new Random().nextInt(29);
            question[i] = questions_easy.get(random).getQuestion();
            diff[i] = questions_easy.get(random).getDifficulty();
            list = questions_easy.get(random).getIncorrect_answers();
            list.add(questions_easy.get(random).getCorrect_answer());
            Collections.shuffle(list);
            Answers[i] = list.toArray(new String[list.size()]);
            int index_correct = list.indexOf(questions_easy.get(random).getCorrect_answer());
            switch (index_correct){
                case 0:
                    ans[i] ="A";
                    break;
                case 1:
                    ans[i] ="B";
                    break;
                case 2:
                    ans[i] ="C";
                    break;
                case 3:
                    ans[i] ="D";
                    break;

            }
           // Log.i("answer",String.valueOf(index_correct)+ans[i]);
        }
        list.clear();
        List<Question> questions_medium = gson.fromJson(Questions_medium, new TypeToken<List<Question>>() {}.getType());
        for(int i = 6;i<10;i++){
            random = new Random().nextInt(29);
            question[i] = questions_medium.get(random).getQuestion();
            diff[i] = questions_medium.get(random).getDifficulty();
            list = questions_medium.get(random).getIncorrect_answers();
            list.add(questions_medium.get(random).getCorrect_answer());
            Collections.shuffle(list);
            Answers[i] = list.toArray(new String[list.size()]);
            int index_correct = list.indexOf(questions_medium.get(random).getCorrect_answer());
            switch (index_correct){
                case 0:
                    ans[i] ="A";
                    break;
                case 1:
                    ans[i] ="B";
                    break;
                case 2:
                    ans[i] ="C";
                    break;
                case 3:
                    ans[i] ="D";
                    break;

            }
        }
        list.clear();
        List<Question> questions_hard = gson.fromJson(Questions_hard, new TypeToken<List<Question>>() {}.getType());
        for(int i = 9;i<11;i++){
            random = new Random().nextInt(29);
            question[i] = questions_hard.get(random).getQuestion();
            diff[i] = questions_hard.get(random).getDifficulty();
            list = questions_hard.get(random).getIncorrect_answers();
            list.add(questions_hard.get(random).getCorrect_answer());
            Collections.shuffle(list);
            Answers[i] = list.toArray(new String[list.size()]);
            int index_correct = list.indexOf(questions_hard.get(random).getCorrect_answer());
            switch (index_correct){
                case 0:
                    ans[i] ="A";
                    break;
                case 1:
                    ans[i] ="B";
                    break;
                case 2:
                    ans[i] ="C";
                    break;
                case 3:
                    ans[i] ="D";
                    break;

            }
        }
    }
}

