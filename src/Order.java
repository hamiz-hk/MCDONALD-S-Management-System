import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.print.PrinterJob;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

 
public class Order {
	
	Button cart,back;
	Stage orderStage = new Stage();
	Button ok,backbill;
	Stage billStage;
	TextField q1,q2,q3,q4,q5,q6;
	mcdonaldmenu menu;
	Text txt1,txt2,txt3,txt4,txt5,txt6;
	CheckBox cb1,cb2,cb3,cb4,cb5,cb6;
	Label lb1,lb2,lb3,lb4,lb5,lb6;
	Label lb1p,lb2p,lb3p,lb4p,lb5p,lb6p; 
	Options o;
	double p1,p2,p3,p4,p5,p6;
	double totalbill;
	Order(){
		orderStage.getIcons().add(new Image ("file:images/download.png"));
		orderStage.setTitle("Mc Donald's");
		orderStage.setWidth(800);
		orderStage.setHeight(600);
		orderStage.setResizable(true);
		
		Group root=new Group();
		AddComponents(root);
		Scene orderScene=new Scene(root);
		orderStage.setScene(orderScene);
	//	orderScene.setFill(Color.DARKSLATEGRAY);
		orderStage.show();
	}

	/*public boolean validation() {
		if(q1.getText().equals(null) || q2.getText().equals(null) || q3.getText().equals(null)
				|| q4.getText().equals(null) || q5.getText().equals(null) || q6.getText().equals(null) );
		return false;
			} 
	*/
	
