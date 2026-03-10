
package com.index.pack;
 class Mobile{
	 String model;
	 int price;
	 
	Mobile(){
			model="Samsung";
			price=20000;
	}
			
			void display() {
				System.out.println("model is: "+ model);
				System.out.println("price is: "+ price);
			}
				public static void main(String[] args) {
					Mobile m1=new Mobile();
					m1.display();
				
	}
 }
