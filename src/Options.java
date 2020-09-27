import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Options{
	Button proceed,logout;
	static public int pr[]= {350,200,120,50,400,150};
	
	Stage optionStage=new Stage();
	Options(){
		optionStage.getIcons().add(new Image ("file:images/download.png"));
		optionStage.setTitle("MC Donalds System");
		optionStage.setWidth(800);
		optionStage.setHeight(600);
		optionStage.setResizable(true);
		
		Group root=new Group();
		AddComponents(root);
		Scene optScene=new Scene(root);
		optionStage.setScene(optScene);
		optScene.setFill(Color.DARKSLATEGRAY);
		optionStage.show();
	}
	public void AddComponents(Group root) {
		
		//background Image
		
		ImageView img_background = new ImageView(new Image("file:images/01_macdonalds_countries-that-have-banned-mcdonald-s_678182368-editorial-ty-lim-1200x1200.jpg"));
		img_background.setOpacity(0.2);
		
		//LABEL OF Stock
		final Label text=new Label("Available Stock");
		text.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 50));
		text.setTextFill(Color.DARKBLUE);
		text.setTranslateX(240);
		text.setTranslateY(40);
		
		//men logo with head
		Image img= new Image("file:images/Ronald_McDonald.png");
		ImageView logo1=new ImageView(img);
		logo1.setX(430);
		logo1.setY(2);
		logo1.setFitHeight(120);
		logo1.setFitWidth(120);
		
		Text t = new Text(120, 150, "FOOD AVAILABLE\t\t\t\t\tPRICELIST");
		
		t.setFont(Font.font("Brush Script MT", FontWeight.BOLD, 34));
		t.setFill(Color.WHITE);
		
		Text t1 = new Text(100, 220, "CheeseBurger\t\t\t\t\t"+pr[0]);	    
		t1.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t1.setFill(Color.WHITE);
		
		Text t2 = new Text(100, 260, "SoftDrink\t\t\t\t\t"+pr[1]);	    
		t2.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t2.setFill(Color.WHITE);
		
		Text t3 = new Text(100, 300, "Ice Cream\t\t\t\t\t"+pr[2]);	    
		t3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t3.setFill(Color.WHITE);
		
		Text t4 = new Text(100, 340, "Rice\t\t\t\t\t"+pr[3]);	    
		t4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t4.setFill(Color.WHITE);
			
		Text t5 = new Text(100, 380, "FrenchFries\t\t\t\t\t"+pr[4]);	    
		t5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t5.setFill(Color.WHITE);
		
		Text t6 = new Text(100, 420, "Juice\t\t\t\t\t"+pr[5]);	    
		t6.setFont(Font.font("Times New Roman", FontWeight.BOLD, 22));
		t6.setFill(Color.WHITE);
	    
		//Button
		proceed = new Button();
		proceed.setText("Order Now >>");
		proceed.setPrefWidth(120);
		proceed.setTranslateX(610);
		proceed.setTranslateY(500);
		proceed.setTextFill(Color.BLACK);
		proceed.setStyle("-fx-font: 15 arial; -fx-base: #cf9a0f;");
		
		proceed.setOnAction(new EventHandler<ActionEvent>(){
			public void handle(ActionEvent arg0) {
			
				Order odr=new Order();
				((Stage )text.getScene().getWindow()).close();
				
			}
		});
		
		//LogOut
				logout = new Button();
				logout.setText("LogOut");
				logout.setPrefWidth(120);
				logout.setTranslateX(50);
				logout.setTranslateY(500);
				logout.setTextFill(Color.BLACK);
				logout.setStyle("-fx-font: 15 arial; -fx-base: #cf9a0f;");
				
				logout.setOnAction(new EventHandler<ActionEvent>(){
					public void handle(ActionEvent arg0) {
					
						LoginScreen ls = new LoginScreen();
						ls.start(optionStage);
						
					}
				});
				

		ObservableList<Node> child=root.getChildren();

		child.add(img_background);
		child.add(proceed);
		child.add(text);
		child.add(logo1);
		child.addAll(t,t1,t2,t3,t4,t5,t6);
		child.add(logout);
	}
}
