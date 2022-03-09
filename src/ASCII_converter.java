import java.util.ArrayList;

public class ASCII_converter implements TextConverter {

	int converted_char;
	ArrayList<String> converted_parag;
	 
	@Override
	public void convert_character(char c) {
		System.out.println("Converting a character to its ASCII code:");
		converted_char = (int)c;
		System.out.println(c+ " --> " + converted_char);
	}

	@Override
	public void convert_paragraph(String text) {
		
		converted_parag = new ArrayList<>(); 
		
		// split the text into words using the empty space as a delimiter
		String[] array_words = text.split(" ");
		
		for(int i=0; i< array_words.length ; i++) {
			
			// for each word, do the following steps:
			
			// step 1: declare a temporary variable of type String to save your generated word
			String word_generated = "";
			
			// step 2: generate the corresponding ASCII code of the word and save it in your temporary variable
			for(int j=0 ; j < array_words[i].length(); j++)
				// convert each character to its corresponding code and concatenate it with your word_generated
				word_generated += (int)array_words[i].charAt(j);
				
			// step 3: once the whole word is converted, add your converted word to the list
			converted_parag.add(word_generated);
			
		}
		
		System.out.println("Converting a text to its ASCII code:");
		System.out.println(converted_parag.toString());

	}

}
