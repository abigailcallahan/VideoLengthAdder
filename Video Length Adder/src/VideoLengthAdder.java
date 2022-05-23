import java.util.Scanner;

public class VideoLengthAdder
	{
		public static void main(String[] args)
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("FIRST VIDEO");
				System.out.println("\tHow many hours do you want the first video to be?");
				int hours1 = userInput.nextInt();
				System.out.println("\tHow many minutes do you want the first video to be?");
				int minutes1 = userInput.nextInt();
				System.out.println("\tHow many seconds do you want the first video to be?");
				int seconds1 = userInput.nextInt();
				
				System.out.println("\nSECOND VIDEO");
				System.out.println("\tHow many hours do you want the second video to be?");
				int hours2 = userInput.nextInt();
				System.out.println("\tHow many minutes do you want the second video to be?");
				int minutes2 = userInput.nextInt();
				System.out.println("\tHow many seconds do you want the second video to be?");
				int seconds2 = userInput.nextInt();
				
				System.out.println("Ok your two videos are: ");
				System.out.println("\n" + hours1 + ":" + minutes1 + ":" + seconds1);
				System.out.println(hours2 + ":" + minutes2 + ":" + seconds2);
				
				int addHours = hours1 + hours2;
				int addMinutes = minutes1 + minutes2;
				int addSeconds = seconds1 + seconds2;
				
				if(addSeconds > 59)
					{
					addSeconds = addSeconds % 60;
					addMinutes++;
					}
				
				if(addMinutes > 59) 
					{
					addMinutes = addMinutes % 60;
					addHours++;
					}

				System.out.println("Your total duration is " + addHours + ":" + addMinutes + ":" + addSeconds);

			}

	}
