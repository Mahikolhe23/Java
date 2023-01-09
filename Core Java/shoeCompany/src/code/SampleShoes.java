package code;

import java.util.ArrayList;
import static code.Category.*;
import static code.Color.*;
import static code.Type.*;
import static java.time.LocalDate.parse;	

public class SampleShoes {
	public static ArrayList<Shoe> populateShoeList() {
		ArrayList<Shoe> arr = new ArrayList<>();
		arr.add(new Shoe(RUNNING, parse("2022-01-01"), 10, parse("2022-01-01"), 9.5, 1200.0, BLACK, 10.0, MEN));
		arr.add(new Shoe(SNEAKER, parse("2021-04-06"), 11, parse("2022-01-02"), 8.5, 1500.0, GREY, 10.0, KIDS));
		arr.add(new Shoe(SPORTS, parse("2020-10-09"), 15, parse("2022-01-03"), 7.5, 1600.0, WHITE, 10.0, WOMEN));
		arr.add(new Shoe(WALKING, parse("2019-11-11"), 14, parse("2022-01-04"), 10, 800.0, GREY, 10.0, MEN));
		arr.add(new Shoe(RUNNING, parse("2018-09-19"), 19, parse("2022-01-05"), 6.5, 500.0, BLACK, 10.0, KIDS));
		return arr;
	}
}
