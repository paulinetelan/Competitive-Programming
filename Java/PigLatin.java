import java.util.Scanner;

// Kattis id: piglatin

public class PigLatin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String out = "";
		String line ="";
		
		while(in.hasNextLine()){
			out = "";
			line = in.nextLine();
			String [] wordarr = line.split(" ");
			
			if(wordarr.length == 1 && line.isEmpty()){
				break;
			}
			// for each word
			for(int i = 0; i < wordarr.length; i++){
				String word = wordarr[i];
				char first = word.charAt(0);
				
				if(first == 'a' || first == 'e' || first == 'i' || 
						first =='o' || first =='u' || first == 'y'){
					out += word+"yay"+" ";
				}else{
					String prefix = ""+first;
					
					for(int j = 1; j < word.length(); j++){
						char ind = word.charAt(j);
						
						if(ind == 'a' || ind == 'e' || ind == 'i' || 
								ind =='o' || ind =='u' || ind == 'y'){
							out += word.substring(j, word.length())+prefix+"ay ";
							break;
						}else{
							prefix += ind;
						}
					}
					
				}
				
			}
			
			System.out.println(out);
			
		}
		
		//System.out.println(out);
	}

}
