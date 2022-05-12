package com.chainsys.unittest;
import classandmethods.Movie;
public class MovieTest {


/**
	 * 
	 * @author vetr3139
	 *
	 */

		public static void testMovie(){


			Movie firstMovie=new Movie ();
			firstMovie.setmovieName("Beast");
	        firstMovie.setactorName("Vijay");
	        firstMovie.setlanguage("Tamil");
	        firstMovie.setyearOfmovie(2022);
			System.out.println(firstMovie.getmovieName());
			System.out.println(firstMovie.getactorName());
			System.out.println(firstMovie.getlanguage());
			System.out.println(firstMovie.getyearOfmovie());
		}

	}