	public void error1(){
		Alert alrt1=new Alert(AlertType.ERROR);
		alrt1.setTitle("Selction Error");
		alrt1.setHeaderText("error");
		alrt1.setContentText("Please select atleast one Item");
		alrt1.showAndWait();
	}
	
public void AddComponents(Group root) {
		
		//background Image
		
		ImageView img_background = new ImageView(new Image("file:images//01_macdonalds_countries-that-have-banned-mcdonald-s_678182368-editorial-ty-lim-1200x1200.jpg"));
				img_background.setOpacity(0.2);
				
		//heading
		final Label select=new Label("Select Items");
		select.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 40));
		select.setTextFill(Color.ALICEBLUE);
		select.setTranslateX(240);
		select.setTranslateY(30);
		
		//items
		Text t = new Text(120, 150, "ITEMS\t\t\t\t\t\tQUANTITY");	    
		t.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 40));
		t.setFill(Color.LIGHTBLUE);
		
		Text t1 = new Text(100, 220, "ChesseBurger");	    
		t1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t1.setFill(Color.LIGHTBLUE);
		
		Text t2 = new Text(100, 260, "SoftDrink");	    
		t2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t2.setFill(Color.LIGHTBLUE);
		
		Text t3 = new Text(100, 300, "IceCream");	    
		t3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t3.setFill(Color.LIGHTBLUE);
		
		Text t4 = new Text(100, 340, "Rice");	    
		t4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t4.setFill(Color.LIGHTBLUE);
			
		Text t5 = new Text(100, 380, "FrenchFries");	    
		t5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t5.setFill(Color.LIGHTBLUE);
		
		Text t6 = new Text(100, 420, "Juice");	    
		t6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t6.setFill(Color.LIGHTBLUE);
		
		//quantity
		
		q1=new TextField();
		q1.setPrefWidth(100);
		q1.setTranslateX(550);
		q1.setTranslateY(200);
		
		q2=new TextField();
		q2.setPrefWidth(100);
		q2.setTranslateX(550);
		q2.setTranslateY(240);

		q3=new TextField();
		q3.setPrefWidth(100);
		q3.setTranslateX(550);
		q3.setTranslateY(280);

		q4=new TextField();
		q4.setPrefWidth(100);
		q4.setTranslateX(550);
		q4.setTranslateY(320);

		q5=new TextField();
		q5.setPrefWidth(100);
		q5.setTranslateX(550);
		q5.setTranslateY(360);

		final TextField q6 = new TextField();
		q6.setPrefWidth(100);
		q6.setTranslateX(550);
		q6.setTranslateY(400);

		//calcuator button
		cart= new Button();
		cart.setText("Add To Cart");
		cart.setPrefWidth(120);
		cart.setTranslateX(610);
		cart.setTranslateY(500);
		cart.setTextFill(Color.BLACK);
		cart.setStyle("-fx-font: 15 arial; -fx-base: #cf9a0f;");
		
		
		//CHEKCBOXES
		cb1=new CheckBox();
		cb2=new CheckBox();
		cb3=new CheckBox();
		cb4=new CheckBox();
		cb5=new CheckBox();
		final CheckBox cb6 = new CheckBox();
		
		cb1.setTranslateX(70);
		cb1.setTranslateY(200);    
		
		cb2.setTranslateX(70);
		cb2.setTranslateY(240);    
		
		cb3.setTranslateX(70);
		cb3.setTranslateY(280);    
		
		cb4.setTranslateX(70); 	
		cb4.setTranslateY(320);    
		
		cb5.setTranslateX(70);
		cb5.setTranslateY(360);    
		
		cb6.setTranslateX(70);
		cb6.setTranslateY(400);    
		
		
		cart.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent event) {
			menu = new mcdonaldmenu();
				if (cb1.isSelected()||cb2.isSelected()||cb3.isSelected()||cb4.isSelected()||cb5.isSelected()||cb6.isSelected())
				{
				
				if(cb1.isSelected())
				{
					mcdonaldmenu.setCheeseburger(Integer.parseInt(q1.getText()));
					//System.out.println("IN CB1");
				}
				 
				if (cb2.isSelected())
				{
					mcdonaldmenu.setSoftdrink(Integer.parseInt(q2.getText()));
					//System.out.println("IN CB2");
				}
				
				if (cb3.isSelected()) 
				{
					mcdonaldmenu.setIcecream(Integer.parseInt(q3.getText()));
					//System.out.println("IN CB3");
				}
				
				if (cb4.isSelected()) 
				{
					mcdonaldmenu.setRice(Integer.parseInt(q4.getText()));
					//System.out.println("IN CB4");
				}
				
				if (cb5.isSelected()) 
				{
					mcdonaldmenu.setFrenchfries(Integer.parseInt(q5.getText()));
					//System.out.println("IN CB5");
				}
				
				if (cb6.isSelected()) 
				{
					mcdonaldmenu.setJuice(Integer.parseInt(q6.getText()));
					//System.out.println("IN CB6");
				}
				
								
				
				
		
		//Calculating total
		handleOptions(cb1, cb2, cb3, cb4, cb5, cb6);

		totalbill+=p1+p2+p3+p4+p5+p6;
				
				String data ="";
				try{
				data += "\n"+ "Burger Quantity:"+ mcdonaldmenu.getCheeseburger() +
						"|"+ "Drink Quantity:" + mcdonaldmenu.getSoftdrink()+ 
						"|"+ "Icecream Quantity: " +mcdonaldmenu.getIcecream()+
						"|"+"Rice Quantity:" +mcdonaldmenu.getRice()+
						"|" + "Fries Quantity:" +mcdonaldmenu.getFrenchfries()+
						"|"+"Juice Quantity:" +mcdonaldmenu.getJuice()+
						"|"+"Total Bill:"+totalbill;
				
				    
			           FileWriter fw=new FileWriter("file://../data/data.txt",true);    
			           fw.write(data);    
			           fw.close();    
				}
				
				catch(IOException e){
			        	  System.out.println(e);
			        	  }
				
			
				billStage = new Stage();
				billStage.getIcons().add(new Image ("file:images/download.png"));
				billStage.setTitle("MC DONALD'S");
				billStage.setWidth(400);
				billStage.setHeight(600);
				billStage.setResizable(true);

				Group root_bill=new Group();
				AddComponents1(root_bill);
				Label item=new Label();
				
				//ITEM LABEL 
				item.setText("Items       "+"Quantities      "+"Price");
				item.setTextFill(Color.WHITE);
				item.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 30));
				item.setTranslateX(20);
				item.setTranslateY(100);
			
				
				//conditions to add in children 
				if(cb1.isSelected())
				{
					root_bill.getChildren().addAll(lb1,lb1p);
					
				}
				
				if (cb2.isSelected())
				{
					root_bill.getChildren().addAll(lb2,lb2p);
					
				}
				if (cb3.isSelected()) 
				{
					root_bill.getChildren().addAll(lb3,lb3p);
					}
				if (cb4.isSelected()) 
				{
					root_bill.getChildren().addAll(lb4,lb4p);
					}
				if (cb5.isSelected()) 
				{
					root_bill.getChildren().addAll(lb5,lb5p);
						}
			
				if (cb6.isSelected()) 
				{
					root_bill.getChildren().addAll(lb6,lb6p);
						}
				
				/*
				root_bill.getChildren().add(lb2);
				root_bill.getChildren().add(lb3);

				root_bill.getChildren().add(lb4);

				root_bill.getChildren().add(lb5);

				root_bill.getChildren().add(lb6);

				*/
				
				
				
				Label total=new Label("Total \\= "+totalbill);
				total.setTextFill(Color.WHITE);
				total.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 30));
				total.setTranslateX(150);
				total.setTranslateY(400);
				
				root_bill.getChildren().addAll(item,total);
				
				Scene billScene=new Scene(root_bill);
				billStage.setScene(billScene);
				billScene.setFill(Color.LIGHTBLUE);
				billStage.show();
				
				((Stage )select.getScene().getWindow()).close();
				}
				
			
			else {
				error1();
			}
			}
		});
		
		
		//Back Button
		back = new Button();
		back.setText("<< View Items");
		back.setPrefWidth(120);
		back.setTranslateX(50);
		back.setTranslateY(500);
		back.setTextFill(Color.BLACK);
		back.setStyle("-fx-font: 15 arial; -fx-base: #cf9a0f;");
		
		back.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent arg0) {
			
				((Stage )select.getScene().getWindow()).close();
				Options op=new Options();
			}
		});
	
		
		
		//cart logo with head
				Image img= new Image("file:images/cart.png");
				ImageView logo1=new ImageView(img);
				logo1.setX(410);
				logo1.setY(2);
				logo1.setFitHeight(120);
				logo1.setFitWidth(120);
				
		
		ObservableList<Node> child=root.getChildren();

		child.add(img_background);
		child.add(cart);
		child.add(select);
		child.add(logo1);
		child.add(back);
		child.addAll(cb1,cb2,cb3,cb4,cb5,cb6);
		child.addAll(t,t1,t2,t3,t4,t5,t6);
		child.addAll(q1,q2,q3,q4,q5,q6);

		
	}

