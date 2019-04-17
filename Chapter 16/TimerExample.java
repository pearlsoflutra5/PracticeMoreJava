import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.TextField;
import javafx.util.Duration;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.geometry.Pos;
import javafx.scene.text.Font;
import javafx.scene.input.KeyCode;
import javafx.animation.Timeline;
import javafx.animation.KeyFrame;

public class TimerExample extends Application {
	protected TextField count = new TextField();
	protected Media media = new Media(
		"https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3");
	protected MediaPlayer mediaPlayer = new MediaPlayer(media);
	protected Timeline animation;

	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {
		// Set text field properties
		count.setAlignment(Pos.CENTER);
		count.setFont(Font.font(60));
		count.setPrefColumnCount(4);
		
		// Set meidaplayer to loop
		mediaPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		
		// extra media stuff
		//mediaPlayer.setVolume();
		//mediaPlayer.setRate(2);
		

		// Create a pane
		StackPane pane = new StackPane(count);

		// Create animation for stopwatch
		animation = new Timeline(
			new KeyFrame(Duration.millis(1000), e -> run()));
		animation.setCycleCount(Timeline.INDEFINITE);

		count.setOnKeyPressed(e -> {
			if (e.getCode() == KeyCode.ENTER) {
				animation.play();
			}
		});

		// Create a scene and place it in the stage
		Scene scene = new Scene(pane);
		primaryStage.setTitle("Exercise_16_21"); // Set the Stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	/* Animate the stopwatch and controls mediaPlayer */
	private void run() {
		if (Integer.parseInt(count.getText()) > 0) {
			mediaPlayer.pause();
			//mediaPlayer.seek(Duration.ZERO);
			count.setText(String.valueOf(Integer.parseInt(count.getText()) - 1));
		}
		if (count.getText().equals("0")) {
			animation.pause();
			mediaPlayer.play();
		}
	}
}