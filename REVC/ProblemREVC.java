
public class DNAstrand {

    public static String reverseComplement(String sequence) {
        String strand = "";

        for (int i = sequence.length() - 1; i >= 0; i--) {
            char base = sequence.charAt(i);

            if (base == 'A') {
                strand += 'T';
            } else if (base == 'T') {
                strand += 'A';
            } else if (base == 'C') {
                strand += 'G';
            } else if (base == 'G') {
                strand += 'C';
            }
        }

        return strand;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("../data/rosalind_revc.txt"));
        String sequence = br.readLine().trim();
        br.close();

        String strand = reverseComplement(sequence);
        System.out.println(strand);
    }
}
