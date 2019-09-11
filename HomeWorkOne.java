/*
 * Name: Andrey Primakov
 * Date:09-11-2019
 * Course Number:CSC-111-D01
 * Course Name:Intr Java Programming Language
 * Email:aprimakov@student.stcc.edu
 * Short Description of the Problem:This program displayes population of country X that has a 
 * starting population of 312,032,486
 */
package HomeWorkOne;
public class Main {

	public static void main(String[] args) {
		System.out.println("Current population is:" + 312032486); //declares the initial population of country x
		System.out.println("Population one year form now:" + (312032486+(31536000/7)-(31536000/13)+(31536000/45)));//Declares population of country x one year from starting point.
		System.out.println("Population two years form now:" + (312032486+(2*(31536000/7))-(2*(31536000/13))+(2*(31536000/45))));//Declares population of country x two years from starting point.
		System.out.println("Population three years form now:" + (312032486+(3*(31536000/7))-(3*(31536000/13))+(3*(31536000/45))));//Declares population of country x three year from starting point.
		System.out.println("Population four years form now:" + (312032486+(4*(31536000/7))-(4*(31536000/13))+(4*(31536000/45))));//Declares population of country x four year from starting point.
		System.out.println("Population four years form now:" + (312032486+(5*(31536000/7))-(5*(31536000/13))+(5*(31536000/45))));//Declares population of country x five year from starting point.

	}

}
