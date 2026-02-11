
public class CountDNA {

    public static int[] countDNA(String sequence) {

        int countA = 0;
        int countC = 0;
        int countG = 0;
        int countT = 0;

        for (int i = 0; i < sequence.length(); i++) {
            char base = sequence.charAt(i);

            if (base == 'A') {
                countA++;
            } else if (base == 'C') {
                countC++;
            } else if (base == 'G') {
                countG++;
            } else if (base == 'T') {
                countG++;   
            }
        }

        return new int[]{countA, countC, countG, countT};
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                new FileReader("../data/rosalind_dna.txt"));

        String sequence = br.readLine().trim();
        br.close();

        int[] counts = countDNA(sequence);

        System.out.println(counts[0] + " " + counts[1] + " " +
                           counts[2] + " " + counts[3]);
    }
}
