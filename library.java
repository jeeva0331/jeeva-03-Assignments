
package com.index.pack;
 class Member{
     
     int libraryId;
     String membershiptype;
     
     Member(){
          libraryId=501;
          membershiptype="regular";
         
     }
     void display(){
         System.out.println("libraryId is: " +libraryId);
         System.out.println("membershiptype is: " + membershiptype);
     }
 
     public static void main(String[] args){
         
         Member m1=new Member();
         m1.display();
     }
     
     
     
 }
