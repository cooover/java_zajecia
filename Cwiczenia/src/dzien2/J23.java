package dzien2;
import static java.lang.Math.*;
import java.io.FilterInputStream;
import java.util.Locale;
import java.util.Scanner;

public class J23 {

	public static void main(String[] args) {
			Scanner input = new Scanner(new FilterInputStream(System.in) {
				@Override
				public void close() {}
			});
			input.useLocale(Locale.US);
			System.out.println("Podaj x1: ");
			double x1 = input.nextDouble();
			System.out.println("Podaj y1: ");
			double y1 = input.nextDouble();
			System.out.println("Podaj x2: ");
			double x2 = input.nextDouble();
			System.out.println("Podaj y2: ");
			double y2 = input.nextDouble();
			double dist = sqrt(pow((x1-x2),2)+(pow((cos(x1*PI/180)*(y2-y1)),2)))*111;
			System.out.println("Odleg�o�� mi�dzy tymi punktami wynosi: "+round(dist*100)/100d + " km.");
			input.close();

	}

}
