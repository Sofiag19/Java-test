package it.micra.fattoria.main;

import it.micra.fattoria.model.Cane;
import it.micra.fattoria.model.Gatto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//aggiungere istanze nel db, eliminarle e visualizzarle
public class Main {
	
	public static void main(String[] args) {
		
		Statement stmt = null;
		
		try {
            String url = "jdbc:mysql://127.0.0.1:3306/farmdb";
            String user = "root";
            String password = "";
 
            Connection conn = DriverManager.getConnection(url, user, password);
            
            if (conn != null) {
                System.out.println("Connected to the database test1");
            }
 
            List animali = new ArrayList();
            System.out.println("================================");
            System.out.println("Benvenuti alla fattoria!");
            System.out.println("================================");
            
            boolean go = true;
            
            while(go) {
            	try {
            		Scanner scanner0 = new Scanner(System.in);
            		System.out.println("Quale animale scegli? [1 Cane ; 2 Gatto]");
            		int animale = scanner0.nextInt();
            		
            		if(animale == 1 || animale == 2) {
            			
            			Scanner scanner1 = new Scanner(System.in);
            			System.out.println("Inserisci il nome");
            			String name = scanner1.nextLine();
            			
            			Scanner scanner2 = new Scanner(System.in);
            			System.out.println("Inserisci il numero di zampe");
            			int zampe = scanner2.nextInt();
            			
            			Scanner scanner3 = new Scanner(System.in);
            			System.out.println("Inserisci il verso");
            			String verso = scanner3.nextLine();
            			
            			if(animale == 1) {
            				Scanner scanner4 = new Scanner(System.in);
            				System.out.println("Inserisci la razza del cane");
            				String razza = scanner4.nextLine();
            				
	        			    stmt = conn.createStatement();
	        			    String sql = "INSERT INTO animale(zampe, verso, nome, razzaCane)"+
	        			    			" VALUES ("+zampe+", '"+verso+"', '"+name+"', '"+razza+"')";
	        			    stmt.executeUpdate(sql);
	        			    
            			} else if (animale == 2) {
            				
            				Scanner scanner4 = new Scanner(System.in);
            				System.out.println("Inserisci il padrone del gatto");
            				String owner = scanner4.nextLine();
            				
            				stmt = conn.createStatement();
	        			    String sql = "INSERT INTO animale(zampe, verso, nome, padroneGatto) VALUES ("+zampe+", '"+verso+"', '"+name+"', '"+owner+"')";
	        			    stmt.executeUpdate(sql);
            			}
            			
            			Scanner scanner = new Scanner(System.in);
            			System.out.println("Continuare? [1 SI ; 2 NO]");
            			int avanti = scanner.nextInt();
            			
            			if(avanti == 2) {
            				go = false;
            			}
            			
            		}
            		
            	} catch(Exception e) {
            		
            		System.out.println("================================");
            		System.out.println("Valore errato..Ritenta!");
            		System.out.println("Exception: " + e);
            		System.out.println("================================");
            		
            	}
            	
            }
            
            stmt = conn.createStatement();
            String query = "SELECT * from animale";
            ResultSet rs = stmt.executeQuery(query);
            
            while (rs.next())
            {
              int id = rs.getInt("idAnimale");
              int zampe = rs.getInt("zampe");
              String verso = rs.getString("verso");
              String nome = rs.getString("nome");
              String padroneGatto = rs.getString("padroneGatto");
              String razzaCane = rs.getString("razzaCane");
              
              // print the results
              System.out.format("%s, %s, %s, %s, %s, %s\n", id, zampe, verso, nome, padroneGatto, razzaCane);
            }
            
            for (int i = 0 ; i < animali.size(); i++) {
            	System.out.println("Animale(" + i + ") : " + animali.get(i));
            }
            
        } catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
		

	}

}
