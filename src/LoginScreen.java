import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.Transition;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;


public class LoginScreen extends Application {
	
	TextField txt_username;
	
	private String username="user";
	private String password="pakistan";
	private String ownerid="owner";
	private String ownerpass="password";
	
	public static void main(String[] args) {
		launch(args);
	}
	public void start(Stage loginstage) 
	{
		loginstage.getIcons().add(new Image ("file:images/download.png"));
	
		loginstage.setTitle("Mc Donald's\nManagment Syatem");
		loginstage.setWidth(1000);
		loginstage.setHeight(800);
		loginstage.setResizable(true);
		Group root = new Group();
		addComponents(root);
		Scene sc=new Scene(root);
		sc.setFill(Color.RED);
		loginstage.setScene(sc);
		loginstage.show();	
	}
	


	private void Animation(Group root) {

			FadeTransition ft = new FadeTransition(Duration.millis(3000), root);
			ft.setFromValue(0.0);
			ft.setToValue(1.0);
			ft.play();
			}
public void addComponents(Group root)
{
	//background Image
	Animation(root);
	ImageView imgbackground = new ImageView(new Image("file:images/01_macdonalds_countries-that-have-banned-mcdonald-s_678182368-editorial-ty-lim-1200x1200.jpg"));
	imgbackground.setOpacity(0.2);
			
	Image img= new Image("file:images/download.png");
	ImageView imgview=new ImageView(img);
	imgview.setX(295);
	imgview.setY(110);
	
	imgview.setFitHeight(190);
	imgview.setFitWidth(190);
	
	 
	
	//LABEL OF USERNAME
	Label lblusername=new Label("Username");
	lblusername.setFont(Font.font("Roman", FontWeight.BOLD, 20));
	lblusername.setTextFill(Color.LIGHTBLUE);
	lblusername.setTranslateX(220);
	lblusername.setTranslateY(340);
	
	
	//TEXTFIELD OF USERNAME
	 txt_username=new TextField();
	txt_username.setPrefWidth(200);
	txt_username.setTranslateX(305);
	txt_username.setTranslateY(340);
	

	
	//LABEL OF PASSWORD
	Label lblpassword =new Label("Password");
	lblpassword.setFont(Font.font("Roman", FontWeight.BOLD, 20));
	lblpassword.setTextFill(Color.LIGHTBLUE);
	lblpassword.setTranslateX(220);
	lblpassword.setTranslateY(380);
	
	//TEXTFIELD of PASSOWORD
	final PasswordField txt_password=new PasswordField();
	txt_password.setPrefWidth(200);
	txt_password.setTranslateX(305);
	txt_password.setTranslateY(380);
	
	
	//LOGIN BUTTON
	Button btn=new Button();
	btn.setText("Log In");
	btn.setPrefWidth(200);
	btn.setTranslateX(305);
	btn.setTranslateY(440);
	btn.setTextFill(Color.GREENYELLOW);
	btn.setStyle("-fx-font: 15 roman; -fx-base: #cf9a0f;");
	
	//Welcome Animation
	final String content = "WELCOME TO MC DONALD'S";
	
    final Text wellCome = new Text(10, 20, "WELCOME TO MC DONALD'S");
    wellCome.setTranslateX(110);
    wellCome.setTranslateY(50);
    wellCome.setFill(Color.WHITE);
   wellCome.setFont(Font.font("Verdana", FontWeight.BOLD, 40));
    final Animation animation = new Transition() {
        {
            setCycleDuration(Duration.millis(6000));
        }
    
        protected void interpolate(double frac) {
            final int length = content.length();
            final int n = Math.round(length * (float) frac);
            wellCome.setText(content.substring(0, n));
        }
    
    };
    animation.play();

	btn.setOnAction(new EventHandler<ActionEvent>(){
		public void handle(ActionEvent Login) {
			if (txt_username.getText().equals(username) && txt_password.getText().equals(password))
			{
			((Stage )txt_username.getScene().getWindow()).close();
			Options opt=new Options();
			}
			else  if (txt_username.getText().equals(ownerid) && txt_password.getText().equals(ownerpass))
			{
				Stage st=new Stage();
				st.setTitle("Owner information");
				st.getIcons().add(new Image ("file:images/download.png"));
				st.setTitle("Mc DOnald Managment");
				st.setWidth(800);
				st.setHeight(600);
				st.setResizable(true);
				Group root1 = new Group();
				//addComponents(root);
				Scene sc1=new Scene(root1);
				sc1.setFill(Color.DARKSLATEGRAY);
				st.setScene(sc1);

				st.show();
				Alert alrt2=new Alert(AlertType.INFORMATION);
				alrt2.setTitle("Owner Log In");
				alrt2.setHeaderText(null);
				alrt2.setContentText("Owner Log In Successful");
				
				alrt2.showAndWait();
			}
			else {
				Alert alrt1=new Alert(AlertType.ERROR);
				alrt1.setTitle("Log In Failed");
				alrt1.setHeaderText(null);
				alrt1.setContentText("Invalid Username or Password ");
				alrt1.showAndWait();
			}
		}
	});
	
	ObservableList<Node> child=root.getChildren();
	child.add(imgbackground);
	child.add(imgview);
	
	child.add(lblusername);
	child.add(btn);
	child.add(txt_username);
	child.add(txt_password);
	child.add(lblpassword);
	child.add(wellCome);
	

}
	
	

}