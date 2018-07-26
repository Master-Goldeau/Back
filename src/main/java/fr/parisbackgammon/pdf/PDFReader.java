package fr.parisbackgammon.pdf;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader {

	public static void main(String args[]) throws IOException {

		// Step 0 télécharger le fichier depuis l'URL reçue
		String host = "https://www.helloasso.com/associations/vie-d-eau-paris-backgammon/evenements/tournoi-des-kubistes/paiement-attestation/4067167?hash=0BEA20ECA617232F73C48C9145EC4A980EEFAA83&utm_source=user&utm_medium=email-transac&utm_campaign=CONFIRMATION_INSCRIPTION";
		URL url = new URL(host);

		URLConnection connection = url.openConnection();
		InputStream input = connection.getInputStream();

		// Step 1: Loading an Existing PDF Document
		PDDocument document = PDDocument.load(input);

		// Step 2: Instantiate the PDFTextStripper Class
		// The PDFTextStripper class provides methods to retrieve text from a PDF document.
		PDFTextStripper pdfStripper = new PDFTextStripper();

		// Step 3: Retrieving the Text
		String text = pdfStripper.getText(document);
		String[] arrOfStr = text.split("\n");

		// Vérifier que "Contributeur" est bien dans le tableau et donner le numéro de sa ligne.

		for (int i = 0; i < arrOfStr.length; i++) {
			if (arrOfStr[i].contains("Contributeur :")) {

				System.out.println("Contributeur est sur la ligne " + i);
				System.out.println(arrOfStr[i + 1] + arrOfStr[i + 2] + arrOfStr[i + 3] + arrOfStr[i + 4]);

				String[] prenomNom = arrOfStr[i + 1].replace('\u00A0', ' ').split(" ");

				for (int p = 0; p < prenomNom.length; p++) {

					System.out.println("À l'emplacement " + p + " du tableau nous avons = " + prenomNom[p]);

				}
			}

		}

		// step 4 : Close the document.
		document.close();

	}
}
