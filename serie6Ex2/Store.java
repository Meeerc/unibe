package serie6Ex2;

import java.util.Scanner;

import serie6.Order;

import java.util.*;


//***************************************************
//Datei fuer Serie 6, Teilaufgabe 2
//***************************************************


public class Store 
{
	private ArrayList<IArticle> articles = new ArrayList<IArticle>();
	private ArrayList<Order> orders = new ArrayList<Order>();

	/** starts the menu */
	public void interactWithUser()
	{
		String answer = "";
		while ( !answer.equals( "9" ) ) {
			System.out.println( " =============================================================" );
			System.out.println( "|                                                             |" );
			System.out.println( "|  1. Create a new order     2. Show all registered articles  |" );
			System.out.println( "|  3. Show all orders        9. Exit                          |" );
			System.out.println( "|                                                             |" );
			System.out.println( " =============================================================" );
			Scanner scn = new Scanner( System.in );
			System.out.print( "\nWhat do you want to do? " );
			answer = scn.nextLine();
			if ( answer.equals( "1" ) ) {
				this.newOrder();
			} else if ( answer.equals( "2" ) ) {
				this.listArticles();
				System.out.println( "" );
			} else if ( answer.equals( "3" ) ) {
				this.listOrders();
			}
		}
	}

	/** Add a new article to the store */
	public void addArticle( IArticle a )
	{
		articles.add( a );
	}
}