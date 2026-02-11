
public class DNAtoRNA {

    public static String dna2rna(String sequence) {
        return sequence.replace('T', 't');   
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("../data/rosalind_rna.txt"));

        String sequence = br.readLine().trim();
        br.close();

        String result = dna2rna(sequence);

        System.out.println(result);
    }
}