public void AddComponents1(Group root1) {
		
		//background Image
		
				ImageView img_background = new ImageView(new Image("file:images/bakery-background-12.jpg"));
				img_background.setOpacity(0.2);
				
		//heading
		Label select=new Label("Bill");
		select.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 40));
		select.setTextFill(Color.ALICEBLUE);
		select.setTranslateX(120);
		select.setTranslateY(15);
		
		//logo
		Image img= new Image("file:images/billLogo.png");
		final ImageView logo1=new ImageView(img);
		logo1.setX(175);
		logo1.setY(8);
		logo1.setFitHeight(60);
		logo1.setFitWidth(100);
		
		//cart button
		ok = new Button();
		ok .setText("Done!");
		ok.setPrefWidth(120);
		ok.setTranslateX(130);
		ok.setTranslateY(500);
		ok.setTextFill(Color.BLACK);
		ok.setStyle("-fx-font: 15 arial; -fx-base: #cf9a0f;");
		ok.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent Login) {
				Alert alrt=new Alert(AlertType.INFORMATION);
				alrt.setTitle("MC DOnald'S");
				alrt.setHeaderText(null);
				alrt.setContentText("Thank you for Shopping!");
				alrt.showAndWait();
				LoginScreen ls = new LoginScreen();
				((Stage )logo1.getScene().getWindow()).close();				
				//to open login screen window
				ls.start(billStage);
				

				
			}});

		ObservableList<Node> child=root1.getChildren();

		child.add(img_background);
		child.add(ok);
		child.add(select);
		child.add(logo1);
		/*child.add(lb1);
		child.add(lb2);
		child.add(lb3);
		child.add(lb4);
		child.add(lb5);
		child.add(lb6);*/
}	
public void handleOptions(CheckBox c1,CheckBox c2,CheckBox c3,CheckBox c4,CheckBox c5,CheckBox c6){
	
	if(c1.isSelected())
	{
		
		p1=	Options.pr[0]*mcdonaldmenu.getCheeseburger();
		

		lb1p =new Label(Double.toString(p1));
		lb1p.setTranslateX(300);
		lb1p.setTranslateY(150);
		
				lb1p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb1p.setTextFill(Color.ALICEBLUE);
				
		lb1=new Label("Burger\t\t\t"+mcdonaldmenu.getCheeseburger());
			
		
		lb1.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
		lb1.setTextFill(Color.ALICEBLUE);
		lb1.setTranslateX(20);
		lb1.setTranslateY(150);
	   
	}
	
	if (c2.isSelected())
	{
		p2=	Options.pr[1]*mcdonaldmenu.getSoftdrink();
		

		lb2p =new Label(Double.toString(p2));
		lb2p.setTranslateX(300);
		lb2p.setTranslateY(170);
		//LABEL 
				lb2p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb2p.setTextFill(Color.ALICEBLUE);
				
		//System.out.println("in p2");
		//LABEL OF Snacks
		lb2=new Label("SoftDrink\t\t\t   "+mcdonaldmenu.getSoftdrink());
		lb2.setFont(Font.font("Times new Roman", FontWeight.BOLD, 18));
		lb2.setTextFill(Color.ALICEBLUE);
		lb2.setTranslateX(20);
		lb2.setTranslateY(170);
	}
	if (c3.isSelected()) 
	{
		p3=	Options.pr[2]*mcdonaldmenu.getIcecream();
		

		lb3p =new Label(Double.toString(p3));
		lb3p.setTranslateX(300);
		lb3p.setTranslateY(190);
		//LABEL OF CAKE
				lb3p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb3p.setTextFill(Color.ALICEBLUE);
				
		//System.out.println("in p3");
		//=LABEL OF colddrinks
		lb3=new Label("Icecream\t\t   "+mcdonaldmenu.getIcecream());
		lb3.setFont(Font.font("Times new Roman", FontWeight.BOLD, 18));
		lb3.setTextFill(Color.ALICEBLUE);
		lb3.setTranslateX(20);
		lb3.setTranslateY(190);
	}
	if (c4.isSelected()) 
	{
		p4=	Options.pr[3]*mcdonaldmenu.getRice();
		
		lb4p =new Label(Double.toString(p4));
		lb4p.setTranslateX(300);
		lb4p.setTranslateY(210);
		//LABEL OF CAKE
				lb4p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb4p.setTextFill(Color.ALICEBLUE);
		
		//System.out.println("in p4");
		//LABEL OF pastry
		lb4=new Label("Rice\t\t\t   "+mcdonaldmenu.getRice());
		lb4.setFont(Font.font("Times new Roman", FontWeight.BOLD, 18));
		lb4.setTextFill(Color.ALICEBLUE);
		lb4.setTranslateX(20);
		lb4.setTranslateY(210);
	}
	if (c5.isSelected()) 
	{
		p5=	Options.pr[4]*mcdonaldmenu.getFrenchfries();
		
		lb5p =new Label(Double.toString(p5));
		lb5p.setTranslateX(300);
		lb5p.setTranslateY(230);
		//LABEL OF CAKE
				lb5p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb5p.setTextFill(Color.ALICEBLUE);
		
		//System.out.println("in p5");
		//LABEL OF icecake
		lb5=new Label("FrenchFries\t\t\t   "+mcdonaldmenu.getFrenchfries());
		lb5.setFont(Font.font("Times new Roman", FontWeight.BOLD, 18));
		lb5.setTextFill(Color.ALICEBLUE);
		lb5.setTranslateX(20);
		lb5.setTranslateY(230);
	
	}
	if (c6.isSelected()) 
	{
	
		p6=	Options.pr[5]*mcdonaldmenu.getJuice();
		lb6p =new Label(Double.toString(p6));
		lb6p.setTranslateX(300);
		lb6p.setTranslateY(250);
		//LABEL OF CAKE
				lb6p.setFont(Font.font("Times new Roman", FontWeight.BOLD, 20));
				lb6p.setTextFill(Color.ALICEBLUE);
		
	
		//System.out.println("in p6");
		//LABEL OF juice
		lb6=new Label("Juice\t\t\t   "+mcdonaldmenu.getJuice());
		lb6.setFont(Font.font("Times new Roman", FontWeight.BOLD, 18));
		lb6.setTextFill(Color.ALICEBLUE);
		lb6.setTranslateX(20);
		lb6.setTranslateY(250);
	
	}
	
	
	
	
}
}

	 	
	

