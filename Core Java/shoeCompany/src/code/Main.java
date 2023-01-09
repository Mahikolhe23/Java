package code;

import static java.time.LocalDate.parse;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Shoe> shoes = SampleShoes.populateShoeList();
		try (Scanner in = new Scanner(System.in)) {
			boolean exit = false;
			while (!exit) {
				try {
					System.out.println("Enter choice to Perform Operation");
					System.out.println(
							"1.Add New Shoe 2.Update Shoe Price 3.Update Shoe Stock 4.Remove Shoe which are out of stock from 4 month "
									+ "5.Remove Shoe Not sold in last 6 Month");
					switch (in.nextInt()) {
					case 1:
						System.out.println("Enter Shoe Details as :  category,  listDate,  stock,  stockUpdateDate, "
								+ " size,  price, color,  discount,  gender");
						shoes.add(new Shoe(Category.valueOf(in.next()), parse(in.next()), in.nextInt(),
								parse(in.next()), in.nextDouble(), in.nextDouble(), Color.valueOf(in.next()),
								in.nextDouble(), Type.valueOf(in.next())));
						System.out.println("Shoe Added to Stock");
						break;
					case 2:
						System.out.println("Enter the Shoe Id to update Price");
						int id = in.nextInt();
						for (Shoe s : shoes) {
							if (s.getID() == id) {
								System.out.println("Enter new price ");
								s.setPrice(in.nextDouble());
								System.out.println("Price updated");
								break;
							} else
								throw new CustomeException("ID NOT FOUND");
						}
						break;
					case 3:
						System.out.println("Enter Shoe ID to update stock");
						id = in.nextInt();
						for (Shoe s : shoes) {
							if (s.getID() == id) {
								System.out.println("Enter New Qty");
								s.setStock(in.nextInt());
								System.out.println("Stock Added");
								break;
							} else
								throw new CustomeException("ID NOT FOUND");
						}
						break;
					case 4:
						System.out.println("Enter Date to check 4 month back stock");
						LocalDate d = LocalDate.now();
						LocalDate dd = d.minusMonths(4);
						for (Shoe s : shoes) {
							int i = s.getStock();
							if (s.getStockUpdateDate().isBefore(dd) && i == 0) {
								shoes.remove(s);
								System.out.println("Old Stock removed successfully");
							} else
								throw new CustomeException("No Older Stock found");
						}
						break;
					case 5:
						System.out.println("6 Month not sold ");
						for (Shoe shoe : shoes) {
							if (shoe.getStockUpdateDate().isBefore(LocalDate.now().minusMonths(6))) {
								shoes.remove(shoe);
								System.out.println("Not sold stock Remove succcess");
							} else
								throw new CustomeException("Not stock found");
						}
						break;

					default:
						break;
					}

				} catch (Exception e) {
					e.printStackTrace();
					in.nextLine();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
