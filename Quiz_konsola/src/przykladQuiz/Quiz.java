package przykladQuiz;
import java.util.Arrays;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Quiz {
	
	
	    String quizQuestions, quizOptions;
	    char ch;
	    int suma=0;
	    Quiz[] quiz=new Quiz[10];
	    
	    public void initialise(){
	        
	        for(int i=0; i<=9; i++) {
	            quiz[i]=new Quiz();

	        }
	    }
	    
	  
	    	

	    	
	    		
	    		


	    public void quizQuestions(){
	        try{
	            quiz[0].quizQuestions="Jak przegl�dasz stron� internetow� na co zwraczasz uwag� w pierszej kolejno�ci?";
	            quiz[1].quizQuestions="Je�li kupowa�by� samoch�d na jakie rzeczy zwr�ci�by� uwag� w pierwszej kolejno�ci?";
	            quiz[2].quizQuestions="Czy lubisz si� uczy� j�zyk�w obcych?";
	            quiz[3].quizQuestions="Jaki zestaw umiej�tno�ci Cie najtrafniej okre�la?";
	            quiz[4].quizQuestions="Gdzie by� najch�tniej sp�dzi� czas wolny:";
	            quiz[5].quizQuestions="Na co zwracasz uwag� najpierw?";
	            quiz[6].quizQuestions="Co jest dla Ciebie wa�niejsze przy szykowaniu prezentacji?";
	            quiz[7].quizQuestions="Z jakiego przedmiotu w szkole by�e� najlepszy? ";
	            quiz[8].quizQuestions="Twoja pasja to: ";
	            quiz[9].quizQuestions="Jak pracujesz?";
	            
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.err.println("Bl�d wybierania!\n"+e.getMessage());
	            System.exit(0);
	        }
	    }
	   
	    public void quizOptions(){
	        try{
	            quiz[0].quizOptions="1: obrazki\n2: uk�ad strony\n3: szata graficzna\n4: efekty specjalne";
	            quiz[1].quizOptions="1: niezawodno��\n2: wygl�d\n3: osi�gi\n4: szybko��";
	            quiz[2].quizOptions="1: tak\n2: raczej tak\n3: raczej nie\n4: zdecydowanie nie";
	            quiz[3].quizOptions="1: pracowity i dok�adny\n2: kreatywny i ch�onny nowych umiej�tno�ci\n3: ostro�ny i podejrzliwy\n4: wzrokowiec i ch�onny nowych wra�e�";
	            quiz[4].quizOptions="1: w interaktywnym laboratorium technologii\n2: w galerii sztuki\n3: na �onie natury \n4: w krzemowej dolinie";
	            quiz[5].quizOptions="1: kolor samochodu\n2: ile koni mechanicznych ma silnik\n3: ile pali benzyny\n4: mark� samochodu";
	            quiz[6].quizOptions="1: tre��\n2: szablon graficzny\n3: funkcjonalno��\n4: animacje i efekty wizualne";
	            quiz[7].quizOptions="1: plastyka\n2: muzyka\n3: fizyka\n4: matematyka ";
	            quiz[8].quizOptions="1: czytanie ksi��ek\n2: sport\n3: rozwi�zywanie zagadek\n4: ogl�danie film�w";
	            quiz[9].quizOptions="1: zawsze w grupie - si�a w pracy zespo�owej\n2: samodzielnie\n3: lubi� konsultowa� si� z innymi w pracy\n4:z nikim nic nie konsultuj�";

	            
	            
	        } 
	        catch(ArrayIndexOutOfBoundsException e){
	            System.err.println("Bl�d wybierania\n"+e.getMessage());
	            System.exit(0);
	        }
	    }

	    public void  quizAnswers(){
	    	
	    
	    }

	    public void play(){
	    	
	    	
		    	
		    	int [][] ans = new int[4][9];
		    	
		    	ans[0][0]= -50;
		    	ans[1][0]= 50;
		    	ans[2][0]= 25;
		    	ans[3][0]= -25;
		    	
		    	ans[0][1]= 75;
		    	ans[1][1]= -50;
		    	ans[2][1]= 25;
		    	ans[3][1]= 55;
		    	
		    	ans[0][2]= 50;
		    	ans[1][2]= 25;
		    	ans[2][2]= -25;
		    	ans[3][2]= 0;
		    	
		    	ans[0][3]= 75;
		    	ans[1][3]= -50;
		    	ans[2][3]= 50;
		    	ans[3][3]= -100;
		    	
		    	ans[0][4]= 100;
		    	ans[1][4]= -100;
		    	ans[2][4]= 0;
		    	ans[3][4]= 50;
		    	
		    	ans[0][5]= 100;
		    	ans[1][5]= -100;
		    	ans[2][5]= 0;
		    	ans[3][5]= 50;
		    	
		    	ans[0][6]= 100;
		    	ans[1][6]= -100;
		    	ans[2][6]= 0;
		    	ans[3][6]= 50;
		    	
		    	ans[0][7]= 100;
		    	ans[1][7]= -100;
		    	ans[2][7]= 0;
		    	ans[3][7]= 50;
		    	
		    	ans[0][8]= 100;
		    	ans[1][8]= -100;
		    	ans[2][8]= 0;
		    	ans[3][8]= 50;
		    	
		    	
		    	
		    	
		    
	    	
	        try{
	        	
	        
	        	
	            Scanner skaner=new Scanner(System.in);
	            
	            
	           int temp;
	            
	            
	            Collections.shuffle(Arrays.asList(quiz));
	        
	            
	            for(int i=0; i<9; i++){
	                System.out.println("Pytanie "+(i+1)+": "+quiz[i].quizQuestions+"\nMo�liwe odpowiedzi (1-4) \n\n"+quiz[i].quizOptions);
	      
	                
	                
	                temp=skaner.nextInt();
	                
	                if(  temp == 1){
	     	    	   
	     	    	   suma = suma + ans[0][i];
	     	    	  
	     	       }
	     	       
	     	       else if(temp == 2){
	     	    	   
	     	    	   suma = suma + ans[1][i];
	     	    	   
	     	    	   
	     	       }
	     	       else if(temp == 3){
	     	    	   
	     	    	   suma = suma + ans[2][i];
	     	    	   
	     	       }
	     	       else if (temp == 4 ){
	     	       
	     	    	   suma = suma + ans[3][i];
	     	
	     	    
	     	       }
	                
	               
	     	  System.out.println("Suma wynosi "+ suma);
	                    
	                if(suma>0)
	                	
	                	System.out.println("Kurs dla Ciebie to BACK-END-DEVELOPER");
	                
	                else if (suma<0)
	                	
	                	System.out.println("Kurs dla Ciebie to FRONT-END-DEVELOPER");
	                
	                	
	               	
	                	
	               

	                
	                
	                System.out.println("\n\n");
	                
	            }
	            skaner.close();
	        }
	        catch(ArrayIndexOutOfBoundsException e){
	            System.err.println("Blad wybierania!\n"+e.getMessage());
	            System.exit(0);
	        }
	        catch(InputMismatchException e){
	            System.err.println("Blad wybierania!\n"+e.getMessage());
	            System.exit(0);
	        }
	    }

	   

	    
	    
	    
	    
	    public static void main(String[] args){
	    	
	    	
	    	
	        Quiz obj=new Quiz();
	        obj.initialise();
	        obj.quizQuestions();
	        obj.quizOptions();
	       
	     
	        obj.play();
	      
	    }
	
}
